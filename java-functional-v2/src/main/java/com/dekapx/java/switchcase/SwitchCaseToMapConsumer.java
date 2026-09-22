package com.dekapx.java.switchcase;

import com.dekapx.java.model.PaymentType;

import java.util.Map;
import java.util.function.Consumer;

import static com.dekapx.java.model.PaymentType.CASH;
import static com.dekapx.java.model.PaymentType.CREDIT_CARD;
import static com.dekapx.java.model.PaymentType.DEBIT_CARD;
import static com.dekapx.java.model.PaymentType.PAYPAL;

public class SwitchCaseToMapConsumer {
    static void main() {
        SwitchCaseToMapConsumer demo = new SwitchCaseToMapConsumer();
        demo.processPayment(CASH, 100.0);
        demo.processPayment(CREDIT_CARD, 100.0);
        demo.processPayment(DEBIT_CARD, 100.0);
        demo.processPayment(PAYPAL, 100.0);
    }

    private void processPayment(PaymentType paymentType, double v) {
        Map<PaymentType, Consumer<Double>> paymentTypeMap = Map.of(
                CASH, cashPayment,
                CREDIT_CARD, creditCardPayment,
                DEBIT_CARD, debitCardPayment,
                PAYPAL, paypalPayment
        );
        paymentTypeMap.get(paymentType).accept(v);
    }

    private Consumer<Double> cashPayment = (amount) -> {
        System.out.println("Making cash payment: $" + amount);
    };

    private Consumer<Double> creditCardPayment = (amount) -> {
        System.out.println("Making credit card payment: $" + amount);
    };

    private Consumer<Double> debitCardPayment = (amount) -> {
        System.out.println("Making debit card payment: $" + amount);
    };

    private Consumer<Double> paypalPayment = (amount) -> {
        System.out.println("Making PayPal payment: $" + amount);
    };
}
