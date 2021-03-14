package com.ashcintosh.demo.data.repository;

import com.ashcintosh.demo.data.entity.Room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
