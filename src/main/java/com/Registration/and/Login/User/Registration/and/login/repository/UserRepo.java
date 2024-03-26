package com.Registration.and.Login.User.Registration.and.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Registration.and.Login.User.Registration.and.login.entity.User;


public interface UserRepo extends JpaRepository<User,Integer>{

	public User findByEmail(String email);
}

