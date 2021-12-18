package com.company;

public class PhoneNumber {
    private String countryCode;
    private String companyNumber;
    private String remainingNumbers;
    private String originalNumber;

    public PhoneNumber(String number){
        originalNumber = number;
    }
    public String showFormattedNumber(){
        String formattedNumber = new StringBuilder().append("+").append(countryCode).append(companyNumber).append("-").append(
                remainingNumbers.substring(0,3)).append("-").append(remainingNumbers.substring(3,remainingNumbers.length())).toString();
        return formattedNumber;
    }
    public void transformNumber(){

        getCountryCode();
        getCompanyNumber();
        getRemainingNumbers();
    }
    private void getCountryCode(){
        if(originalNumber.charAt(0)== "8".charAt(0)){
            countryCode = "7";
            return;
        }
        StringBuffer sb = new StringBuffer(originalNumber);
        sb.deleteCharAt(0);
        originalNumber = sb.toString();
        countryCode = originalNumber.substring(0, originalNumber.length() - 10);
    }
    private void getCompanyNumber(){

        int sizeOfCountryCode = countryCode.length();
        companyNumber = originalNumber.substring(sizeOfCountryCode, sizeOfCountryCode + 3);
    }
    private void getRemainingNumbers(){
        remainingNumbers = originalNumber.substring(originalNumber.indexOf(companyNumber) + 3, originalNumber.length());
    }
}