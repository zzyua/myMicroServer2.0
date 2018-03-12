package com.zyu.designs.observer.cainiao;

public class First_Observer extends  Observer {
    @Override
    public void update(String msg) {
        System.out.println(First_Observer.class.getName() + ":" + msg);
    }
}
