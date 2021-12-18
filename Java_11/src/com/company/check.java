package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check {
    InputStreamReader isr;
    BufferedReader br;
    public check() throws IOException {
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);

    }
    public void start() throws IOException {

        int answer;
        while(true){
            System.out.println("1 - Person\n2 - Address\n3 - Shirt\n4 - PhoneNumber\n0 - Exit");
            answer = Integer.parseInt(br.readLine());
            switch (answer){
                case 1:
                    Person person = new Person("Filippov", "Ilya", "Alexeevich");
                    System.out.println(person.toString());
                    break;
                case 2:
                    System.out.println("1 - split\n2 - StringTokenizer");
                    int answer2 = Integer.parseInt(br.readLine());
                    System.out.println("Enter address");
                    String address = br.readLine();
                    if(answer2 == 1){
                        Address addressObj = new Address(address);
                        addressObj.cutUsingSplit();
                        addressObj.output();
                    } else if(answer2 == 2){
                        Address addressObj = new Address(address);
                        addressObj.cutUsingTokenizer();
                        addressObj.output();
                    }
                    else{
                        System.out.println("ERROR");
                    }

                    break;
                case 3:
                    String[] strShirts = {"S001,Black Polo Shirt,Black,XL","S002,Black Polo Shirt,Black,L","S003,Blue Polo Shirt,Blue,XL","S004,Blue Polo Shirt,Blue,M"
                            ,"S005,Tan Polo Shirt,Tan,XL","S006,Black T-Shirt,Black,XL","S007,White T-Shirt,White,XL",
                            "S008,White T-Shirt,White,L","S009,Green T-Shirt,Green,S",
                            "S010,Orange T-Shirt,Orange,S","S011,Maroon Polo Shirt,Maroon,S"};
                    Shirt[] shirts = new Shirt[11];
                    for (int i = 0; i < 11; i ++) {
                        shirts[i] = new Shirt(strShirts[i]);
                        shirts[i].cutString();
                    }
                    for(Shirt shirt: shirts){
                        System.out.println(shirt.toString());
                        System.out.println();
                    }
                    break;

                case 4:
                    String number = br.readLine();
                    PhoneNumber pn = new PhoneNumber(number);
                    pn.transformNumber();
                    System.out.println(pn.showFormattedNumber());
                    break;
                case 0:
                    return;
            }
        }

    }
}
