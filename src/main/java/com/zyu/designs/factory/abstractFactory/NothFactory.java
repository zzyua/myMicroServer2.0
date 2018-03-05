package com.zyu.designs.factory.abstractFactory;

/**
 * 工厂的实现，由客户端自己实现
 */
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
