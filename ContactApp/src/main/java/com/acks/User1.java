package com.acks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sun.istack.NotNull;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"username"} )})
public class User1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotEmpty(message = "name will be required")
	@Pattern(regexp = "^[a-zA-Z]+$",message = "Use letters only please")
	@Size(min = 2, max = 12, message = " Allows names between 2 and 12 characters long !!")
	private String name;
//    @Pattern(regexp ="^([0-9]{10})$",message =  "Invalid Mobile Number S!!")
//	@NotEmpty(message = "phone will be required")
	private Long phone;
    @Email
//    @Pattern(regexp="\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",message = "valid email")
	@NotEmpty(message = "email will be required")
	private String email;
    @NotEmpty(message = "address will be required")
	@Pattern(regexp = "^[a-zA-Z0-9]+$",message = "Use letters only please")
	private String address;
    @NotEmpty(message = "username will be required")
	@Pattern(regexp = "^[a-zA-Z]+$",message = "Use letters only please")
	private String username;
	@NotEmpty(message = "password will be required")
	@Pattern(regexp = "^[a-zA-Z]+$",message = "Use letters only please")
	
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", username=" + username + ", password=" + password + "]";
	}

	
	
	
	
	
	

}
