package com.company;

public class Book {
    final int ALPHABET = 256;
    final int NUMBEROFCHARACTERS = 90;
    final int NUBEROFLINES = 100;
    private int numberOfPages;
    private String bookName;


    public Book(String name, int pages){
        numberOfPages = pages;
        bookName = name;
    }
    public Book(String name){
        bookName = name;
        numberOfPages = 100;
    }
    public Book(){
        bookName = "Crime and Punishment";
        numberOfPages = 100;
    }
    public int getSizeOfBook(){
        return NUMBEROFCHARACTERS * NUBEROFLINES * numberOfPages * 8;
    }
    public String toString(){
        return "name:" + bookName + " number of pages: " + numberOfPages;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getNumberOfPages(){
        return this.numberOfPages;
    }

}