import java.io.*;
public class SquareRoot {
    static void findSquareRoot(double[] number) {
        if (number[0] >= 0) {
            number[0] = Math.sqrt(number[0]);
        } else {
            System.out.println("Cannot find square root of a negative number.");
        }
    }

    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter a number: ");
            double[] inputNumber = { Double.parseDouble(dis.readLine()) };

            findSquareRoot(inputNumber);

            System.out.println("Square root: " + inputNumber[0]);

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
