package com.acks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acks.Contact;
import com.acks.User1;
import com.acks.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	
	  public String insert(User1 user) 
	  {
		  return this.userDao.insertuser(user);
		  }
	 
	
//	//admin insert
//	public String insertAdmin(Admin1 admin)
//	{
//		return this.userDao.insertAdmin(admin);
//	}
//	
//	/*
//	 * public User1 validationuser(String username,String password) { return
//	 * userDao.getsingle(username, password); }
//	 */
//	//admin login 
//	public Admin1 validationuser1(String username,String password)
//	{
//		return userDao.getlogin(username, password);
//	}
//	
//	public Admin1 getsingle(int phone)
//	{
//		Admin1 admin = this.userDao.singledata(phone);
//		return admin;
//	}
//	
//	//select all
//		public List<Admin1> all()
//		{
//			return  this.userDao.getAll();
//		}

	  
	  public User1 getsingle(String username,String password)
		{
			 User1 user1 = this.userDao.getsingle(username, password);
			return user1;
		}
	  
	  
	  public User1 validation(String username)
			{
				 User1 user1 = this.userDao.validation(username);
				return user1;
			}
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
