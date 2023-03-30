/*
package com.magstixprod.FlashCardApp.pairmodule;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pairs")
public class PairController {
	//@Autowired
		private PairRepository repository;
		
		public PairController(PairRepository r) {
			this.repository = r;
		}
		
		public void createPair(Pair pair) {
			ResponseEntity.ok(this.repository.save(pair));
			//repository.save(pair);
		}
		public ResponseEntity<Optional<Pair>> getPair(Object id) {
			return ResponseEntity.ok(this.repository.findById(id));
			//return repository.findById(id);
		}
		public ResponseEntity<Iterable<Pair>> getAllPairs(){
			return ResponseEntity.ok(this.repository.findAll());
			//return repository.findAll();
		}
		public ResponseEntity<Iterable<Pair>> getAllPairsById(Iterable<Object> id){
			return ResponseEntity.ok(this.repository.findAllById(id));
			//return repository.findAllById(id);
		}	
		public void updatePair(Pair pair) {
			ResponseEntity.ok(this.repository.save(pair));
			//repository.save(pair);
		}
		public void deletePair(Pair pair) {
			repository.delete(pair);
		}
}
*/