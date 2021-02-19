package by.techMeSkills.hello.homeTree.task1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 1;i<=10;i++){
            arr [i - 1] = i*2;
            System.out.println(arr[i-1]);
        }
    }
}
