package com.rviotty.tpjpa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Section implements Serializable{

	private static final long serialVersionUID = -4612494095741324396L;

	private int id;

	private String title;

	public Section() {}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Section [id=" + id + ", title=" + title + "]";
	}
	
}
