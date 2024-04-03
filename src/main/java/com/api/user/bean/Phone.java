package com.api.user.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.api.user.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="phones")
public class Phone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String number;
	private String cityCode;
	private String countryCode;
	
	@ManyToOne
	private User user;
}