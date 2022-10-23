package br.com.ciceroednilson.strategy;

import br.com.ciceroednilson.bean.Product;

public interface PaymentStrategy {

    boolean pay(Product product);
}
