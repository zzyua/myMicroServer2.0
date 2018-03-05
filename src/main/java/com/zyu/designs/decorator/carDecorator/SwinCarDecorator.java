package com.zyu.designs.decorator.carDecorator;

public class SwinCarDecorator extends  CarDecorator{



    public SwinCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        System.out.println("汽车可以游泳");

    }

    @Override
    public void show() {
        this.car.show();
        this.run();
    }
}
