package com.example.paymentservice.dao;

/**
 * @author Vithum vindeepa
 */
public interface PaymentRepo {
    public interface PaymentRepo extends JpaRepository<Payment, String>
}
