package com.zyu.demos.stsrtupRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

/**
 * 项目启动后，默认执行实现CommandLineRunner接口的run方法的Bean
 * Order(1) 表示优先级，数字越小，优先级越高。支持负整数识别
 */
@Order(1)
public class StartupRunner  implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("StartupRunner's level is 1 ");
    }
}
