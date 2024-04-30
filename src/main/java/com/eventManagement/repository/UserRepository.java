package com.eventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventManagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
