/*
package com.magstixprod.FlashCardApp.setmodule;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sets")
public class SetController {
	private SetRepository repository;
	
	public SetController(SetRepository r) {
		this.repository = r;
	}
	
	public void createSet(Set set) {
		ResponseEntity.ok(this.repository.save(set));
		//repository.save(set);
	}
	public ResponseEntity<Optional<Set>> getSet(Object id) {
		return ResponseEntity.ok(this.repository.findById(id));
		//return repository.findById(id);
	}
	public ResponseEntity<Iterable<Set>> getAllSets(){
		return ResponseEntity.ok(this.repository.findAll());
		//return repository.findAll();
	}
	public ResponseEntity<Iterable<Set>> getAllSetsById(Iterable<Object> id){
		return ResponseEntity.ok(this.repository.findAllById(id));
		//return repository.findAllById(id);
	}	
	public void updateSet(Set set) {
		ResponseEntity.ok(this.repository.save(set));
		//repository.save(set);
	}
	public void deleteSet(Set set) {
		repository.delete(set);
	}
}
*/
