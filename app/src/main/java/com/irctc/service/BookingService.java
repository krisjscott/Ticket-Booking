package com.irctc.service;

import com.irctc.model.Booking;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



public class BookingService {
    private List<Booking> bookings = new ArrayList<>();


    public Booking createBooking(String userId, String trainId, int SeatNumber){
        Booking booking = new Booking();
        booking.setBookingId(generateBookingID());
        booking.setUserId(userId);
        booking.setTrainId(trainId);
        booking.setSeatNumber(SeatNumber);

        bookings.add(booking);

        System.out.println("Booking created Successfully: "+ booking.getBookingId());
        return booking;
    }

    public boolean cancelBooking(String bookingId){
        for(Booking booking : bookings) {
            if (booking.getBookingId().equals(bookingId)) {
                bookings.remove(booking);
                System.out.println("Booking cancelled successfully");
                return true;
            }
        }
        System.out.println("Booking cancelled failed");
        return false;
    }



    private String generateBookingID() {
        return UUID.randomUUID().toString();
    }
}
