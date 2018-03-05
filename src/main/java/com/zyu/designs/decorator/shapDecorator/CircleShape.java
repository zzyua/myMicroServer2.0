package com.zyu.designs.decorator.shapDecorator;

/**
 * 圆形
 */
public class CircleShape implements  Shape {
    @Override
    public void draw() {
        System.out.println("开始画 圆形 ...");
    }
}
