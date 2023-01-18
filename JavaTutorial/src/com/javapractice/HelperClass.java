package com.javapractice;

public class HelperClass {
    public  String getFormatDollar(double value) {
        return String.format("$%.2f" , value);
    }
}
