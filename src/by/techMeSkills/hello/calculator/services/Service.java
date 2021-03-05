package by.techMeSkills.hello.calculator.services;

import by.techMeSkills.hello.calculator.services.impl.CalculImpl;

public class Service {
    CalculImpl calcul = new CalculImpl();

    public Service(){

        System.out.println("1 - addition\n " +
                "2 - subtraction\n " +
                "3 - multiplication\n " +
                "4 - division\n " +
                "5 - square\n " +
                "6 - root\n" );
    }
    public void setFunction(int function, double a, double b) {
        switch (function) {
            case (1):calcul.addition(a,b);break;
            case (2):calcul.subtraction(a,b);break;
            case (3):calcul.multiplication(a,b);break;
            case (4):calcul.division(a,b);break;
            case (5):calcul.square(a,b);break;
            case (6):calcul.root(a);break;
        }
    }
}
