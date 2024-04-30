import java.util.Scanner;
class PrimeNumberException extends Exception {
    public PrimeNumberException(String message) {
        super(message);
    }
}
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         try {
            System.out.print("Enter a number to check if it's prime: ");
            int number = scanner.nextInt();
            if (isPrime(number)) {
                throw new PrimeNumberException(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (PrimeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}

