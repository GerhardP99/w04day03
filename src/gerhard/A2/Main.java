package gerhard.A2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static String filePath = "C:\\Users\\gerha_nzlw7h1\\Java-Developer\\week04\\Java.W4D3.Sander.Pichler\\src\\gerhard\\my_files\\myFile.txt";

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter(filePath);
            file.write("Hello World!");
            file.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
