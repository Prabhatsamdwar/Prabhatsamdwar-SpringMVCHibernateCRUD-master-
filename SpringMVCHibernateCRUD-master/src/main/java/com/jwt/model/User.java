package com.jwt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="USER_TBL")
@Table(name = "USER_TBL")
public class User {
		@Id
		private int pid;
	  public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
	private String username;
	  private String password;
	  private String firstname;
	  private String lastname;
	  private String email;
	  private String address;
	  private String phone;
	  
	  public User() {
		  
	  }
	  public User( String username, String password) {
		  this.username= username;
		  this.password = password;
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
	  public String getFirstname() {
	  return firstname;
	  }
	  public void setFirstname(String firstname) {
	  this.firstname = firstname;
	  }
	  public String getLastname() {
	  return lastname;
	  }
	  public void setLastname(String lastname) {
	  this.lastname = lastname;
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
	  public String getPhone() {
	  return phone;
	  }
	  public void setPhone(String phone) {
	  this.phone = phone;
	  }
	}