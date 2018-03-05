package com.zyu.designs.decorator.shapDecorator;

public class MainClass {

    public static void main(String[] args) {
        Shape circle = new ShapeDecorator(new CircleShape(),"红色");

        Shape rectangle = new ShapeDecorator(new RectangleShape(),"绿色");

        circle.draw();
        rectangle.draw();
    }




}
