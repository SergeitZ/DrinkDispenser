package com.company;

public class CupHolder {


    private int volumePerCup;
    public int quantity = 0;
    public String small;
    public String medium;
    public String large;


    public  void dispenseCup (String small, String medium, String large, int volumePerCup, int quantity) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.volumePerCup = volumePerCup;
        this.quantity = quantity;

    }

}
