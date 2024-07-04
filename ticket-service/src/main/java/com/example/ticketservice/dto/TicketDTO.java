package com.example.ticketservice.dto;

/**
 * @author Vithum vindeepa
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TicketDTO {
    private String id;

    @NotNull(message = "Description cannot be null")
    @Size(min = 1, message = "Description cannot be empty")
    private String description;

    @NotNull(message = "Date cannot be null")
    @Size(min = 1, message = "Date cannot be empty")
    private String date;

    @NotNull(message = "Time cannot be null")
    @Size(min = 1, message = "Time cannot be empty")
    private String time;

    @NotNull(message = "Status cannot be null")
    @Size(min = 1, message = "Status cannot be empty")
    private String status;

    @NotNull(message = "Vehicle ID cannot be null")
    @Size(min = 1, message = "Vehicle ID cannot be empty")
    private String vehicleId;
}

