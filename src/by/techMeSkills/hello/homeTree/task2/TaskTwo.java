package by.techMeSkills.hello.homeTree.task2;

public class TaskTwo {
    public static void main(String[] args) {
        int arr[] = new int[50];
        for (int i = 1; i < 100; i += 2) {
            if (i == 1)
                arr[i - 1] = i;
            else
                arr[i - 2] = i;
        }
        System.out.println("---------");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
