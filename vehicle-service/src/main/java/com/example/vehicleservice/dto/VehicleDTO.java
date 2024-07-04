package com.example.vehicleservice.dto;

/**
 * @author Vithum vindeepa
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VehicleDTO {
    private String id;

    @NotNull(message = "Vehicle type cannot be null")
    @Size(min = 1, message = "Vehicle type cannot be empty")
    private String type;

    @NotNull(message = "User ID cannot be null")
    @Size(min = 1, message = "User ID cannot be empty")
    private String userId;
}

