
package com.magstixprod.FlashCardApp.pairmodule;

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
@RequestMapping("/api/pairs")
public class PairController {
	@Autowired
	private PairService service;
	
	@PostMapping("")
	public Pair createPair(@RequestBody Map<String,Object> json) {
		Pair pair = new Pair();
		pair.setDefinition((String)json.get("definition"));
		pair.setTerm((String)json.get("term"));
		pair.setSetId((int)json.get("setId"));
		pair.setUserId((int)json.get("userId"));
		return service.createPair(pair);
	}
	@GetMapping("set/{id}")
	public Pair getPair(@PathVariable Object id) {
		return service.getPair(id);
	}
	@GetMapping("allpairs")
	public List<Pair> getAllPairs(){
		return service.getAllPairs();
	}
	@GetMapping("set/{setId}")
	public List<Pair> getAllPairsById(@PathVariable Object setId){
		return service.getAllPairsBySetId(setId);
	}
	@PutMapping("{id}")
	public Pair updatePair(@PathVariable Object id, @RequestBody Map<String,Object> json) {
		Pair pair = new Pair();
		pair.setPairId(Integer.parseInt((String)id));
		pair.setDefinition((String)json.get("definition"));
		pair.setTerm((String)json.get("term"));
		pair.setSetId((int)json.get("setId"));
		pair.setUserId((int)json.get("userId"));
		return service.updatePair(id, pair);
	}
	@DeleteMapping("/{id}")
	public void deletePair(@PathVariable Object id) {
		service.deletePair(id);
	}
}
