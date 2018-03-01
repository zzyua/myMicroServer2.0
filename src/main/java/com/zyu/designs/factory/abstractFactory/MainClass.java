package com.zyu.designs.factory.abstractFactory;



public class MainClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        FrultFactory nothfrultFactory = new NothFactory();
        Frult nothapple = nothfrultFactory.getApple();
        Frult nothbanna = nothfrultFactory.getBanana();

        nothapple.get();
        nothbanna.get();

        FrultFactory southFrultFactory = new SouthFactory();
        Frult southApple = southFrultFactory.getApple();
        Frult southBanana = southFrultFactory.getBanana();

        southApple.get();
        southBanana.get();


    }
}
