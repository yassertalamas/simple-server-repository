package com.delycia.simple_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controllers {

    @Value("${DB_PASSWORD}")
    public String valorcito;
    @GetMapping("/saludo")
    public String oneEndpoint() {
        return "Hello World! /api/v1/saludoooooo " + valorcito;
    }
}

