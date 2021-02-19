package by.techMeSkills.hello.seaBattle.Task.logic;

import java.util.Random;

public class Direction {
    boolean way;
    CheckCoordinates checkCoordinates;
    Random random = new Random();
    Direction(boolean way, CheckCoordinates checkCoordinates){
       this.way = way;
       this.checkCoordinates = checkCoordinates;
       Constr();
    }
    public int Constr(){
        if(way==false){
            if(checkCoordinates.left()==true&&checkCoordinates.right()==false){
                return 2;
            }
            else if(checkCoordinates.left()==false&&checkCoordinates.right()==true){
                return 4;
            }else{
                if(random.nextBoolean()==true){
                    return 2;
                }else{
                    return 4;
                }
            }
        }
        else {
            if (checkCoordinates.up()==true&&checkCoordinates.down()==false){
                return 3;
            }
            else if(checkCoordinates.up()==false&&checkCoordinates.down()==true){
                return 1;
            }else {
                if(random.nextBoolean()==true){
                    return 1;
                }else{
                    return 3;
                }
            }
        }
    }
}
