package com.example.producer.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.producer.Entity.Message;
import com.example.producer.Service.kafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ApiController {

    @Autowired
    kafkaService service;

    @PostMapping("/name")
    public String postMethodName(@RequestBody Message msg) {
        //TODO: process POST request
        service.sendMessage(msg);
        return "Message is sent";
    }
    
}
