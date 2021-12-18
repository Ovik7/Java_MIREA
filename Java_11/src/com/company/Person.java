package com.company;

public class Person {
    private String Name;
    private String FathersName;
    private String Surname;

    public Person(String surname, String name, String fathersName){
        this.Name = name;
        this.Surname = surname;
        this.FathersName = fathersName;
    }
    public Person(String surname, String name){
        this.Name = name;
        this.Surname = surname;
    }
    public Person(String surname){
        this.Surname = surname;
    }
    public String toString(){
        String strToReturn;
        StringBuffer sb = new StringBuffer().append(Surname).append(" ");
        if (Name != null) {
            sb.append(Name.charAt(0)).append(".");
        }
        if(FathersName != null){
            sb.append(FathersName.charAt(0)).append(".");
        }
        strToReturn = sb.toString();
        return strToReturn;
    }
}
