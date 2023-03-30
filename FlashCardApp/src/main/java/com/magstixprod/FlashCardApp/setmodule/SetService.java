/*
package com.magstixprod.FlashCardApp.setmodule;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
//@NoArgsConstructor
public class SetService {
	//@Autowired
	private SetRepository repository;
	
	public SetService(SetRepository r) {
		this.repository = r;
	}
	
	public void createSet(Set set) {
		repository.save(set);
	}
	public Optional<Set> getSet(Object id) {
		return repository.findById(id);
	}
	public Iterable<Set> getAllSets(){
		return repository.findAll();
	}
	public Iterable<Set> getAllSetsById(Iterable<Object> id){
		return repository.findAllById(id);
	}	
	public void updateSet(Set set) {
		repository.save(set);
	}
	public void deleteSet(Set set) {
		repository.delete(set);
	}
}
*/