
import java.util.*;

interface PaymentGateway {

    public void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {

    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of %.2f%n", amount);
    }
}

class UPIPayment implements PaymentGateway {

    public void processPayment(double amount) {
        System.out.printf("Processing UPI payment of %.2f%n", amount);
    }
}

class interfaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> paymentMethods = new ArrayList<>();
        paymentMethods.add("credit");
        paymentMethods.add("upi");
        List<Double> amounts = new ArrayList<>();
        amounts.add(284.5);
        amounts.add(27476.2);

        for (int j = 0; j < paymentMethods.size(); j++) {

            String method = paymentMethods.get(j);
            if (method.equalsIgnoreCase("credit")) {
                PaymentGateway payment = new CreditCardPayment();
                payment.processPayment(amounts.get(j));
            } else if (method.equalsIgnoreCase("upi")) {
                PaymentGateway payment = new UPIPayment();
                payment.processPayment(amounts.get(j));
            }

        }
    }
}
