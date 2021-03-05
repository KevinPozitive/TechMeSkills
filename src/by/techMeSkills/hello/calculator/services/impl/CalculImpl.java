package by.techMeSkills.hello.calculator.services.impl;

import by.techMeSkills.hello.calculator.services.ICalculator;

public class CalculImpl implements ICalculator {
    @Override
    public void addition(double a, double b) {
        System.out.println(a+b);
    }

    @Override
    public void subtraction(double a, double b) {
        System.out.println(a-b);
    }

    @Override
    public void multiplication(double a, double b) {
        System.out.println(a*b);
    }

    @Override
    public void division(double a, double b) {
        System.out.println(a/b);
    }

    @Override
    public void square(double a, double b) {
        System.out.println(Math.pow(a,b));
    }

    @Override
    public void root(double a) {
        System.out.println(Math.sqrt(a));
    }
}
