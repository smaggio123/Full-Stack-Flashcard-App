
package com.magstixprod.FlashCardApp.pairmodule;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Pair_table")
public class Pair {
	@Id
	@Column(name = "pair_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pairId;
	@Column(name = "term", nullable = false)
	private String term;
	@Column(name = "definition", nullable = false)
	private String definition;
	//private String imagePath;
	@Column(name = "set_id", nullable = false)
	private int setId;
	/*
	@Column(name = "folder_id", nullable = false)
	private int folderId;
	*/
	@Column(name = "user_id", nullable = false)
	private int userId;
	public int getPairId() {
		return pairId;
	}
	public void setPairId(int pairId) {
		this.pairId = pairId;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	/*
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	*/
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	/*
	public int getFolderId() {
		return folderId;
	}
	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}
	*/
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
