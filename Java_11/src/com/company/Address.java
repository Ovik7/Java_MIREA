package com.company;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, building, corp, flat;
    private String originalAddressString;

    public Address(String address){
        originalAddressString = address;
    }
    public void cutUsingSplit(){
        String[] strings = originalAddressString.split(",");
        country = strings[0].trim();
        region = strings[1].trim();
        city = strings[2].trim();
        street = strings[3].trim();
        building = strings[4].trim();
        corp = strings[5].trim();
        flat = strings[6].trim();
    }
    public void cutUsingTokenizer(){
        StringTokenizer st = new StringTokenizer(originalAddressString, ",.;");
        country = st.nextToken().trim();
        region = st.nextToken().trim();
        city = st.nextToken().trim();
        street = st.nextToken().trim();
        building = st.nextToken().trim();
        corp = st.nextToken().trim();
        flat = st.nextToken().trim();
    }
    public void output(){
        System.out.println(country);
        System.out.println(region);
        System.out.println(city);
        System.out.println(street);
        System.out.println(building);
        System.out.println(corp);
        System.out.println(flat);
    }

}