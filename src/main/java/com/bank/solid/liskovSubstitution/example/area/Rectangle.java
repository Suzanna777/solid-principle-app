package com.bank.solid.liskovSubstitution.example.area;

public class Rectangle implements Shape{

    private int height; // dlina light
    private int  width; // visota

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return this.height * this.width; // sirina 3 * visota 2 = area 6
    }
}
