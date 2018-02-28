package com.zyu.designs.factory.methodFactory;

public class MainClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {




        Frult apple = new AppleFactory().getFrult();
        Frult banana = new BananaFactory().getFrult();
        apple.get();
        banana.get();


    }
}
