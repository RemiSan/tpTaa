package com.rviotty.tpjpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 619573215036108676L;

	private int id;
	
	private String name, mail;

	public User() {}
	
	public User(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
	
	
	
}
