import java.io.*;
interface Shape {
    double calculateArea();
}
class Triangle implements Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
public class AreaTriangle {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the base of the triangle: ");
            double base = Double.parseDouble(dis.readLine());

            System.out.print("Enter the height of the triangle: ");
            double height = Double.parseDouble(dis.readLine());
            Triangle triangle = new Triangle(base, height);
            System.out.println("Area of the triangle: " + triangle.calculateArea());

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
