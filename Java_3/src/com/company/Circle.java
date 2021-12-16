package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 10d;
        this.color = "Red";
        this.filled = true;
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "Red";
        this.filled = true;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * radius * 2;
    }

    @Override
    public String toString() {
        return "This is a circle with radius = " + radius + ". It's " + color + " and Filled " + filled;
    }
}