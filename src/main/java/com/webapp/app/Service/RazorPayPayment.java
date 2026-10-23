package com.webapp.app.Service;

import com.webapp.app.Exceptions.NotEnoughMoneyException;
import com.webapp.app.Models.Payment;
import org.springframework.stereotype.Service;

@Service
public class RazorPayPayment implements PaymentDetails{
    @Override
    public double getBalance(String userId) {
        return 100.0;
    }

    @Override
    public double updateBalance(Payment payment) {
        double amount=payment.getAmount();
        double balance=getBalance("1234");
        if(amount>balance){
            throw new NotEnoughMoneyException();
        }
        return balance-amount;
    }
}
