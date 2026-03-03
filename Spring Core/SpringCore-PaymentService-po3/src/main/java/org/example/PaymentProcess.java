package org.example;

public class PaymentProcess {
    PaymentService paymentService;

    public PaymentProcess(){}

    public PaymentProcess(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void start(){
        paymentService.pay();
    }



}
