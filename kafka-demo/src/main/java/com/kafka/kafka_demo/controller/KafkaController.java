package com.kafka.kafka_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class KafkaController {

    @GetMapping(value = "/dummy" , produces = "Application/JSON")
    public String getTestData()
    {
        return "Hello is here";
    }
}
