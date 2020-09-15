package com.rviotty.tpjpa.dao;

import com.rviotty.tpjpa.entities.Section;

public class SectionDao extends AbstractDao<Long, Section> {

	public SectionDao() {
		super(Section.class);
	}

}
