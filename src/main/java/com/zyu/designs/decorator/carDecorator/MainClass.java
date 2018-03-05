package com.zyu.designs.decorator.carDecorator;

public class MainClass {
    public static void main(String[] args) {
        Car car = new BaseCar();
        car.show();
        System.out.println("--------");

        CarDecorator carDecorator = new SwinCarDecorator(car);
        carDecorator.show();
        System.out.println("-------------");

        CarDecorator carDecorator2 = new FlyCarDecorator(carDecorator);
        carDecorator2.show();

    }
}
