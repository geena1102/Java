public class GenericArrayDemo {
    public static <T> void displayAndFindLength(T[] array) {
        System.out.println("Elements of the array:");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength of the array: " + array.length);
    }

    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};

        System.out.println("Integer Array:");
        displayAndFindLength(intArray);
        
        System.out.println("\nDouble Array:");
        displayAndFindLength(doubleArray);
        
        System.out.println("\nCharacter Array:");
        displayAndFindLength(charArray);
        
        System.out.println("\nString Array:");
        displayAndFindLength(stringArray);
    }
}