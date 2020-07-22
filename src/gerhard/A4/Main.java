package gerhard.A4;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Main {
    static String filePath = "C:\\Users\\gerha_nzlw7h1\\Java-Developer\\week04\\Java.W4D3.Sander.Pichler\\src\\gerhard\\my_files\\iwillbedeletedxd.txt";

    public static void main(String[] args) throws InterruptedException {
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

        TimeUnit.SECONDS.sleep(10);

        File file = new File(filePath);

        if(file.delete())
        {
            System.out.println("File delete: successfully");
        }
        else
        {
            System.out.println("File delete: failed");
        }

    }
}
