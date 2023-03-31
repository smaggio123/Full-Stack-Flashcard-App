
package com.magstixprod.FlashCardApp.pairmodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PairService {
	@Autowired
	private PairRepository repository;
	
	public Pair createPair(Pair pair) {
		return repository.save(pair);
	}
	public Pair getPair(Object id) {
		return repository.findById(id).orElseThrow(()->new EntityNotFoundException());
	}
	public List<Pair> getAllPairs(){
		return repository.findAll();
	}
	public List<Pair> getAllPairsBySetId(Object setId){
		return repository.findBySetId(setId);
	}	
	public Pair updatePair(Object id, Pair pair) {
		Pair existingPair = repository.findById(id).orElseThrow(()->new EntityNotFoundException());
		existingPair.setPairId(pair.getPairId());
		existingPair.setTerm(pair.getTerm());
		existingPair.setDefinition(pair.getDefinition());
		existingPair.setSetId(pair.getSetId());
		existingPair.setUserId(pair.getUserId());
		return repository.save(existingPair);
	}
	public void deletePair(Object id) {
		repository.deleteById(id);
	}
}
