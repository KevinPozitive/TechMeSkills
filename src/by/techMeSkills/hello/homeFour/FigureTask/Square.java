package by.techMeSkills.hello.homeFour.FigureTask;

public class Square extends Figure{

    private int length;
    public Square() {
        System.out.println("Constructor Figure without params");
    }

    public Square(double x, double y, int length) {
        super(x, y);
        this.length = length;
        System.out.println("this is class Square!");
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }
    @Override
    public double getArea() {
        return this.length * this.length;
    }

    public void displayFullInfo(){
        System.out.println("displayFullInfo!!!!!!");
    }
}
