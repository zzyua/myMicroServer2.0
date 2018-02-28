package com.zyu.designs.factory.methodFactory;

public class AppleFactory implements  FrultFactory{


    @Override
    public Frult getFrult() {
        return new Apple();
    }
}
