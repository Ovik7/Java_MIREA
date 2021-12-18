package com.company;

public class Client
{
    Chair chair;
    public void setChair(Chair chair)
    {
        this.chair = chair;
    }
    public void sit()
    {
        chair.sitOnTheChair();
    }
}