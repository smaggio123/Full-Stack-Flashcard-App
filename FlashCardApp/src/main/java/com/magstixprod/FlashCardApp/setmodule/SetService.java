
package com.magstixprod.FlashCardApp.setmodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SetService {
	@Autowired
	private SetRepository repository;
	
	public Set createSet(Set set) {
		return repository.save(set);
	}
	public Set getSet(Object id) {
		return repository.findById(id).orElseThrow(()->new EntityNotFoundException());
	}
	public List<Set> getAllSets(){
		return repository.findAll();
	}
	public List<Set> getAllSetsByFolderId(Object folderId){
		return repository.findAllByFolderId(folderId);
	}	
	public Set updateSet(Object id, Set set) {
		Set existingSet = repository.findById(id).orElseThrow(()->new EntityNotFoundException());
		existingSet.setSetId(set.getSetId());
		existingSet.setName(set.getName());
		existingSet.setFolderId(set.getFolderId());
		existingSet.setUserId(set.getUserId());
		return repository.save(set);
	}
	public void deleteSet(Object id) {
		repository.deleteById(id);
	}
}
