package by.techMeSkills.hello.homeFour.FigureTask;

public abstract class Figure {
    protected double x;
    protected double y;

    public Figure(){
        System.out.println("Constructor Figure without params");
    }

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("this class figure!");
    }

    public void displayInfo(){
        System.out.println(x);
        System.out.println(y);
    }

    public abstract double getPerimeter();

    public abstract double getArea();
//
//    public void setXY(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
}
