package br.com.ciceroednilson.main;

import br.com.ciceroednilson.bean.Product;
import br.com.ciceroednilson.enumeration.ProductType;
import br.com.ciceroednilson.factory.ProductFactory;

public class Main {

    private static final ProductFactory factory = new ProductFactory();

    public static void main(String[] args) {
        final Product bike = factory.create(ProductType.BIKE);
        final Product skate = factory.create(ProductType.SKATE);
        System.out.println(String.format("Product: %s - Price: %s", bike.getName(), bike.getPrice()));
        System.out.println(String.format("Product: %s - Price: %s", skate.getName(), skate.getPrice()));
    }
}
