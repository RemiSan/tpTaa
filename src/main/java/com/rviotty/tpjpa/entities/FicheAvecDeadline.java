package com.rviotty.tpjpa.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("D")
public class FicheAvecDeadline extends Fiche {
	
	private Date dateButoire;

	public Date getDateButoire() {
		return dateButoire;
	}

	public void setDateButoire(Date dateButoire) {
		this.dateButoire = dateButoire;
	}

	@Override
	public String toString() {
		return "FicheAvecDeadline [dateButoire=" + dateButoire + ", Id=" + getId() + ", Title=" + getTitle()
				+ ", user=" + getUser() + ", EstimatedTime=" + getEstimatedTime() + ", Tags=" + getTags()
				+ ", Lieu=" + getLieu() + ", Url=" + getUrl() + ", NoteExplicative="
				+ getNoteExplicative() + ", Section=" + getSection() + "]";
	}

	
}
