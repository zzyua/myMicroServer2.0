package com.zyu.demos.demos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("22","222");

        Map  hashMap = new HashMap();
        hashMap.put(null ,null);
        hashMap.put(null ,null);
        hashMap.put("1","33");
        hashMap.put("1","444");
        System.out.println(hashMap.get(null));
        System.out.println();


        Set hashSet = new HashSet();

         final int MAX_SEGMENTS = 122 << 16;
        System.out.println(MAX_SEGMENTS);


    }
}
