package com.api.user.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.user.entity.User;
import com.api.user.repository.UserRepository;
import com.api.user.response.ErrorResponse;
import com.api.user.response.UserResponse;
import com.api.user.service.IUserService;
import com.api.util.Constants;
import com.api.util.Util;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public UserResponse save(User user) throws Exception{
		if (Util.validateEmailFormat(user.getEmail())) {
			if (repository.existsByEmail(user.getEmail())) {
				throw new Exception(Constants.MSG_ERROR_EXIST_EMAIL);
			}else {
				User u = repository.save(user);
				UUID uuid = UUID.randomUUID();
				UserResponse uResponse = new UserResponse();
				String dateNow = LocalDate.now().toString();
				uResponse.setId(u.getId());
				uResponse.setCreated(dateNow);
				uResponse.setModified(dateNow);
				uResponse.setLast_login(dateNow);
				uResponse.setToken(uuid.toString());
				uResponse.setActive(true);
				return uResponse;
			}
		}else {
			throw new Exception(Constants.MSG_ERROR_FORMAT);
		}

	}

	@Override
	public List<User> listAll() {
		return repository.findAll();
	}

}
