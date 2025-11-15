package structural.composite.leaf;

import structural.composite.Product;

public class Soda implements Product {

    private double price;

    public Soda(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
}
