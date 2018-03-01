package com.zyu.designs.factory.abstractFactory;

public class NothApple extends  Apple{
    @Override
    public void get() {
        System.out.println("生产北方苹果");
    }
}
