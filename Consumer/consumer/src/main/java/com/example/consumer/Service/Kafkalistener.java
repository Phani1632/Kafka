package com.example.consumer.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.consumer.Entity.Message;

@Service
public class Kafkalistener {

    @KafkaListener(topics ="user-topic")
    public void consume(Message msg){
       System.out.println(msg.getFirstName());
    }

    @KafkaListener(topics = "test-topic")
    public void consume(String str){
        System.out.println(str);
    }
    
}
