package com.api.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.user.entity.User;
import com.api.user.response.ResponseFormat;
import com.api.user.response.UserResponse;
import com.api.user.service.IUserService;
import com.api.util.Constants;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService service;
	
	@PostMapping
	public ResponseEntity<ResponseFormat<UserResponse>> saveStudent(@RequestBody User request) throws Exception{
		try {
			ResponseFormat<UserResponse> response = new ResponseFormat<UserResponse>();
			response.setData(service.save(request));
			response.setStatus(Constants.OK);
			response.setMessage(Constants.MSG_OK);
			return new ResponseEntity<ResponseFormat<UserResponse>>(response, HttpStatus.OK);
		} catch (Exception e) {
			ResponseFormat<UserResponse> response = new ResponseFormat<UserResponse>();
			response.setData(null);
			response.setStatus(Constants.NO_OK);
			response.setMessage(e.getMessage());
			return  new ResponseEntity<ResponseFormat<UserResponse>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<User> getAll(){
		return service.listAll();
	}

}
