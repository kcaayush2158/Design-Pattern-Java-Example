package com.factory.design.pattern;

public class Main {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.createShape("CIRCLE");
         shape.draw();

         Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();
    }
}
