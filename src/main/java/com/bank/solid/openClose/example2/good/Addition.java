package com.bank.solid.openClose.example2.good;

public class Addition implements Operation {
    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
