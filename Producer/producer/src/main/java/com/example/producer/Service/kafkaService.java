package com.example.producer.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.producer.Entity.Messagetext;


@Service
public class kafkaService {
    public final KafkaTemplate<String ,Messagetext> template;
   
    
    public kafkaService(KafkaTemplate<String, Messagetext> template){
        this.template=template;
    } 

    public void sendMessage(Messagetext msg){
        template.send("user-topic", msg);
        System.out.println("Message sent");
    }

}
