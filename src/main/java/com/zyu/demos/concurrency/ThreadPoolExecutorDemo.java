package com.zyu.demos.concurrency;

import com.zyu.designs.singleton.PoolDemo;
import com.zyu.designs.singleton.SingleSton_Enum;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ThreadPoolExecutor 使用Demo
 */
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {

        int  COUNT_BITS = Integer.SIZE - 3 ;
        int CAPACITY   = (1 << COUNT_BITS) - 1;
        AtomicInteger ctl = new AtomicInteger(-536870912) ;
        System.out.println("Integer.SIZE=" + Integer.SIZE);
        System.out.println("COUNT_BITS=" + COUNT_BITS);
        System.out.println("CAPACITY=" + CAPACITY);

        int c = ctl.get();
        System.out.println("c & CAPACITY=" + ( c & CAPACITY ));

        String sdf = new String();

        ExecutorService exec =  Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();

        

//        for (int i = 0; i < 100; i++) {
//            exec.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
////                        System.out.println("threadId="+Thread.currentThread());
//                        PoolDemo   pool = SingleSton_Enum.INSTANCE.getResource();
//                        System.out.println(pool.hashCode());
//                        // Thread.sleep(5000);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//
//        }

        for (int i = 0; i < 1; i++) {
            exec.execute(() -> {
                PoolDemo pool = SingleSton_Enum.INSTANCE.getResource();
                System.out.println(pool.hashCode());
            });
        }



    }
}
