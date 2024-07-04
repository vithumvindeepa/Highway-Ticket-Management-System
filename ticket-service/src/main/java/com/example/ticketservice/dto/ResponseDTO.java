package com.example.ticketservice.dto;

/**
 * @author Vithum vindeepa
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ResponseDTO {
    private String code;
    private String message;
    private Object content;

}
