import java.io.File;

 

public class FileSearch {

    public static void main(String[] args) {

        String rootDirectoryPath = "E://java2023";

        String targetFileName = "Welcome.java";

        File rootDirectory = new File(rootDirectoryPath);

 

        if (rootDirectory.exists() && rootDirectory.isDirectory()) {

            searchFile(rootDirectory, targetFileName);

        } else {

            System.out.println("Invalid directory path or directory does not exist.");

        }

    }

 

    private static void searchFile(File directory, String targetFileName) {

        File[] files = directory.listFiles();

 

        if (files != null) {

            for (File file : files) {

                if (file.isDirectory()) {

                    searchFile(file, targetFileName); // Recursively search in subdirectories

                } else if (file.getName().equals(targetFileName)) {

                    System.out.println("Found file: " + file.getAbsolutePath());

                }

            }

        }

    }

}