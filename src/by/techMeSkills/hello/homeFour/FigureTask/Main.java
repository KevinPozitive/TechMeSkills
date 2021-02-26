package by.techMeSkills.hello.homeFour.FigureTask;

import by.techMeSkills.hello.homeFour.CompTask.Computer;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5,5,4);
        square.displayInfo();
        square.displayFullInfo();

        Triangle triangle = new Triangle(5,5,10,4);

//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getPerimeter());

        printPerimeter(square);
        printPerimeter(triangle);
//
//        Figure square2 = new Square();
//        square2.displayInfo();

    }
    public static void printPerimeter(Figure figure){
        System.out.println("Perimeter:" + figure.getPerimeter());
        System.out.println("Area:" + figure.getArea());

    }
}
