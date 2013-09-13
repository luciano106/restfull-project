package com.restfull.entity;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column
	private long id;

	@Column(length = 50, nullable = false)
	private String name;

	@Column(length = 50, nullable = false)
	private String lastname;

	@Column(length = 50, nullable = false, unique = true)
	private String uuid;

	@Column(length = 50, nullable = false)
	private String password;

	User() {
		// for hibernate.
	}

	public User(String name, String lastname, String uuid, String password) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.uuid = uuid;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getUuid() {
		return uuid;
	}

	public String getPassword() {
		return password;
	}

}
