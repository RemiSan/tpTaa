package com.rviotty.tpjpa.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class FicheAvecDeadline extends Fiche {

	private static final long serialVersionUID = -7154391038264630642L;
	
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
