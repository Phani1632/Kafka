package com.example.producer.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.producer.Entity.Message;

@Service
public class kafkaService {
    public final KafkaTemplate<String ,Message> template;
    
    public kafkaService(KafkaTemplate<String, Message> template){
        this.template=template;
    } 

    public void sendMessage(Message msg){
        template.send("user-topic", msg);
        System.out.println("Message sent");
    }
}
