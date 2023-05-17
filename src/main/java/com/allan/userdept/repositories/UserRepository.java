package com.allan.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allan.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
