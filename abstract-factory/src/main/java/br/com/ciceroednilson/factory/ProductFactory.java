package br.com.ciceroednilson.factory;

import br.com.ciceroednilson.bean.Bike;
import br.com.ciceroednilson.bean.Product;
import br.com.ciceroednilson.bean.Skate;
import br.com.ciceroednilson.enumeration.ProductType;

public class ProductFactory implements AbstractFactory<Product> {

    @Override
    public Product create(ProductType productType) {
        if (productType == ProductType.BIKE) {
            return new Bike();
        } else if( productType == ProductType.SKATE) {
            return new Skate();
        }
        return null;
    }
}
