package by.techMeSkills.hello.homeOne.task3;

public class Func {
    private int a;

    public Func(int a) {
        this.a = a;
    }

    public int action() {
        if (a > 0) {
            System.out.println(a + 1);
            return a;
        } else if (a < 0) {
            System.out.println(a - 2);
            return a;
        } else {
            System.out.println(10);
            return a;
        }
    }
}
