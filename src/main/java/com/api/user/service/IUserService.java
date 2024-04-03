package com.api.user.service;

import java.util.List;

import com.api.user.entity.User;
import com.api.user.response.UserResponse;

public interface IUserService {
	public UserResponse save(User user) throws Exception;
	public List<User> listAll();
	
}
