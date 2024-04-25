import java.io.*;
interface Shape {
    void disp();
    void calc();
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void disp() {
        System.out.println("Displaying Circle");
    }

    public void calc() {
        double area = Math.PI * radius * radius;
        System.out.println("Calculating Area of Circle: " + area);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void disp() {
        System.out.println("Displaying Rectangle");
    }
    public void calc() {
        double area = length * width;
        System.out.println("Calculating Area of Rectangle: " + area);
    }
}
public class InterfaceShape {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Choose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = Integer.parseInt(dis.readLine());
            Shape shape;
            if (choice == 1) {
                System.out.print("Enter the radius of the circle: ");
                double radius = Double.parseDouble(dis.readLine());
                shape = new Circle(radius);
            } else if (choice == 2) {
                System.out.print("Enter the length of the rectangle: ");
                double length = Double.parseDouble(dis.readLine());
                System.out.print("Enter the width of the rectangle: ");
                double width = Double.parseDouble(dis.readLine());
                shape = new Rectangle(length, width);
            } else {
                System.out.println("Invalid choice. Exiting the program.");
                return;
            }
            shape.disp();
            shape.calc();

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
