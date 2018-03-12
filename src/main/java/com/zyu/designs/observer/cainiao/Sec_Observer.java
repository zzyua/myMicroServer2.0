package com.zyu.designs.observer.cainiao;

public class Sec_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(Sec_Observer.class.getName() + ":" + msg);
    }
}
