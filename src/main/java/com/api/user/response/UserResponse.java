package com.api.user.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
	private long id;
	private String created;
	private String modified;
	private String last_login;
	private String token;
	private boolean isActive;
}
