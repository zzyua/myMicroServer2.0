package com.zyu.demos.concurrency;

import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadPoolExecutor 使用Demo
 */
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {

        ExecutorService exec =  Executors.newFixedThreadPool(3);






    }
}
