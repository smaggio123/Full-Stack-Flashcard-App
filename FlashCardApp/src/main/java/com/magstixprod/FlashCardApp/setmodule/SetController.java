
package com.magstixprod.FlashCardApp.setmodule;

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
@RequestMapping("/api/sets")
public class SetController {
	@Autowired
	private SetService service;
	
	@PostMapping("")
	public Set createSet(@RequestBody Map<String,Object> json) {
		Set set = new Set();
		set.setName((String)json.get("name"));
		set.setFolderId((int)json.get("folderId"));
		set.setUserId((int)json.get("userId"));
		return service.createSet(set);
	}
	@GetMapping("set/{id}")
	public Set getSet(@PathVariable Object id) {
		return service.getSet(id);
	}
	@GetMapping("allsets")
	public List<Set> getAllSets(){
		return service.getAllSets();
	}
	@GetMapping("set/{folderid}")
	public List<Set> getAllSetsByFolderId(@PathVariable Object id){
		return service.getAllSetsByFolderId(id);
	}	
	@PutMapping("/{id}")
	public Set updateSet(@PathVariable Object id, @RequestBody Map<String,Object> json) {
		Set set = new Set();
		set.setSetId(Integer.parseInt((String)id));
		set.setName((String)json.get("name"));
		set.setFolderId((int)json.get("folderId"));
		set.setUserId((int)json.get("userId"));
		return service.updateSet(id, set);
	}
	@DeleteMapping("/{id}")
	public void deleteSet(@PathVariable Object id) {
		service.deleteSet(id);
	}
}

