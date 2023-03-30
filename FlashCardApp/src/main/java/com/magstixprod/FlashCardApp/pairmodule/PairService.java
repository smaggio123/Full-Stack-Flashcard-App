/*
package com.magstixprod.FlashCardApp.pairmodule;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
//@NoArgsConstructor
public class PairService {
	//@Autowired
	private PairRepository repository;
	
	public PairService(PairRepository r) {
		this.repository = r;
	}
	
	public void createPair(Pair pair) {
		repository.save(pair);
	}
	public Optional<Pair> getPair(Object id) {
		return repository.findById(id);
	}
	public Iterable<Pair> getAllPairs(){
		return repository.findAll();
	}
	public Iterable<Pair> getAllPairsById(Iterable<Object> id){
		return repository.findAllById(id);
	}	
	public void updatePair(Pair pair) {
		repository.save(pair);
	}
	public void deletePair(Pair pair) {
		repository.delete(pair);
	}
}
*/