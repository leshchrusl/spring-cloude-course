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
                .route("client-service", r -> r
                        .path("/api/client/**")
//                        .filters(f -> f
//                                .removeRequestHeader("spring-cloud-course"))
                        .uri("lb://client-service")) // адрес Client Service
                .build();
    }

    @Bean
    public RouteLocator routeLocatorForClientUpdate(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("client-update", r -> r
                        .path("/api/update")
//                        .filters(f -> f
//                                .removeRequestHeader("spring-cloud-course"))
                        .uri("lb://client-update")) // адрес Client Service
                .build();
    }
}
