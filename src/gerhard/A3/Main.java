package gerhard.A3;

import java.io.*;
import java.util.Scanner;

public class Main {
    static String filePath = "C:\\Users\\gerha_nzlw7h1\\Java-Developer\\week04\\Java.W4D3.Sander.Pichler\\src\\gerhard\\my_files\\recipe.txt";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine()); // outputs the lines
            }
            scanner.close(); // closing the scanner
        } catch (FileNotFoundException e) { // Catch the exception
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
