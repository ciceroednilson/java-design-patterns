package br.com.ciceroednilson.service;

import br.com.ciceroednilson.bean.Product;
import br.com.ciceroednilson.strategy.PaymentStrategy;

public class TicketService implements PaymentStrategy {
    
    private static final String TICKET = "TICKET";

    @Override
    public boolean pay(Product product) {
        System.out.println(TICKET);
        System.out.println(String.format("Product: %s Price %s", product.getName(), product.getPrice()));
        return true;
    }
}
