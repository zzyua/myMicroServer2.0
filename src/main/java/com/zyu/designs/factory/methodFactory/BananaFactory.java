package com.zyu.designs.factory.methodFactory;

public class BananaFactory implements  FrultFactory{
    @Override
    public Frult getFrult() {
        return new Banana();
    }
}
