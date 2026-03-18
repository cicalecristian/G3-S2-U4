import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Don Chisciotte", 738189, 20.0, "books"));
        products.add(new Product("I promessi sposi", 639286, 110.0, "books"));
        products.add(new Product("Guerra e pace", 925142, 120.0, "books"));
        products.add(new Product("Xiaomi", 936254, 1.300, "smartphone"));
        products.add(new Product("Realme", 172936, 1.100, "smartphone"));

        
    }
}
