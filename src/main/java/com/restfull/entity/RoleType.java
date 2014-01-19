package com.restfull.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class RoleType implements Serializable {

	@Id
	private String name;
	
	@Column(length = 50, nullable = true)
	private String description;
	
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "roleType", fetch = FetchType.LAZY)
	private List<Role> roles;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<Role> getRoles() {
		return roles;
	}
	
	

}
