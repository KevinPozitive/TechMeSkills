package by.techMeSkills.hello.homeTree.task3;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        int arr[] = new int[15];
        Random random = new Random();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 15; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            System.out.println(arr[i]);
        }
        System.out.println("even " + even);
        System.out.println("odd " + odd);
    }
}
