package com.irctc.model;

import java.lang.reflect.InaccessibleObjectException;
import java.util.List;

public class Booking {


     private String bookingId;
     private String userId;
     private String trainId;
     private int seatNumber;

     public void setBookingId(String bookingId) {
          this.bookingId = bookingId;
     }

     public void setUserId(String userId) {
          this.userId = userId;
     }

     public void setTrainId(String trainId) {
          this.trainId = trainId;
     }

     public void setSeatNumber(int seatNumber) {
          this.seatNumber = seatNumber;
     }

     public String getBookingId() {
          return bookingId;
     }

     public static String getUserId() {
          return userId;
     }

     public String getTrainId() {
          return trainId;
     }
     public int getSeatNumber() {
          return seatNumber;
     }
}
