package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Bucket implements Product {

    private List<Product> products = new ArrayList<>();

   public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    
}
