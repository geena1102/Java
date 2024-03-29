import java.io.*;

public class FactorialSum {
    public static void main(String args[]) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the value of n: ");
            int n = Integer.parseInt(dis.readLine());
            double sum = 0;
            double factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                sum += i / factorial;
            }
            System.out.println("Sum of the series is: " + sum);
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
