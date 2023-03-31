package com.magstixprod.FlashCardApp.foldermodule;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Folder_table")
public class Folder {
	@Id
	@Column(name = "folder_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int folder_id;
	@Column(name = "folder_name", nullable = false)
	private String folder_name;
	@Column(name = "user_id", nullable = false)
	private int userId;
	//Gets folder id
	public int getFolderId() {
		return folder_id;
	}
	public void setFolderId(int folderId) {
		this.folder_id = folderId;
	}
	public String getName() {
		return folder_name;
	}
	public void setName(String name) {
		folder_name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
