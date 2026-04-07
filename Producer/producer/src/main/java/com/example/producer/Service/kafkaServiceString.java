package com.example.producer.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class kafkaServiceString {
    public final KafkaTemplate<String ,String> template;
   
    
    public kafkaServiceString(KafkaTemplate<String, String> template){
        this.template=template;
    } 

    public void sendMessage(String msg){
        template.send("test-topic", msg);
        System.out.println("Message sent");
    }
}
