import java.io.*;
import java.util.Scanner;
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }
}
public class SerializationDemoUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Getting student details from user
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        Student student = new Student(name, id);
        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        // Deserialization
        Student deserializedStudent = null;
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found");
            c.printStackTrace();
            return;
        }
        // Displaying deserialized student
        System.out.println("Deserialized Student:");
        System.out.println(deserializedStudent);
        scanner.close();
    }
}
