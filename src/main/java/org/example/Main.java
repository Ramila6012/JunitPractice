package org.example;

import org.example.junitExample.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition " + calculator.add(4,5));
        System.out.println("Sub " + calculator.sub(10,5));
        System.out.println("Division " + calculator.division(50,10));
        System.out.println("Multiply " + calculator.multiply(100,100));
        }
    }
