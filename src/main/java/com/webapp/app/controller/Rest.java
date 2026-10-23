package com.webapp.app.controller;


import com.webapp.app.Exceptions.NotEnoughMoneyException;
import com.webapp.app.Models.FakeOrder;
import com.webapp.app.Models.Payment;
import com.webapp.app.Models.PaymentResult;
import com.webapp.app.Proxy.OrderProxy;
import com.webapp.app.Service.PaymentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("home")
public class Rest {
    PaymentDetails paymentDetails;
    OrderProxy orderProxy;
    WebClient webClient;
    @Value("${getAllOrders.url}")
    String url;
    @Autowired
    public Rest(PaymentDetails paymentDetails, OrderProxy orderProxy,WebClient webClient){
        this.paymentDetails=paymentDetails;
        this.orderProxy=orderProxy;
        this.webClient=webClient;
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
    @GetMapping("/allOrders")
    public ResponseEntity<?> getAllOrders(){
        var v=orderProxy.getAllOrders();
//        System.out.println(v.get(0));
        return ResponseEntity.status(HttpStatus.OK)
                .body(v);
    }
    @GetMapping("/order/{Id}")
    public Mono<FakeOrder> getOrderById(@PathVariable int Id){
        return webClient.get()
                .uri(url+"/"+Id)
                .retrieve()
                .bodyToMono(FakeOrder.class);
    }
}
