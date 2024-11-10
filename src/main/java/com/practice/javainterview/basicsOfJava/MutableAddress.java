package com.practice.javainterview.basicsOfJava;

public class MutableAddress {
    private String city;
    private int pincode;

    public MutableAddress(String city, int pincode){
        this.city = city;
        this.pincode = pincode;
    }

    public String getCity(){ return city; }

    public int getPincode(){
        return pincode;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setPincode(int pincode){
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "MutableAddress{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
