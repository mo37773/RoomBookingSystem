/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roombookingsystem;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author marti
 */
public class RoomBooking {

    private int bookingId;
    private Room room;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDateTime createdAt;

    public RoomBooking(int bookingId, Room room, LocalTime startTime, LocalTime endTime, LocalDateTime createdAt) {
        this.bookingId = bookingId;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createdAt = createdAt;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getRoomNo() {
        //hopefully this will just access the getter straight from dhruva room class
        return room.getRoomNumber();
    }

    public void setRoomNo(Room room) {
        //same as above hopefully it will access the room class and set the room no there 
        this.room = room;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

}
