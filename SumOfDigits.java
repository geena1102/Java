import java.io.*;
public class SumOfDigits {
    static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String args[]) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter a number: ");
            int inputNumber = Integer.parseInt(dis.readLine());
            int sum = calculateSumOfDigits(inputNumber);
            System.out.println("Sum of digits: " + sum);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
