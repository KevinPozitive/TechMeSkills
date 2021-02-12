package by.techMeSkills.hello.homeOne.task4_5;

public class Func {
    private int a;
    private int b;
    private int c;

    public Func(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        action();
    }

    public void action() {
        int i = 0;
        int j = 0;
        if (a > 0) {
            i++;
        } else if (a < 0) {
            j++;
        }
        if (b > 0) {
            i++;
        } else if (a < 0) {
            j++;
        }
        if (c > 0) {
            i++;
        } else if (a < 0) {
            j++;
        }
        System.out.println("Кол-во положительных: " + i);
        System.out.println("Кол-во отрицательных: " + j);
    }
}
