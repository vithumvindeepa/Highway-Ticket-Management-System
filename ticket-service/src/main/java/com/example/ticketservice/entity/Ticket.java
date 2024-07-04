package com.example.ticketservice.entity;

/**
 * @author Vithum vindeepa
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ticket")
public class Ticket {

    @Id
    private String id;
    private String description;
    private String date;
    private String time;
    private String status;
    private String vehicleId;

}

