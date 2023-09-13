package org.example;

/**
 * Practice for Interface and implements keyword
 * @author Farida Fatali
 * Shape hierarchy in Java using interfaces
 */

public class Main {
    public static void main(String[] args) {
//        Geometry geometry = new Geometry();
//
//        Shape shape = new Rectangle(6, 8);
//        System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//        geometry.drawShape(shape);
//
//        shape = new Square(10);
//        System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//        geometry.drawShape(shape);
//
//        shape = new Circle(5);
//        System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//        geometry.drawShape(shape);
//
//        shape = new Triangle(8, 9);
//        System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//        geometry.drawShape(shape);
//
//        geometry.eraseShape(shape);


        new ShapeFactory();
        ShapeFactory.produceShape();
    }

}