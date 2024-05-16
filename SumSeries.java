import java.io.*;

public class SumSeries {
    public static void main(String args[]) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the value of n: ");
            int n = Integer.parseInt(dis.readLine());
            int sum = 0;
            int innerSum = 0;
            int i = 1;
            while (i <= n) {
                innerSum += i;
                sum += innerSum;
                i++;
            }

            System.out.println("Sum of the series is: " + sum);

        } catch (Exception e) {
           System.out.println(e);

        }
    }
}
