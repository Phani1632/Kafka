package com.example.producer.Controller;

import org.springframework.web.bind.annotation.RestController;


import com.example.producer.Entity.Messagetext;
import com.example.producer.Service.kafkaService;
import com.example.producer.Service.kafkaServiceString;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ApiController {

    @Autowired
    kafkaService service;

    @Autowired
    kafkaServiceString serviceStr;

    @PostMapping("/name")
    public String postMethodName(@RequestBody Messagetext msg) {
        //TODO: process POST request
        service.sendMessage(msg);
        return "Message is sent";
    }

    @PostMapping("/String")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        serviceStr.sendMessage(entity);
        return "String is sent";
    }
    
    
}
