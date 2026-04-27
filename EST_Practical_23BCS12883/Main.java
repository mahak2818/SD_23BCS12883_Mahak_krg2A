class Stock {
    void checkStock() {
        System.out.println("Stock Available");
    }
}
class Payment {
    void pay() {
        System.out.println("Payment Done");
    }
}
class Email {
    void sendMail() {
        System.out.println("Email Sent");
    }
}
class OrderFacade {
    Stock s = new Stock();
    Payment p = new Payment();
    Email e = new Email();
    void placeOrder() {
        s.checkStock();
        p.pay();
        e.sendMail();
        }
    }
public class Main {
    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();
        order.placeOrder();
    }
}