import java.io.*;
public class FactorialWithRecursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number : ");
            int inputNumber = Integer.parseInt(dis.readLine());

            // Call the factorial function to calculate the factorial
            int result = factorial(inputNumber);

            // Display the result
            System.out.println("Factorial of " + inputNumber + " is: " + result);

        } catch (Exception e) {
           System.out.println(e);

        }
    }
}
