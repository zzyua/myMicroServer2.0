package com.zyu.demos.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Kafka 消息生产者
 */
@Component
public class ProducerKafka {

    @Autowired
    private KafkaTemplate kafkaTemplate ;

    @Value("${myconfg.kafka.queueTopics}")
    private  String queueTopics ;

    private Gson gson = new GsonBuilder().create();


    public  void sendMessage(){
        KafkaMessage message = new KafkaMessage();
        message.setId(1L);
        message.setMsg("崔牛逼是来粗");
        message.setSendTime(new Date());
        //send(topic , data)
//        kafkaTemplate.send("test" , gson.toJson(message));
        kafkaTemplate.send(queueTopics, gson.toJson(message));
    }
}
