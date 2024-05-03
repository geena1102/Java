import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a file");
            System.out.println("2. Delete the file");
            System.out.println("3. Write to the file");
            System.out.println("4. Append to the file");
            System.out.println("5. Read from the file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createFile(scanner);
                    break;
                case 2:
                    deleteFile(scanner);
                    break;
                case 3:
                    writeToFile(scanner);
                    break;
                case 4:
                    appendToFile(scanner);
                    break;
                case 5:
                    readFromFile(scanner);
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private static void createFile(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getAbsolutePath());
        } else {
            System.out.println("Failed to delete the file or the file does not exist.");
        }
    }

    private static void writeToFile(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "rw");
            System.out.print("Enter the content to write: ");
            String content = scanner.nextLine();
            raf.writeBytes(content);
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file: " + e.getMessage());
                }
            }
        }
    }

    private static void appendToFile(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "rw");
            System.out.print("Enter the content to append: ");
            String content = scanner.nextLine();
            raf.seek(raf.length());
            raf.writeBytes(content);
            System.out.println("Content appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file: " + e.getMessage());
                }
            }
        }
    }

    private static void readFromFile(Scanner scanner) {
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "r");
            System.out.println("Content of the file:");
            String line;
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file: " + e.getMessage());
                }
            }
        }
    }
}
  