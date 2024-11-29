package com.augusto.backend.repo;

import com.augusto.backend.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByRoomId(Long roomId);
    List<Booking> findByBookingConfirmation(String bookingConfirmation);
    List<Booking> findByUserId(Long userId);
}
