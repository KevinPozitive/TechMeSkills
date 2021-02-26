package by.techMeSkills.hello.homeFour.FigureTask;

public class Triangle extends Figure{

    private int a;
    private int b;

    public Triangle(double x, double y, int a, int b) {
        super(x, y);

        this.a = a;
        this.b = b;
    }
    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
    }

    @Override
    public double getArea() {
        return (double) a*b/2;
    }
}
