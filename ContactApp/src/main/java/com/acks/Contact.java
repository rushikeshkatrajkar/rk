package com.acks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique;

@Entity
public class Contact {
		@Id
        private int id;
		private String name;
		private int phone;
		private String email;
		private String address;
		private String remark;
		public String getName() {
			return name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
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
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
					+ address + ", remark=" + remark + "]";
		}
		
		
		
	
	

}
