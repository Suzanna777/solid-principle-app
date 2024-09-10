package com.bank.solid.interfaceSegregation.example.farm;

public class Chicken implements CanEat, CanWalk{

    public void eat() {
        System.out.println("can eat ");
    }


    @Override
    public void walk() {
        System.out.println("can walk ");
    }
}
