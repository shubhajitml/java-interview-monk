package com.practice.javainterview.basicsOfJava;

public class BasicsOfJavaMain {
    public static void main(String[] args) {
        // String immutability -
        String name = "Hari"; // (checks in the string pool if "Hari" exists, it doesn't exist, so new String "Hari" is created in String pool)
        name = "Jadu"; // (checks in the string pool if "Jadu" exists, if not create a new String else return the existing one
        System.out.println(name); // prints - Jadu
        String secondName = "Hari"; // (checks in the string pool if "Hari" exists, it exists, so secondName points to the "Hari" reference in String pool)
        System.out.println(secondName); // prints - Hari

        // immutable object example
        ImmutableEmployee employee = new ImmutableEmployee(1, "Jeff", "storage",
                10, new MutableAddress("Bangalore", 560001));
        System.out.println(employee.toString());
        //you can't modify the attributes of employee object, once initialized
    }

}
