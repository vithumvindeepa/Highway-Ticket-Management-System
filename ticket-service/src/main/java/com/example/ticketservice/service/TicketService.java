package com.example.ticketservice.service;

/**
 * @author Vithum vindeepa
 */
import software.ticket_service.dto.TicketDTO;

public interface TicketService {
    String newTicket(TicketDTO ticketDTO);
    void deleteTicket(String id);
    TicketDTO getTicket(String id);
    String updateTicket(TicketDTO ticketDTO);
}
