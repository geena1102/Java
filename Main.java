import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private String name;
    private int age;
    private double salary;
    private transient String address; // This attribute won't be serialized

    // Constructor
    public Employee(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Take input from the user
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
       
        System.out.println("Enter employee age:");
        int age = scanner.nextInt();
       
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
       
        System.out.println("Enter employee address:");
        // Consume newline character after reading the double to prevent skipping next line
        scanner.nextLine();
        String address = scanner.nextLine();

        // Create an Employee object
        Employee employee = new Employee(name, age, salary, address);

        // Serialize selected attributes
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // Write only selected attributes
            out.writeObject(employee.getName());
            out.writeObject(employee.getAge());
            out.writeObject(employee.getSalary());
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // Deserialize selected attributes
        String deserializedName = null;
        int deserializedAge = 0;
        double deserializedSalary = 0.0;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // Read selected attributes
            deserializedName = (String) in.readObject();
            deserializedAge = (int) ((Integer) in.readObject()); // Cast to Integer first
            deserializedSalary = (double) ((Double) in.readObject()); // Cast to Double first
            in.close();
            fileIn.close();
            // Display deserialized employee
            System.out.println("Deserialized Employee:");
            System.out.println("Name: " + deserializedName);
            System.out.println("Age: " + deserializedAge);
            System.out.println("Salary: " + deserializedSalary);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
       
        // Close the scanner
        scanner.close();
    }
}
