import java.io.*;
class Employee {
    private int eno;
    private String ename;
    private double esal;
    public void readDetails() {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter Employee Number : ");
            eno = Integer.parseInt(dis.readLine());
            System.out.print("Enter Employee Name : ");
            ename = dis.readLine();
            System.out.print("Enter Employee Salary : ");
            esal = Double.parseDouble(dis.readLine());
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Salary : " + esal);
    }
    public boolean searchEmployee(int searchEno) {
        return eno == searchEno;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the number of employees (n): ");
            int n = Integer.parseInt(dis.readLine());
            Employee[] employees = new Employee[n];
            for (int i = 0; i < n; i++) {
                employees[i] = new Employee();
                System.out.println("\nEnter details for Employee " + (i + 1) + ":");
                employees[i].readDetails();
            }
            System.out.println("\nDetails of all Employees:");
            for (int i = 0; i < n; i++) {
                employees[i].displayDetails();
                System.out.println();
            }
            System.out.print("Enter Employee Number to search: ");
            int searchEno = Integer.parseInt(dis.readLine());
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (employees[i].searchEmployee(searchEno)) {
                    System.out.println("Employee found!");
                    employees[i].displayDetails();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
