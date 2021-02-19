package by.techMeSkills.hello.seaBattle.Task.logic;

import java.util.Random;

public class SetCoordinates {
    private int x;
    private int y;
    private Random random = new Random();
    SetCoordinates(){
        this.x = this.random.nextInt(10);
        this.y = this.random.nextInt(10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
