package by.techMeSkills.hello;

import java.io.BufferedReader;

public class Tasks {
    public static void main(String[] args) {
        int a = 345;
        if (a < 0) {
            System.out.println("Отрицательное");
        } else if (a > 0) {
            if (a / 10 == 0)
                System.out.println("Однозначное");
            else if (a / 10 > 1 && a / 10 < 10)
                System.out.println("Двузначное");
            else if (a / 10 > 10 && a / 10 < 100)
                System.out.println("трехзначное");

            System.out.println("Положитеьное");
        } else {
            System.out.println("НОЛЬ");
        }
    }
}
