package gerhard.A1;

import java.io.File;


public class Main {
    static String filePath = "C:\\Users\\gerha_nzlw7h1\\Java-Developer\\week04\\Java.W4D3.Sander.Pichler\\src\\gerhard\\my_files\\myFile.txt";
    public static void main(String[] args) {
        try {
            File file = new File(filePath); // Create file
            if (file.createNewFile()) { // Use createNewFile() method
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
