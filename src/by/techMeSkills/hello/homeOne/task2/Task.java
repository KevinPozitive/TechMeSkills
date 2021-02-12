package by.techMeSkills.hello.homeOne.task2;

public class Task {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        Func func = new Func(a, b, c);
        if (func.compare() == 1) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
    }
}
