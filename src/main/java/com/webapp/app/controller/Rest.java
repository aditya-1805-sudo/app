package com.webapp.app.controller;


import com.webapp.app.Exceptions.NotEnoughMoneyException;
import com.webapp.app.Models.Payment;
import com.webapp.app.Models.PaymentResult;
import com.webapp.app.Service.PaymentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home")
public class Rest {
    PaymentDetails paymentDetails;
    @Autowired
    public Rest(PaymentDetails paymentDetails){
        this.paymentDetails=paymentDetails;
    }

    @PostMapping("/paymentDetails")
    public ResponseEntity<?> updatePayment(@RequestBody Payment payment){
        double balance=0;
        try {
            balance=paymentDetails.updateBalance(payment);
            PaymentResult paymentResult=new PaymentResult();
            paymentResult.setPaymentId(payment.getPaymentId());
            paymentResult.setBalance(balance);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(paymentResult);
        }
        catch (NotEnoughMoneyException e){
            throw new NotEnoughMoneyException();
        }
    }
}
