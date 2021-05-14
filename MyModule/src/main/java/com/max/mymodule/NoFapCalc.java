package com.max.mymodule;

public class NoFapCalc {
private int hours = 365*24;
private int numOfSuccessfulDays;

    public NoFapCalc() {
        for(int numOfSuccessfulDays = 0;  this.hours > 0; numOfSuccessfulDays++){
            this.hours -= (24 + numOfSuccessfulDays*3);
            this.numOfSuccessfulDays = numOfSuccessfulDays;
        }
        System.out.println(numOfSuccessfulDays);
        System.out.println("longest streak hours and days: " + (24 + numOfSuccessfulDays*3) + " hours and " +
                (24 + numOfSuccessfulDays*3)/24f + " days");
    }



}
