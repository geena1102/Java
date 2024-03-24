import java.util.Scanner;

class Cstring {
    static void display(String name1, String name2) {
        System.out.println("Name1: " + name1);
        System.out.println("Name2: " + name2);
    }

    static void compare(String name1, String name2) {
        System.out.println(name1.equals(name2));
    }

    static void add(String name1, String name2) {
        System.out.println(name1 + name2);
    }

    static void concatenate(String name1, String name2) {
        System.out.println(name1.concat(name2));
    }

    public static void main(String args[]) {
        try {
            String name1, name2;
            int c, ch = 1;

            Scanner console = new Scanner(System.in);

            System.out.println("First String: ");
            name1 = console.nextLine();

            System.out.println("Second String: ");
            name2 = console.nextLine();

            do {
                System.out.println("1.Display\n2.Compare\n3.Add\n4.Concatenate");
                c = console.nextInt();

                switch (c) {
                    case 1:
                        display(name1, name2);
                        break;

                    case 2:
                        compare(name1, name2);
                        break;

                    case 3:
                        add(name1, name2);
                        break;

                    case 4:
                        concatenate(name1, name2);
                        break;
                }

                System.out.println("Do you want to continue? (1/0)");
                ch = console.nextInt();
            } while (ch == 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
