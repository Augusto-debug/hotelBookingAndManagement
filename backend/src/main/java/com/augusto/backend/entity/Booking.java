package com.augusto.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Check-in date is required")
    private LocalDate checkIn;
    @Future(message = "Check-out date must be in the future")
    private LocalDate checkOut;
    @Min(value = 1, message = "Number of adults must be at least 1")
    private int numberOfAdults;
    @Min(value = 0, message = "Number of children must be at least 0")
    private int numberOfChildren;
    private int numberOfGuests;
    private String bookingConfirmationCode;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;

    public void caculateNumberOfGuests() {
        numberOfGuests = numberOfAdults + numberOfChildren;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
        caculateNumberOfGuests();
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
        caculateNumberOfGuests();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingConfirmationCode='" + bookingConfirmationCode + '\'' +
                ", id=" + id +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", numberOfAdults=" + numberOfAdults +
                ", numberOfChildren=" + numberOfChildren +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }
}
