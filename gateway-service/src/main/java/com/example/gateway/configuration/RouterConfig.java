package com.example.gateway.configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("book_route", r -> r
                        .path("/api/book/all")
                        .filters(f -> f
                                .removeRequestHeader("spring-cloud-course"))
                        .uri("http://localhost:8081")) // адрес Client Service
                .build();
    }
}
