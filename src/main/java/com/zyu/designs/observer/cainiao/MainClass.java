package com.zyu.designs.observer.cainiao;

public class MainClass {

    public static void main(String[] args){
        Subject subject = new Subject();
        Observer first_observer = new First_Observer();
        Observer sec_observer = new Sec_Observer();

        subject.addAttach(first_observer);
        subject.addAttach(sec_observer);
        subject.notifyAll("hello");
    }
}
