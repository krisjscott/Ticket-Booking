package com.irctc.model;

import java.util.List;

public class User {
    private String Name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String UserID;


    public String getHashPassword(String hashPassword){
        return hashPassword;
    }
    public List getTicketsBooked(List<Ticket> ticketsBooked) {
        return ticketsBooked;
    }
    public String getUserID(String userID){
        return userID;
    }
    public String getName(){
        return Name;
    }
    public String getPassword(){
        return password;
    }
    public void printTicket(){
        for(int i=0;i<ticketsBooked.size();i++){
            System.out.println(ticketsBooked.get(i).toString());
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



}
