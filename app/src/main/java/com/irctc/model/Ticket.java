package com.irctc.model;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String UserId;
    private String source;
    private String destination;
    private Date LocalDate;
    private Train ticket;

    Ticket(){}

    Ticket(String ticketId, String UserId, String source, String destination, Train ticket, Date LocalDate) {
        this.ticketId = ticketId;
        this.UserId = UserId;
        this.source = source;
        this.destination = destination;
        this.ticket = ticket;
        this.LocalDate = LocalDate;

    }
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public String getUserId() {
        return UserId;
    }
    public void setUserId(String userId) {
        UserId = userId;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Train getTicket() {
        return ticket;
    }
    public void setTicket(Train ticket) {
        this.ticket = ticket;
    }
    public String getTicketInfo() {
        return String.format("Ticket ID: %s belongs to User %s from %s to %s", ticketId, UserId, source, destination);
    }
}
