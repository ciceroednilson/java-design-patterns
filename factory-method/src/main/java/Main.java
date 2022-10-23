import br.com.cicero.ednilson.factory.method.definition.Payment;
import br.com.cicero.ednilson.factory.method.enumerator.Type;
import br.com.cicero.ednilson.factory.method.factory.PaymentFactory;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        final PaymentFactory factory = new PaymentFactory();
        final Payment credit = factory.create(Type.CREDIT);
        credit.pay(BigDecimal.TEN);
        final Payment debit = factory.create(Type.DEBIT);
        debit.pay(BigDecimal.ONE);
        final Payment ticket = factory.create(Type.TICKET);
        ticket.pay(BigDecimal.TEN);
    }
}
