package com.rviotty.tpjpa.dao;

import com.rviotty.tpjpa.entities.Tag;

public class TagDao extends AbstractDao<Long, Tag> {

	public TagDao() {
		super(Tag.class);
	}

}
