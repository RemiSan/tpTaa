package com.rviotty.tpjpa.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("F")
public class Fiche {
	
	private int id;
	
	private String title;
	
	private User user;
	
	private int estimatedTime;
	
	private List<Tag> tags;
	
	private String lieu;
	
	private String url;
	
	private String noteExplicative;
	
	@OneToMany
	private Section section;

	public Fiche() {}

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
	
	
	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	@OneToMany
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNoteExplicative() {
		return noteExplicative;
	}

	public void setNoteExplicative(String noteExplicative) {
		this.noteExplicative = noteExplicative;
	}

	@ManyToOne
	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "Fiche [id=" + id + ", title=" + title + ", user=" + user
				+ ", estimatedTime=" + estimatedTime + ", tags=" + tags + ", lieu=" + lieu + ", url=" + url
				+ ", noteExplicative=" + noteExplicative + ", section=" + section + "]";
	}

}
