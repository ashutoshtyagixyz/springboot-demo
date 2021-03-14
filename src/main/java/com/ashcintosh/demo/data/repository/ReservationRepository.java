package com.ashcintosh.demo.data.repository;

import java.sql.Date;

import com.ashcintosh.demo.data.entity.Reservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
