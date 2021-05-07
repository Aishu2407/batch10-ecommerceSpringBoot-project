package com.te.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
import javax.persistence.Column;

//@Data
@Entity
@Table(name = "admin")

@XmlRootElement(name = "admin-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("admin_info")
public class Admin {

	@Id
	@Column
	private int id;

	@Column
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
