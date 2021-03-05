package by.techMeSkills.hello.calculator.application;

import by.techMeSkills.hello.calculator.services.Service;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        int func = 0;
        int a = 0;
        int b = 0;


//        Random random = new Random();
//        int mas;
//        int rand;
//        rand = scanner.nextInt();
//        int[]arr = new int[mas = scanner.nextInt()];
//        for(int i = 0;i<arr.length;i++){
//            arr[i] = random.nextInt(rand);
//        }
//        rand = scanner.nextInt();
//        int[]arr2 = new int[mas = scanner.nextInt()];
//        for(int i = 0;i<arr2.length;i++){
//            arr2[i] = random.nextInt(rand);
//        }
//        for(int i = 0; i<=6;i++){
//            if (i > 5) {
//                a = arr[random.nextInt(arr.length)];
//                service.setFunction(func, a, 0);
//            }else if(func<5){
//                a = arr[random.nextInt(arr2.length)];
//                b = arr[random.nextInt(arr2.length)];
//                service.setFunction(func,a,b);
//            }
//        }
//


        while (true) {
            func = scanner.nextInt();
            if (func > 5) {
                a = scanner.nextInt(

                );
                service.setFunction(func, a, 0);
            }else if(func<5){
                a = scanner.nextInt();
                b = scanner.nextInt();
                service.setFunction(func,a,b);
            }
        }



    }
}
