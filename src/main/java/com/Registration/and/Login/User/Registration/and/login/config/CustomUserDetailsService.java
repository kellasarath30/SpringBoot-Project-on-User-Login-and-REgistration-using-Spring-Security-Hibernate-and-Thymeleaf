package com.Registration.and.Login.User.Registration.and.login.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.Registration.and.Login.User.Registration.and.login.entity.User;
import com.Registration.and.Login.User.Registration.and.login.repository.UserRepo;

@Component
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userRepo.findByEmail(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("User not Found");
		}
		else
		{
		return new CustomUser(user);
		}
	}

}
