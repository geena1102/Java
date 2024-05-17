import java.io.*;
public class SwapFloatNumbers {
        static void swap(float a, float b) {
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        float temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the first float number (a): ");
            float a = Float.parseFloat(dis.readLine());
            System.out.print("Enter the second float number (b): ");
            float b = Float.parseFloat(dis.readLine());
            swap(a, b);

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
