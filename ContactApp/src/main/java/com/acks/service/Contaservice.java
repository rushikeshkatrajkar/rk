package com.acks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acks.Contact;
import com.acks.dao.ContactDao;

@Service
public class Contaservice {
	@Autowired
	private ContactDao contactDao;
	
	  public void insert(Contact contact) 
	  {
		   this.contactDao.insertuser(contact);
		  }
	  
	  
	  
	//select all
		public List<Contact> all()
		{
			return  this.contactDao.getAll();
		}
		
		//delete
		//delete
		  public void getdelete(int i) 
		  {
			  this.contactDao.getdelete(i);
			  }
		  
		  
		  //single
		//single data
			public Contact singledata(int id)
			{
			  Contact getsingle = this.contactDao.getsingle(id);
			  return getsingle;
			}

	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

}
