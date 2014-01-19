package com.restfull.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@ManyToOne
	private Role role;

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

	public Role getRole() {
		return role;
	}

}
