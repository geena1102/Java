import java.io.DataInputStream;
import java.io.IOException;
public class NumberArrayValidation {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the size of the array: ");
            int size = Integer.parseInt(dis.readLine());

            if (size <= 0) {
                throw new NegativeArraySizeException("Array size must be positive.");
            }
         int[] numbers = new int[size];
         System.out.println("Enter " + size + " numbers separated by spaces:");

            String[] inputNumbers = dis.readLine().split(" ");
            if (inputNumbers.length != size) {
                throw new IOException("Number of input numbers does not match the specified array size.");
            }

            for (int i = 0; i < size; i++) {
                numbers[i] = Integer.parseInt(inputNumbers[i]);
            }

            System.out.println("The numbers you entered are:");
            for (int number : numbers) {
                System.out.println(number);
            }

            dis.close();
        } catch (IOException e) {
            System.out.println("IO Exception occurred.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter numbers separated by spaces.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size entered. Please enter a positive size.");
        }
    }
}