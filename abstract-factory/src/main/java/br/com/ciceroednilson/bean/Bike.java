package br.com.ciceroednilson.bean;

import java.math.BigDecimal;

public class Bike extends Product {

    public Bike() {
        super.setPrice(BigDecimal.TEN);
        super.setName(this.getClass().getSimpleName().toUpperCase());
    }
}
