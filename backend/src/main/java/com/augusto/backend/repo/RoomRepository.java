package com.augusto.backend.repo;

import com.augusto.backend.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query("SELECT DISTINCT r.roomType FROM Room r") // Retorna uma lista de tipos unicos de quarto.
    List<String> findDistinctRoomType();

    @Query("SELECT r FROM Room r WHERE r.roomType LIKE %:roomType AND r.id NOT IN " +
            "(SELECT bk.room.id FROM Booking bk WHERE bk.checkIn <= :checkOutDate " +
            "AND bk.checkOut >= :checkInDate)") // Retorna uma lista de quartos disponiveis de um tipo especifico.
    List<Room> findByDateAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    @Query("SELECT r FROM Room r WHERE r.id NOT IN (SELECT b.room.id FROM Booking b)") // Seleciona todos os quartos disponiveis.
    List<Room> getAllAvailableRooms();
}
