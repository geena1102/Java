import java.io.File;
public class DirectoryContents {
    public static void main(String[] args) {
        String directoryPath = "E:/java2023";
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            displayContents(directory);
        } else {
            System.out.println("Invalid directory path.");
        }
    }
    public static void displayContents(File directory) {
        File[] files = directory.listFiles();
        for (File file : files) {

            if (file.isDirectory()) {

                System.out.println("Subdirectory: " + file.getName());

            }

        }
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("File: " + file.getName());
            }

        }

    }

}

