package com.example.paymentservice.entity;

/**
 * @author Vithum vindeepa
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "payment")
public class Payment {

    @Id
    private String id;
    private double amount;
    private String userId;
    private String ticket_id;

}

