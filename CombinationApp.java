import package1.CombinationCalculator;
import java.util.Scanner;
public class CombinationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();
        long result = CombinationCalculator.calculateCombination(n, r);
        System.out.println("Value of " + n + "C" + r + ": " + result);
    }
}