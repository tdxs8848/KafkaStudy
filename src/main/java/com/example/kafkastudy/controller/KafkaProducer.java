package com.example.kafkastudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    // 发送消息
    @GetMapping("/kafka/normal/{topic}/{message}")
    public void sendMessage1(@PathVariable("topic") String topic,@PathVariable("message") String normalMessage) {
        kafkaTemplate.send(topic, normalMessage);

    }
}