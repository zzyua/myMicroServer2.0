package com.zyu.designs.decorator.carDecorator;

/**
 * 装饰类的抽象角色
 */
public  abstract  class CarDecorator implements  Car{
    protected  Car car ;

    public CarDecorator(Car car) {
        this.car = car;
    }



}
