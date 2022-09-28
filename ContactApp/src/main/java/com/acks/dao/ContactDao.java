package com.acks.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acks.Contact;

@Repository
public class ContactDao {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insertuser(Contact contact)
	{
		 this.hibernateTemplate.saveOrUpdate(contact);
		

	}
	//delete
	
	@Transactional
	public void getdelete(int id)
	{
		Contact load = this.hibernateTemplate.load(Contact.class,id);
		this.hibernateTemplate.delete(load);

	}
	//single
	//single data
		public Contact getsingle(int id)
		{
			Contact load = this.hibernateTemplate.get(Contact.class,id);
			return load;
			
		}
	
	
	//all data
	public List<Contact> getAll()
	{
		List<Contact> list = this.hibernateTemplate.loadAll(Contact.class);
		return list;
				
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
