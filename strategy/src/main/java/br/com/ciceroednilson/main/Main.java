package br.com.ciceroednilson.main;

import br.com.ciceroednilson.bean.Order;
import br.com.ciceroednilson.bean.Product;
import br.com.ciceroednilson.service.CreditCardService;
import br.com.ciceroednilson.service.TicketService;
import br.com.ciceroednilson.strategy.PaymentStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final String CREDIT_CARD = "creditCard";
    private static final String TICKET = "ticket";

    public static void main(String[] args) {
        final Map<String, PaymentStrategy> strategy = new HashMap<>();
        strategy.put(CREDIT_CARD, new CreditCardService());
        strategy.put(TICKET, new TicketService());

        final Order orderBike = new Order();
        orderBike.setPaymentType(TICKET);
        orderBike.setProduct(new Product("Bike", BigDecimal.TEN));
        strategy.get(orderBike.getPaymentType()).pay(orderBike.getProduct());

        final Order orderCreditCard = new Order();
        orderCreditCard.setPaymentType(CREDIT_CARD);
        orderCreditCard.setProduct(new Product("Skate", BigDecimal.TEN));
        strategy.get(orderCreditCard.getPaymentType()).pay(orderCreditCard.getProduct());
    }
}
