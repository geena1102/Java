import java.util.Scanner;

public class CStrings {
    public String str;


    public CStrings(String str) {
        this.str = str;
    }

   
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a C-style string: ");
        str = scanner.nextLine();
    }

    
    public void display() {
        System.out.println("C-style string: " + str);
    }

    
    public boolean compare(CStrings other) {
        return this.str.equals(other.str);
    }

   
    public void add(char ch) {
        str += ch;
    }

    
    public void concatenate(CStrings other) {
        str += other.str;
    }

    public static void main(String[] args) {
        
        CStrings cString1 = new CStrings("");
        CStrings cString2 = new CStrings("");

        cString1.read();
        cString2.read();

        cString1.display();
        cString2.display();

        if (cString1.compare(cString2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        cString1.add('A');
        cString1.display();

        cString1.concatenate(cString2);
        cString1.display();
    }
}