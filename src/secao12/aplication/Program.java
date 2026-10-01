package secao12.aplication;

import secao12.entities.Order;
import secao12.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(999, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(order);

        OrderStatus s1 = OrderStatus.ENTREGUE;
        OrderStatus s2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(s1);
        System.out.println(s2);

    }
}