package com.bank.solid.openClose.example1.good;

public class Rectangle implements Shape {

    private double height;
    private double width;

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }

}
