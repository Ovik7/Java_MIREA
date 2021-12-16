package com.company;

public class Square extends Rectangle{
    public Square(){
        this.width = 10;
        this.length = 10;
        this.color = "Red";
        this.filled = true;
    }
    public Square(double side){
        this.width = side;
        this.length = side;
        this.color = "Red";
        this.filled = true;
    }
    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }
    public void setLength(double side){
        this.width = side;
        this.length = side;
    }
    public String toString(){
        return "This is Square with side = " + width + ". It's " + color + " and Filled " + filled;
    }
}