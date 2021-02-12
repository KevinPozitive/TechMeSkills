package by.techMeSkills.hello.homeTwo.Task3;

public class Task {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            sum += i;
            System.out.println(sum);
        }
    }
}
