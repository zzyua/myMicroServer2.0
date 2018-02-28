package com.zyu.designs.factory.abstractFactory;

/**
 * 米饭
 */
public class Rice implements  Food {

    @Override
    public void taste() {
        System.out.println("米饭没有味道....");
    }
}
