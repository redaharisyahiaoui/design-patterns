package structural.composite.leaf;

import structural.composite.Product;

public class Chips implements Product {

    private double price;

    public Chips(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
}
