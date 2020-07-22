package gerhard.A5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Product {
    String name;
    double price;
    int quantity;
    String description;
    static String filePath = "C:\\Users\\gerha_nzlw7h1\\Java-Developer\\week04\\w04day03\\src\\gerhard\\my_files\\products.txt";

    @Override
    public String toString() {
        return "Product" +
                "name = " + name +
                " | price = " + price +
                " | quantity = " + quantity +
                " | description = " + description;
    }

    public Product(String n, double p, int q, String d){
        this.name = n;
        this.price = p;
        this.quantity = q;
        this.description = d;
    }

    public static void printReport(ArrayList<Product> products){
        try {
            /*for(Product str:products){*/
            FileWriter file = new FileWriter(filePath);
            file.write(products.toString());
            file.close();/*}*/

            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("evian",1.25,10,"water\n");
        Product product2 = new Product("milka",2.50,25,"chocolate\n");
        Product product3 = new Product("allinson's",5.35,12,"bred\n");
        Product product4 = new Product("Coca-Cola",2.00,50,"soft drink\n");
        Product product5 = new Product("chiappetti",12.22,125,"deluxe meat\n");

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        printReport(products);

        /*for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }*/
    }
}
