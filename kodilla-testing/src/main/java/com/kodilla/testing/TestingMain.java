package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {


        Calculator calculate = new Calculator(18,9);

        int res = calculate.add();
        int res1 = calculate.subtract();
        if (res == 27) {
            System.out.println("test add OK");
        } else {
            System.out.println("Error!");
        }

        if (res1 == 9) {
            System.out.println("test subtract OK");
        } else {
            System.out.println("Error!");
        }
    }
}
