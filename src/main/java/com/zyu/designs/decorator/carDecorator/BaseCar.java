package com.zyu.designs.decorator.carDecorator;

/**
 * Car 接口的实现类
 * 角色：被装饰类
 */
public class BaseCar  implements  Car{
    @Override
    public void run() {
        System.out.println("汽车可以在路上跑");
    }

    @Override
    public void show() {
        this.run();
    }
}
