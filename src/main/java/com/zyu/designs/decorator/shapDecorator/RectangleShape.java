package com.zyu.designs.decorator.shapDecorator;

/**
 * 长方形
 */
public class RectangleShape implements  Shape {
    @Override
    public void draw() {
        System.out.println("开始画 圆形 ...");
    }
}
