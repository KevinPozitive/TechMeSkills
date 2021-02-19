package by.techMeSkills.hello.seaBattle.Task.logic;

public class CheckCoordinates {
    private int x;
    private int y;

    CheckCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean left() {
        if (this.x < 4) {
            return false;
        }
        else return true;
    }

    public boolean right(){
        if(this.x>7){
            return false;
        }
        else return true;
    }

    public boolean up() {
        if(this.y<4){
            return false;
        }
        else return true;
    }

    public boolean down() {
        if(this.x>7){
            return false;
        }
        else return true;
    }
}
