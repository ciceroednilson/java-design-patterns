package br.com.ciceroednilson.bean;

import java.math.BigDecimal;

public class Skate extends Product {

    public Skate() {
        super.setPrice(BigDecimal.ONE);
        super.setName(this.getClass().getSimpleName().toUpperCase());
    }
}
