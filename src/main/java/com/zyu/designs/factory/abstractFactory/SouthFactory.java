package com.zyu.designs.factory.abstractFactory;

public class SouthFactory implements FrultFactory {
    @Override
    public Frult getApple() {
        return new SouthApple();
    }

    @Override
    public Frult getBanana() {
        return new SouthBanana();
    }
}
