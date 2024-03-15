import java.io.DataInputStream;
import java.io.IOException;
class Complex {
    private double real;
    private double imaginary;
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void read() {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the real part: ");
            real = Double.parseDouble(dis.readLine());
            System.out.print("Enter the imaginary part: ");
            imaginary = Double.parseDouble(dis.readLine());
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    public void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }
    public Complex add(Complex other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        return new Complex(resultReal, resultImaginary);
    }
    public Complex multiply(Complex other) {
        double resultReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double resultImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(resultReal, resultImaginary);
    }
}
public class ComplexOperations {
    public static void main(String[] args) {
        Complex complex1 = new Complex(0, 0);
        Complex complex2 = new Complex(0, 0);
        System.out.println("Enter details for Complex Number 1:");
        complex1.read();
        System.out.println("\nEnter details for Complex Number 2:");
        complex2.read();
        System.out.println("\nEntered Complex Numbers:");
        complex1.display();
        complex2.display();
        Complex sumResult = complex1.add(complex2);
        System.out.println("\nSum of Complex Numbers:");
        sumResult.display();
        Complex productResult = complex1.multiply(complex2);
        System.out.println("\nProduct of Complex Numbers:");
        productResult.display();
    }
}
