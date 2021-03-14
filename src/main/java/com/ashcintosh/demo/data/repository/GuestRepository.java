package com.ashcintosh.demo.data.repository;

import com.ashcintosh.demo.data.entity.Guest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
