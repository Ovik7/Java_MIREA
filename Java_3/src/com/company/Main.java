package com.company;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());


        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());



        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());


        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        System.out.println();
        MovablePoint mp = new MovablePoint(0,0,2,2);
        System.out.println(mp.toString());
        mp.moveDown();
        mp.moveLeft();
        System.out.println(mp.toString());

        System.out.println();
        MovableCircle mc = new MovableCircle(0,0,2,2, 10);
        System.out.println(mc.toString());
        mc.moveDown();
        mc.moveLeft();
        System.out.println(mc.toString());

        System.out.println();
        MovableRectangle mr = new MovableRectangle(-1,1,1,-1, 10, 10);
        System.out.println(mr.toString());
        mr.moveDown();
        mr.moveLeft();
        System.out.println(mr.toString());
    }
}