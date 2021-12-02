package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Stranger", 150);
        System.out.println("Testing Book");
        System.out.println(book.getSizeOfBook());
        System.out.println(book.toString());
        System.out.println(book.getBookName());
        System.out.println(book.getNumberOfPages());

        System.out.println("Testing Dog");
        Dog doggo = new Dog("Igor", 20);
        System.out.println(doggo.getAge());
        System.out.println(doggo.getName());
        System.out.println(doggo.toString());
        doggo.intoHumanAge();

        System.out.println("Testing Ball");
        Ball ballz = new Ball("volleyball", 1);
        System.out.println(ballz.getDiameter());
        System.out.println(ballz.getSport());
        System.out.println(ballz.toString());
        System.out.println(ballz.getVolume());
    }
}
