package com.company;

public class MagicChair implements Chair
{
    public void doMagic()
    {
        System.out.println("Magic happened");
    }

    @Override
    public void sitOnTheChair()
    {
        System.out.println("Magic chair");
    }
}