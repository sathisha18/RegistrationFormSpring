package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{

}
