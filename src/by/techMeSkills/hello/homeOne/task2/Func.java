package by.techMeSkills.hello.homeOne.task2;

public class Func {
    private int a;
    private int b;
    private int c;

    protected Func(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    protected int compare() {
        if (a + b <= c) {
            return 1;
        } else return 0;
    }

}
