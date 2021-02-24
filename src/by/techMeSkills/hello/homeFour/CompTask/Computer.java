package by.techMeSkills.hello.homeFour.CompTask;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String proc;
    private String oper;
    private String hardisk;
    private Random random = new Random();
    private int res = 0;
    private int flag = 10;
    private int state = 0;
    private Scanner scanner = new Scanner(System.in);
    private int numb;

    public void getInfo() {
        System.out.println(proc + oper + hardisk);
    }

    public void setInfo(String proc, String oper, String hardisk){
        this.proc = proc;
        this.oper = oper;
        this.hardisk = hardisk;
    }

    public void getRes() {
        while (true) {
            res = random.nextInt(2);
            int numb = random.nextInt(2);
            if (numb == res) {
                if (state == 0) {
                    state = 1;
                    flag --;
                } else {
                    state = 0;
                    flag--;
                }
            } else {
                System.out.println("Dead");
                break;
            }
            System.out.println("State:" + state + "\n" + "resource:"+ flag);
        }
    }
}
