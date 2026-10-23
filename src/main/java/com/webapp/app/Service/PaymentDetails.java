package com.webapp.app.Service;

import com.webapp.app.Models.Payment;

public interface PaymentDetails {

    public double getBalance(String userId);
    public double updateBalance(Payment payment);
}
