package com.acks.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acks.Contact;
import com.acks.User1;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public String insertuser(User1 user)
	{
		int save =(Integer) this.hibernateTemplate.save(user);
		return "save";
		
	}
	
//	//admin insert data
//	@Transactional
//	public String insertAdmin(Admin1 admin)
//	{
//		int save =(Integer) this.hibernateTemplate.save(admin);
//		return "save";
//		
//	}
	
	public User1 getsingle(String username,String password)
	{
		List<User1> user1 = (List<User1>) this.hibernateTemplate.loadAll(User1.class);
		for(User1 user:user1)
		{
			
			if(user.getUsername().equals(username)&&user.getPassword().equals(password))
			return user;
		}
		return null;
		
	}

	public User1 validation(String username)
	{
		List<User1> user1 = (List<User1>) this.hibernateTemplate.loadAll(User1.class);
		for(User1 user:user1)
		{
			
			if(user.getUsername().equals(username))
			return user;
		}
		return null;
		
	}
	
	
//	//admin login
//	public Admin1 getlogin(String username,String password)
//	{
//		List<Admin1> user1 = (List<Admin1>) this.hibernateTemplate.loadAll(Admin1.class);
//		for(Admin1 user:user1)
//		{
//			
//			if(user.getUsername().equals(username)&&user.getPassword().equals(password))
//			return user;
//		}
//		return null;
//		
//	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
//public Admin1 singledata(int phone)
//{
//	Admin1 admin = this.hibernateTemplate.get(Admin1.class, phone);
//	return admin;
//	
//}

	
//public List<Admin1> getAll()
//{
//	List<Admin1> list = this.hibernateTemplate.loadAll(Admin1.class);
//	return list;
//			
//}

	
	

}
