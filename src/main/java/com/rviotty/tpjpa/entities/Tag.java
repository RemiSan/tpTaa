package com.rviotty.tpjpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag implements Serializable {
	
	private static final long serialVersionUID = 210595189965861011L;

	private int id;
	
	private String name;

	public Tag() {}
	
	public Tag(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + "]";
	}
}
