package com.company;

public class VictorianChair implements Chair
{
    private int age;
    public VictorianChair(int age)
    {
        this.age = age;
    }
    @Override
    public void sitOnTheChair()
    {
        System.out.println("Victorian Chair");
    }
    int getAge()
    {
        return age;
    }
}