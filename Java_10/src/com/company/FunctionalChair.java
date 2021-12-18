package com.company;

public class FunctionalChair implements Chair
{
    public int sum(int a, int b)
    {
        return a + b;
    }
    @Override
    public void sitOnTheChair()
    {
        System.out.println("Functional Chair");
    }
}