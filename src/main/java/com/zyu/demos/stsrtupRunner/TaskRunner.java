package com.zyu.demos.stsrtupRunner;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;


//@Order(2)

/**
 *
 *项目启动后，默认执行实现ApplicationRunner接口的run方法的Bean
 * 实现Ordered接口的getOrder() 方法，可以进行优先级排序
 * @author zhangzy
 */
public class TaskRunner implements ApplicationRunner, Ordered {

    @Value("${myconfg.kafka.active}")
    private String acticve ;

    @Override
    public void run(ApplicationArguments args)  {
        System.out.println("acticve = "+acticve+" ;TaskRunner'level is 2");
    }


    @Override
    public int getOrder() {
        return 2;
    }
}
