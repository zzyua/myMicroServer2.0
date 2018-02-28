package com.zyu.designs.factory.abstractFactory;

public class Soup implements  Food {

    @Override
    public void taste() {
        System.out.println("汤 喝起来非常棒...");
    }
}
