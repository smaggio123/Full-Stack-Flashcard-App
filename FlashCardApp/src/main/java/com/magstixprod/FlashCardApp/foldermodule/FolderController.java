package com.magstixprod.FlashCardApp.foldermodule;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/folders/")
public class FolderController {
	@Autowired
	private FolderService service;
	
	@PostMapping("")
	public Folder createFolder(@RequestBody Map<String,Object> json) {
		Folder folder = new Folder();
		folder.setName((String)json.get("name"));
		folder.setUserId((int)json.get("userId"));
		return service.createFolder(folder);
	}
	@GetMapping("folder/{id}")
	public Folder getFolder(@PathVariable Object id) {
		return service.getFolder(id);
	}
	@GetMapping("allfolders")
	public List<Folder> getAllFolders(){
		return service.getAllFolders();
	}
	@GetMapping("user/{userid}")
	public List<Folder> getAllFoldersByUserId(@PathVariable Object userId){
		return service.getAllFoldersByUserId(userId);
	}
	@PutMapping("/{id}")
	public Folder updateFolder(@PathVariable Object id, @RequestBody Map<String,Object> json) {
		Folder folder = new Folder();
		folder.setFolderId(Integer.parseInt((String)id));
		folder.setName((String)json.get("name"));
		folder.setUserId((int)json.get("userId"));
		return service.updateFolder(id, folder);
	}
	@DeleteMapping("/{id}")
	public void deleteFolder(@PathVariable Object id) {
		service.deleteFolder(id);
	}
	
	
	
}