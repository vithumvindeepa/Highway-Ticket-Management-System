package com.example.vehicleservice.entity;

/**
 * @author Vithum vindeepa
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "vehicle")
public class Vehicle {

    @Id
    private String id;
    private String type;
    private String userId;
}
