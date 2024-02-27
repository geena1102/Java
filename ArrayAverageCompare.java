public class ArrayAverageCompare {
 public static <T extends Number> double computeAverage(T[] array) {
        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum / array.length;
    }
public static <T extends Number> void compareAverages(T[] array1, T[] array2) {
        double average1 = computeAverage(array1);
        double average2 = computeAverage(array2);
        System.out.println("Average of array1: " + average1);
        System.out.println("Average of array2: " + average2);
        if (average1 > average2) {
            System.out.println("Average of array1 is greater than average of array2.");
        } else if (average1 < average2) {
            System.out.println("Average of array1 is less than average of array2.");
        } else {
            System.out.println("Average of array1 is equal to average of array2.");
        }
    }

    public static void main(String[] args) {
         Integer[] intArray1 = {10, 20, 30, 40, 50};
        Integer[] intArray2 = {15, 25, 35, 45, 55};
        Double[] doubleArray1 = {1.5, 2.5, 3.5, 4.5, 5.5};
        Double[] doubleArray2 = {2.0, 3.0, 4.0, 5.0, 6.0};
        System.out.println("Comparing averages of integer arrays:");
        compareAverages(intArray1, intArray2);
       System.out.println("\nComparing averages of double arrays:");
        compareAverages(doubleArray1, doubleArray2);
    }
}
 


