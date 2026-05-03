package com.irctc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String Name;
    private String password;

    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String UserID;

    public User() {}

    public User(String Name, String password, String hashPassword, List ticketsBooked, String userID){
        this.Name = Name;
        this.password = password;
        this.hashPassword = hashPassword;
        this.ticketsBooked = ticketsBooked;
        UserID = userID;
    }
    public String getHashPassword(){
        return hashPassword;
    }
    public List getTicketsBooked() {
        return ticketsBooked;
    }
    public String getUserID(){
        return UserID;
    }

    public String getName(){
        return Name;
    }

    public String getPassword(){
        return password;
    }

    public void printTicket(){
        if(ticketsBooked.size()>0){
            for(int i=0;i<ticketsBooked.size();i++){
            System.out.println(ticketsBooked.get(i).getTicket().getTrainInfo());
            }
        }
        else{
            System.out.println("No Tickets Booked");
        }

    }

    public void setName(String name){
        this.Name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked){
        this.ticketsBooked = ticketsBooked;
    }

    public void setUserID(String userID){
        this.UserID = userID;
    }

    public void setHashPassword(String hashPassword){
        this.hashPassword = hashPassword;
    }




}
