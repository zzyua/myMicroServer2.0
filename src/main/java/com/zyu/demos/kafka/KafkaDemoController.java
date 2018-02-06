package com.zyu.demos.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka",method = {RequestMethod.GET,RequestMethod.POST})
public class KafkaDemoController {


    @Autowired
    private ProducerKafka producer;


    @GetMapping(value = "/sendmsg")
    public  String sendKafkaMsg(){

        producer.sendMessage();
        return "success" ;
    }

    @PostMapping("/hello")
    public  String hello(){
        return "hello";
    }


}
