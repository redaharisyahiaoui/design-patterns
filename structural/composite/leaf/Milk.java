package structural.composite.leaf;

import structural.composite.Product;

public class Milk implements Product {

    private double price;

    public Milk(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
}
