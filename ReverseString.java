import java.util.Scanner;
public class ReverseString {
        public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
       return new String(charArray);
    }
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
 String inputString = scanner.nextLine();
 String reversedString = reverseString(inputString);
 System.out.println("Reversed string: " + reversedString);
    }}