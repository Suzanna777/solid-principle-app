package com.bank.solid.openClose.example2.calculator;

public class Calculator {

    // method
    public void calculate(Operation operation){

        int num1 = 10;
        int num2 = 2;
        // objIntef call interMethod (and your parameters)
        operation.calculate(num1, num2);
    }
}
