package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ClientUpdaterApp
{
    public static void main( String[] args )
    {
        org.springframework.boot.SpringApplication.run(ClientUpdaterApp.class, args);
    }
}
