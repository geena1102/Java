import java.io.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter a number: ");
            String input = dis.readLine();
            int num = Integer.parseInt(input);
            System.out.println("Original number: " + num);
            if (isPalindrome(num)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int reverseInteger(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int num) {
        return num == reverseInteger(num);
    }
}
