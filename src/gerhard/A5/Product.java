package gerhard.A5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Product {
    String name;
    double price;
    int quantity;
    String description;
    static String filePath = "C:\\Users\\gerha_nzlw7h1\\Java-Developer\\week04\\day03\\src\\gerhard\\my_files\\products.txt";

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }

    public Product(String n, double p, int q, String d){
        /*n = name;
        p = price;
        q = quantity;
        d = description;*/
        this.name = n;
        this.price = p;
        this.quantity = q;
        this.description = d;
    }

    public static void printReport(){
        try {
            FileWriter file = new FileWriter(filePath);
            file.write(String.valueOf(product1));
            file.write(System.lineSeparator());
            file.write(String.valueOf(product2));
            file.write(System.lineSeparator());
            file.write(String.valueOf(product3));
            file.write(System.lineSeparator());
            file.write(String.valueOf(product4));
            file.write(System.lineSeparator());
            file.write(String.valueOf(product5));
            file.write(System.lineSeparator());
            file.close();

            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("evian",1.25,10,"water");
        Product product2 = new Product("milka",2.50,25,"chocolate");
        Product product3 = new Product("allinson's",5.35,12,"bred");
        Product product4 = new Product("Coca-Cola",2.00,50,"soft drink");
        Product product5 = new Product("chiappetti",12.22,125,"deluxe meat");

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);


        /*for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }*/
    }
}
