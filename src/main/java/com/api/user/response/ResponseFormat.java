package com.api.user.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseFormat<T> {
	private int status;
	private T data;
	private String message;
		
}
