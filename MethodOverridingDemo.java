import java.io.*;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private int rollNumber;
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Roll Number: " + rollNumber);
    }
}
class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Subject: " + subject);
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Display Student Details");
                System.out.println("2. Display Teacher Details");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = Integer.parseInt(dis.readLine());

                switch (choice) {
                    case 1:
           
                        Student student = new Student("James", 20, 43);
                        student.displayDetails();
                        break;

                    case 2:
                     
                        Teacher teacher = new Teacher("Bindhu", 35, "Mathematics");
                        teacher.displayDetails();
                        break;

                    case 3:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
