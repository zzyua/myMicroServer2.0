package com.zyu.designs.decorator.shapDecorator;

public class ShapeDecorator  implements  Shape{
    Shape shape ;
    String color  ;

    public ShapeDecorator(Shape shape ,String color) {
        this.shape = shape;
        this.color = color ;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("为图形画上颜色:" + color);
    }
}
