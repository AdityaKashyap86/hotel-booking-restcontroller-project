package com.sunglowsys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class HotelBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String checkInDate;

    @NotNull
    private String checkOutDate;

    @NotNull
    private String totalGuest;

    @NotNull
    private String noOfNights;

    @NotNull
    private String noOfRooms;

    @NotNull
    private String bookingRooms;

    public HotelBooking(){}

    public HotelBooking(String checkInDate, String checkOutDate, String totalGuest, String noOfNights, String noOfRooms, String bookingRooms) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalGuest = totalGuest;
        this.noOfNights = noOfNights;
        this.noOfRooms = noOfRooms;
        this.bookingRooms = bookingRooms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(String totalGuest) {
        this.totalGuest = totalGuest;
    }

    public String getNoOfNights() {
        return noOfNights;
    }

    public void setNoOfNights(String noOfNights) {
        this.noOfNights = noOfNights;
    }

    public String getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getBookingRooms() {
        return bookingRooms;
    }

    public void setBookingRooms(String bookingRooms) {
        this.bookingRooms = bookingRooms;
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalGuest='" + totalGuest + '\'' +
                ", noOfNights='" + noOfNights + '\'' +
                ", noOfRooms='" + noOfRooms + '\'' +
                ", bookingRooms='" + bookingRooms + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        HotelBooking that = (HotelBooking) o;
        return Objects.equals (id, that.id) && Objects.equals (checkInDate, that.checkInDate) && Objects.equals (checkOutDate, that.checkOutDate) && Objects.equals (totalGuest, that.totalGuest) && Objects.equals (noOfNights, that.noOfNights) && Objects.equals (noOfRooms, that.noOfRooms) && Objects.equals (bookingRooms, that.bookingRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, checkInDate, checkOutDate, totalGuest, noOfNights, noOfRooms, bookingRooms);
    }
}
