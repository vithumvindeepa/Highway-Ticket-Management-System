package com.example.userservice.dto;

/**
 * @author Vithum vindeepa
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO {

    private String id;

    @NotNull(message = "User name can't be null")
    private String name;

}

