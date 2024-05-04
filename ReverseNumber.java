import java.io.*;
public class ReverseNumber {
     void reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);

            System.out.print("Enter a number: ");
            int inputNumber = Integer.parseInt(dis.readLine());
            reverseNumber(inputNumber);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
