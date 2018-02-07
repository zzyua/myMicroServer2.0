package com.zyu.demos.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Kafka 消费者示例
 */
@Component
public class ConsumerKafka {

    private static  final Logger logger = LoggerFactory.getLogger(ConsumerKafka.class);
    private Gson gson = new GsonBuilder().create();

    /**
     * 消费者监听消费信息
     * @param content
     */
    //TODO kafka 放开注视，启动kafka消费者
//    @KafkaListener(topics = "test")
    public  void receiveAndProcessMessage(String content){
        logger.info("kafka 消费者接收到到消息是:{}",content);
        KafkaMessage  message = gson.fromJson(content,KafkaMessage.class);
    }
}
