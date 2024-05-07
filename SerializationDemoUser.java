import java.io.*;
import java.util.Scanner;
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;
    private transient double salary; // Marking salary as transient to exclude it from serialization
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}
public class SerializationDemoUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(name, id, salary);
        // Selecting attributes for serialization
        System.out.println("Select attributes to serialize (separate with commas - name, id, salary):");
        String[] selectedAttributes = scanner.next().split(","); 
        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);    
            for (String attribute : selectedAttributes) {
                switch (attribute.trim()) {
                    case "name":
                        out.writeObject(employee.getName());
                        break;
                    case "id":
                        out.writeObject(employee.getId());
                        break;
                    case "salary":
                        out.writeObject(employee.getSalary());
                        break;
                    default:
                        System.out.println("Invalid attribute: " + attribute.trim());
                }
            }          
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Deserialization
        System.out.println("Deserializing selected attributes...");
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            for (String attribute : selectedAttributes) {
                Object obj = in.readObject();
                if (obj != null) {
                    System.out.println(attribute.trim() + ": " + obj);
                }
            }        
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
