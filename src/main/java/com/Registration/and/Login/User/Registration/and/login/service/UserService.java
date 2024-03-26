package com.Registration.and.Login.User.Registration.and.login.service;

import com.Registration.and.Login.User.Registration.and.login.entity.User;

public interface UserService {
	public User saveUser(User user);
	public void removeSessionMessage();

}
