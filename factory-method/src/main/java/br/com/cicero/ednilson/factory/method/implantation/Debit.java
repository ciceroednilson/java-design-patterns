package br.com.cicero.ednilson.factory.method.implantation;

import br.com.cicero.ednilson.factory.method.definition.Payment;

import java.math.BigDecimal;

public class Debit implements Payment {

    @Override
    public void pay(final BigDecimal value) {
        System.out.println(String.format("You payed with debit the value %.0f", value));
    }
}
