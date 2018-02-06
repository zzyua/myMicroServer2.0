package com.zyu;

import com.zyu.demos.kafka.ProducerKafka;
import com.zyu.demos.stsrtupRunner.StartupRunner;
import com.zyu.demos.stsrtupRunner.TaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext app =  SpringApplication.run(Application.class, args);

//		while(true){
//			ProducerKafka sender = app.getBean(ProducerKafka.class);
//			sender.sendMessage();
//			Thread.sleep(500);
//		}
	}

	/**
	 * 注册bean
	 * @return StartupRunner的Bean
	 */
	@Bean
	public StartupRunner startupRunner(){
		return  new StartupRunner();
	}

	/**
	 * 注册bean
	 * @return TaskRunner的Bean
	 */
	@Bean
	public TaskRunner taskRunner(){
		return  new TaskRunner();
	}

}
