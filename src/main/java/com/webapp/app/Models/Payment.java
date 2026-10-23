package com.webapp.app.Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private String paymentId;
    private String userId;
    private double amount;
}
