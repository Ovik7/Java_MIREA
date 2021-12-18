package com.company;

public class Shirt {
    private String id;
    private String shirtName;
    private String color;
    private String size;
    private String originalString;
    public Shirt(String originalString){
        this.originalString = originalString;
    }
    public void cutString(){
        String[] strArr = originalString.split(",");
        id = strArr[0];
        shirtName = strArr[1];
        color = strArr[2];
        size = strArr[3];
    }
    public String toString(){
        String returnedString = new StringBuilder().append(id).append("\n").append(shirtName).append("\n").append(
                color).append("\n").append(size).toString();
        return returnedString;
    }
}