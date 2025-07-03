package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-service")
public interface BookFeign {

    @GetMapping("/api/client/test")
    String getMessage();

}
