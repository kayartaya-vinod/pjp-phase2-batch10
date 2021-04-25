package com.sapient.entity;

import lombok.Data;

@Data
public class User {
	private Integer id;
	private String firstname;
	private String lastname;
	private String gender;
	private String phone;
	private String email;
	private String city;
}
