import java.io.*;

public class NumbersWhile {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);

            System.out.print("Enter the starting number (m): ");
            String mStr = dis.readLine();
            int m = Integer.parseInt(mStr);

            System.out.print("Enter the ending number (n): ");
            String nStr = dis.readLine();
            int n = Integer.parseInt(nStr);

            System.out.println("Numbers from " + m + " to " + n + ":");

            while (m <= n) {
                System.out.println(m);
                m++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
