package com.company;

public class Ball {
    private String sport;
    private float diameter;

    public Ball (String sport, float diameter){
        this.sport = sport;
        this.diameter = diameter;
    }
    public Ball (String sport){
        this.sport = sport;
        diameter = 30;
    }
    public Ball(){
        sport = "Volleyball";
        diameter = 30;
    }
    public String getSport(){
        return sport;
    }
    public float getDiameter(){
        return diameter;
    }
    public String toString(){
        return "Diameter of this " + sport + " ball is " + diameter;
    }
    public float getVolume(){
        float r = diameter/2;
        return (4f/3f) * 3.14f * r * r * r;
    }
}