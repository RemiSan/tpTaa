package com.rviotty.tpjpa;

import java.util.ArrayList;
import java.util.List;

import com.rviotty.tpjpa.dao.FicheDao;
import com.rviotty.tpjpa.dao.IDao;
import com.rviotty.tpjpa.dao.SectionDao;
import com.rviotty.tpjpa.dao.TagDao;
import com.rviotty.tpjpa.dao.UserDao;
import com.rviotty.tpjpa.entities.Fiche;
import com.rviotty.tpjpa.entities.FicheAvecDeadline;
import com.rviotty.tpjpa.entities.Section;
import com.rviotty.tpjpa.entities.Tag;
import com.rviotty.tpjpa.entities.User;

public class App 
{
    public static void main( String[] args )
    {
    	IDao<Long,User> userDao = new UserDao();
    	IDao<Long,Section> sectionDao = new SectionDao();
    	IDao<Long,Tag> tagDao = new TagDao();
    	IDao<Long,Fiche> ficheDao = new FicheDao();
    	User user = new User("Moi");
    	Fiche fich = new Fiche();
    	FicheAvecDeadline ficheAvecDeadline = new FicheAvecDeadline();
    	fich.setLieu("lieuTest");
    	ficheAvecDeadline.setLieu("lieuDeadline");
    	fich.setTitle("title fiche");
    	ficheAvecDeadline.setTitle("title deadline");
    	Section sec = new Section();
    	sec.setTitle("termine");
    	fich.setSection(sec);
    	ficheAvecDeadline.setSection(sec);
    	fich.setUser(user);
    	ficheAvecDeadline.setUser(user);
    	List<Tag> tags = new ArrayList<Tag>();
    	Tag t1 = new Tag("tagtag");
    	Tag t2 = new Tag("testdetageheh");
    	
    	tags.add(t1);
    	tags.add(t2);
    	fich.setTags(tags);
    	tagDao.save(t1);
    	tagDao.save(t2);
    	userDao.save(user);
    	sectionDao.save(sec);
    	ficheDao.save(fich);
    	ficheDao.save(ficheAvecDeadline);
    	for (User u : userDao.findAll()) {
    		System.out.println(u.toString());
    	}
    	for (Section s : sectionDao.findAll()) {
    		System.out.println(s.toString());
    	}
    	for (Fiche f : ficheDao.findAll()) {
    		System.out.println(f.toString());
    	}
    }
}
