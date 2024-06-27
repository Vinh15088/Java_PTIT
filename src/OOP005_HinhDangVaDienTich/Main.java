package OOP005;

import java.util.Random;
import java.util.Scanner;

abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double calculateArea();
    public void displayInfo() {
        System.out.printf("Shape:%s|Area:%.2f\n", name, calculateArea());
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }
    public double calculateArea() {
        return width*length;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(String name,double radius) {
        super(name);
        this.radius =radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {
            String s = scanner.next();
            Shape shape;
            if(s.equals("Rectangle")) {
                double t1 = scanner.nextDouble();
                double t2 = scanner.nextDouble();
                shape = new Rectangle("Rectangle", t1, t2);
                shape.displayInfo();
            }
            else {
                double t1 = scanner.nextDouble();
                shape =new Circle("Circle", t1);
                shape.displayInfo();
            }
        }
    }
}
