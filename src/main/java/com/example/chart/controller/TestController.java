package com.example.chart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<String> Hello(){
        return ResponseEntity.ok().body("sd");
    }

}
