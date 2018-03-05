package com.zyu.designs.decorator.carDecorator;

public class FlyCarDecorator extends  CarDecorator{


    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        System.out.println("汽车可以飞");
    }

    @Override
    public void show() {
        this.car.show();
        this.run();
    }
}
