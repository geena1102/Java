import java.io.File;

 

public class DirectoryContentsRecursive {

    public static void main(String[] args) {

       

        String directoryPath = "E:/java2023";

 

        File directory = new File(directoryPath);

 

     

        if (directory.exists() && directory.isDirectory()) {

            displayContentsRecursive(directory, 0);

        } else {

            System.out.println("Invalid directory path.");

        }

    }

 

    public static void displayContentsRecursive(File directory, int depth) {

       

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isDirectory()) {

                  

                    for (int i = 0; i < depth; i++) {

                        System.out.print("\t");

                    }

                    System.out.println("Subdirectory: " + file.getName());

                   

                    displayContentsRecursive(file, depth + 1);

                }

            }

 

           

            for (File file : files) {

                if (file.isFile()) {

                  

                    for (int i = 0; i < depth; i++) {

                        System.out.print("\t");

                    }

                    System.out.println("File: " + file.getName());

                }

            }

        }

    }

}