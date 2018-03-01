package com.zyu.designs.factory.abstractFactory;

public class NothFactory implements FrultFactory {
    @Override
    public Frult getApple() {
        return new NothApple();
    }

    @Override
    public Frult getBanana() {
        return new NothBanana();
    }
}
