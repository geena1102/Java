import java.io.*;
public class SumOfEven {
    static void calculateSumOfEvenNumbers() {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the value of n: ");
            int n = Integer.parseInt(dis.readLine());
            int sum = 0;
            int count = 0;
            int number = 2; // Starting from the first even number
            while (count < n) {
                sum += number;
                number += 2; // Move to the next even number
                count++;
            }
            System.out.println("Sum of the first " + n + " even numbers: " + sum);

        } catch (Exception e) {
         System.out.println(e);

        }
    }

    public static void main(String args[]) {
        calculateSumOfEvenNumbers();
    }
}
