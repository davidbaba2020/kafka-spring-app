package com.decadave.kafkaspring.controller;

import com.decadave.kafkaspring.kafka.JsonKafkaProducer;
import com.decadave.kafkaspring.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController
{

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer)
    {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish-json-message")
    public ResponseEntity<String> publishJson (@RequestBody User user)
    {
        jsonKafkaProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic ");
    }
}
