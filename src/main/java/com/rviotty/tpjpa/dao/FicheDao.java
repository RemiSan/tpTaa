package com.rviotty.tpjpa.dao;

import com.rviotty.tpjpa.entities.Fiche;

public class FicheDao extends AbstractDao<Long, Fiche> {

	public FicheDao() {
		super(Fiche.class);
	}

}
