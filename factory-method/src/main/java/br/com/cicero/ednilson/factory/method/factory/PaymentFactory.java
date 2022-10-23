package br.com.cicero.ednilson.factory.method.factory;

import br.com.cicero.ednilson.factory.method.definition.Payment;
import br.com.cicero.ednilson.factory.method.enumerator.Type;
import br.com.cicero.ednilson.factory.method.implantation.Credit;
import br.com.cicero.ednilson.factory.method.implantation.Debit;
import br.com.cicero.ednilson.factory.method.implantation.Ticket;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

    public Payment create(final Type type) {
        final Map<Type, Payment> payments = new HashMap<>();
        payments.put(Type.CREDIT, new Credit());
        payments.put(Type.DEBIT, new Debit());
        payments.put(Type.TICKET, new Ticket());
        return payments.get(type);
    }
}
