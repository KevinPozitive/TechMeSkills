package by.techMeSkills.hello.seaBattle.Task.logic;

import java.util.Random;

public class Field {
    private int square[][] = new int[10][10];
    private int x;
    private int y;
    private CheckCoordinates checkCoordinates;
    private boolean way;
    private Direction direction;

    Random random = new Random();

    private SetCoordinates setCoordinates = new SetCoordinates();

    public Field() {
        checkCoordinates = new CheckCoordinates(setCoordinates.getX(), setCoordinates.getY());
        Draw();
    }

    public void Draw() {
        way = random.nextBoolean();
        direction = new Direction(way, checkCoordinates);
        if (direction.Constr() == 1) {
            for (int i = 0; i <= 3; i++) {
                square[setCoordinates.getX() + i][setCoordinates.getY()] = 1;
            }
        } else if (direction.Constr() == 2) {
            for (int i = 0; i <= 3; i++) {
                square[setCoordinates.getX()][setCoordinates.getY() - i] = 1;
            }
        } else if (direction.Constr() == 3) {
            for (int i = 0; i <= 3; i++) {
                square[setCoordinates.getX() - i][setCoordinates.getY()] = 1;
            }
        } else if (direction.Constr() == 4) {
            for (int i = 0; i <= 3; i++) {
                square[setCoordinates.getX()][setCoordinates.getY() + i] = 1;
            }
        }
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.print(square[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

