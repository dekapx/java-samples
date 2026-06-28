package com.dekapx.java.enums;

public enum PaymentMethod {
    CREDIT_CARD {
        @Override
        public boolean processPayment(double amount) {
            System.out.println("Processing Credit Card payment of $" + amount);
            return amount < 1000;
        }
    },
    PAYPAL {
        @Override
        public boolean processPayment(double amount) {
            System.out.println("Processing PayPal payment of $" + amount);
            return amount < 5000;
        }
    },
    BANK_TRANSFER {
        @Override
        public boolean processPayment(double amount) {
            System.out.println("Processing Bank Transfer payment of $" + amount);
            return true;
        }
    };

    public abstract boolean processPayment(double amount);

    static void main() {
        PaymentMethod paymentMethod = PaymentMethod.CREDIT_CARD;
        double amount = 750.00;

        boolean success = paymentMethod.processPayment(amount);
        System.out.println("Payment successful: " + success);

        for (PaymentMethod method : PaymentMethod.values()) {
            System.out.println("Testing " + method.name() + " with amount $" + amount);
            boolean result = method.processPayment(amount);
            System.out.println("Payment successful: " + result);
        }
    }
}
