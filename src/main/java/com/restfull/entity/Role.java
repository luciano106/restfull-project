package com.restfull.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;

	@ManyToOne
	private RoleType roleType;

	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "role", fetch = FetchType.LAZY)
	private List<User> users;

	public long getId() {
		return id;
	}

	public RoleType getRoleType() {
		return roleType;
	}

	public List<User> getUsers() {
		return users;
	}

}
