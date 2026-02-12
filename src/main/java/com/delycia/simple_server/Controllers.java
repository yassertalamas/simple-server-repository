package com.delycia.simple_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controllers {

    @GetMapping("/saludo")
    public String oneEndpoint() {
        return "Hola! /api/v1/saludo";
    }
}
