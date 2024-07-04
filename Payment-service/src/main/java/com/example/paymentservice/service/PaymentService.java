package com.example.paymentservice.service;

/**
 * @author Vithum vindeepa
 */
public interface PaymentService {

    String makePayment(PaymentDTO paymentDTO);
    void removePayment(String id);
    PaymentDTO getPayment(String id);
    String updatePayment(PaymentDTO paymentDTO);


}