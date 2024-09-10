package com.bank.solid.interfaceSegregation.example.farm;

public class Owl implements CanFly, CanWalk, CanEat{
    public void eat() {
        System.out.println("can eat fish ");
    }

    @Override
    public void fly() {
        System.out.println("can fly high");
    }

    @Override
    public void walk() {
        System.out.println("can walk ");
    }
}
