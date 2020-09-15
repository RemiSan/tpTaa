package com.rviotty.tpjpa;

import java.util.ArrayList;
import java.util.List;

import com.rviotty.tpjpa.entities.Fiche;
import com.rviotty.tpjpa.entities.FicheAvecDeadline;
import com.rviotty.tpjpa.entities.Section;
import com.rviotty.tpjpa.entities.Tag;
import com.rviotty.tpjpa.entities.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Dao dao = new Dao();
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
    	dao.addEntity(t1);
    	dao.addEntity(t2);
    	tags.add(t1);
    	tags.add(t2);
    	fich.setTags(tags);
    	dao.addEntity(user);
    	dao.addEntity(sec);
    	dao.addEntity(fich);
    	dao.addEntity(ficheAvecDeadline);
    	for (User u : dao.getUsers()) {
    		System.out.println(u.toString());
    	}
    	for (Section s : dao.getSections()) {
    		System.out.println(s.toString());
    	}
    	for (Fiche f : dao.getFiches()) {
    		System.out.println(f.toString());
    	}
        dao.close();
    }
}
