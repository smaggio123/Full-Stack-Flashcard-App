package com.magstixprod.FlashCardApp.foldermodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FolderService {
	@Autowired
	private FolderRepository repository;
	
	public Folder createFolder(Folder folder) {
		return repository.save(folder);
	}
	public Folder getFolder(Object id) {
		return repository.findById(id).orElseThrow(() -> new EntityNotFoundException());
	}
	public List<Folder> getAllFolders(){
		return repository.findAll();
	}
	public List<Folder> getAllFoldersByUserId(Object userId){
		return repository.findByUserId(userId);
	}
	public Folder updateFolder(Object id, Folder folder) {
		Folder existingFolder = repository.findById(id).orElseThrow(()->new EntityNotFoundException());
		existingFolder.setFolderId(folder.getFolderId());
		existingFolder.setName(folder.getName());
		return repository.save(existingFolder);
	}
	public void deleteFolder(Object id) {
		repository.deleteById(id);
	}
	
}
