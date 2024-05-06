import java.io.*;

public class SearchArray {
    public static void main(String args[]) {
        try {
            int a[];
            String s;
            int i;

            System.out.println("Enter size of array: ");
            DataInputStream dis = new DataInputStream(System.in);
            s = dis.readLine();
            int n = Integer.parseInt(s);
            a = new int[n];

            System.out.println("Enter array elements: ");
            for (i = 0; i < n; i++) {
                s = dis.readLine();
                a[i] = Integer.parseInt(s);
            }

            System.out.println("Array elements are: ");
            for (i = 0; i < n; i++) {
                System.out.println(a[i]);
            }

            System.out.println("Enter element to search: ");
            s = dis.readLine(); 
            int searchElement = Integer.parseInt(s);

            int flag = 0;
            for (i = 0; i < n; i++) {
                if (a[i] == searchElement) {
                 flag = 1;
                 System.out.println("Element " + searchElement + " found at index " + i);
                    break;
                }
            }

            if (flag == 0) {
            System.out.println("Element " + searchElement + " not found in the array.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
