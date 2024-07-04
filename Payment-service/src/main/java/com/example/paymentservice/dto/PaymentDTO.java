package com.example.paymentservice.dto;

/**
 * @author Vithum vindeepa
 */
public class PaymentDTO {
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public class PaymentDTO {

        private String id;

        @NotNull(message = "Payment amount cannot be null")
        @Positive(message = "Payment amount must be positive")
        private Double amount;

        @NotNull(message = "User ID cannot be null")
        @Size(min = 1, message = "User ID cannot be empty")
        private String userId;

        @NotNull(message = "Ticket ID cannot be null")
        @Size(min = 1, message = "Ticket ID cannot be empty")
        private String ticket_id;
}
