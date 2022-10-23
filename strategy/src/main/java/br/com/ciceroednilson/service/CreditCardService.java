package br.com.ciceroednilson.service;

import br.com.ciceroednilson.bean.Product;
import br.com.ciceroednilson.strategy.PaymentStrategy;

public class CreditCardService implements PaymentStrategy {

    private static final String CREDiT_CARD = "CREDIT CARD";

    @Override
    public boolean pay(Product product) {
        System.out.println(CREDiT_CARD);
        System.out.println(String.format("Product: %s Price %s", product.getName(), product.getPrice()));
        return true;
    }
}
