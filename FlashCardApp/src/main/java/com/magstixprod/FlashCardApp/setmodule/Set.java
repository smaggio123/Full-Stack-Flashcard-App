
package com.magstixprod.FlashCardApp.setmodule;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Set_table")
public class Set {
	@Id
	@Column(name = "set_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int setId;
	@Column(name = "set_name", nullable = false)
	private String setName;
	//private List<Pair> ListOfTerms;
	@Column(name = "Folder_id", nullable = false)
	private int folderId;
	@Column(name = "User_id", nullable = false)
	private int userId;
	
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public String getName() {
		return setName;
	}
	public void setName(String name) {
		setName = name;
	}
	/*
	public List<Pair> getListOfTerms() {
		return ListOfTerms;
	}
	public void setListOfTerms(List<Pair> listOfTerms) {
		ListOfTerms = listOfTerms;
	}
	*/
	public int getFolderId() {
		return folderId;
	}
	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
