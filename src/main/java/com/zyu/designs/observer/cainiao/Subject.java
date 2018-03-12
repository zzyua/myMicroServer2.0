package com.zyu.designs.observer.cainiao;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Subject {

    private List<Observer>  observerList = new ArrayList<>();

    public  void addAttach(Observer observer){
        observerList.add(observer);
    }

    public void setMsg(String msg) {
        notifyAll(msg) ;
    }

    public  void  notifyAll(String msg){
        observerList.forEach( observer -> {
            observer.update(msg);
        });
    }
}
