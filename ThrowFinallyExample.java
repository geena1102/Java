public class ThrowFinallyExample {

    public static void main(String[] args) {
     try {
     int result = divide(10, 0);
     System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
     System.out.println("ArithmeticException caught: Cannot divide by zero.");
     } finally {
     System.out.println("Finally block is always executed.");
     }
 }
  public static int divide(int num1, int num2) {
   if (num2 == 0) {
    throw new ArithmeticException("Cannot divide by zero.");
      }
    return num1 / num2;

    }}

