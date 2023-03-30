
package com.magstixprod.FlashCardApp.usermodule;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="User_table")
public class User {
	@Id
	@Column(name = "user_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_Id;
	@Column(name = "user_username", nullable = false)
	private String user_username;
	@Column(name = "user_password", nullable = false)
	private String user_password;
	@Column(name = "user_name", nullable = false)
	private String user_name;
	@Column(name = "salt", nullable=false)
	private String salt;
	
	
	
	public User(int user_Id, String user_username, String user_password, String user_name, String salt) {
		this.user_Id = user_Id;
		this.user_username = user_username;
		this.user_password = user_password;
		this.user_name = user_name;
		this.salt = salt;
	}
	public User() {
		
	}
	public int getId() {
		return user_Id;
	}
	public void setId(int id) {
		this.user_Id = id;
	}
	public String getUsername() {
		return user_username;
	}
	public void setUsername(String username) {
		user_username = username;
	}
	public String getPassword() {
		return user_password;
	}
	public void setPassword(String password) {
		user_password = password;
	}
	public String getName() {
		return user_name;
	}
	public void setName(String name) {
		user_name = name;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt=salt;
	}

}

