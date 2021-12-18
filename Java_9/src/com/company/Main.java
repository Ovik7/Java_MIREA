package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Введите ФИО");
        name = scanner.nextLine(); //фио
        System.out.println("Введите ИНН");
        while (true){
            try {
                String INN = scanner.nextLine(); //инн
                if (!INN.matches("\\d{12}"))
                    throw new NumbersOf_INN("Должно быть 12 цифр", scanner.ioException());
                else
                    System.out.println("ok");
            } catch (NumbersOf_INN e){
                System.out.println(e);
            }
        }
    }
}

class NumbersOf_INN extends Exception{
    public NumbersOf_INN(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}