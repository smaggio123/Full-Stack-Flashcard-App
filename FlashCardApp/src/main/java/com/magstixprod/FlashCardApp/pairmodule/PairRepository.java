
package com.magstixprod.FlashCardApp.pairmodule;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PairRepository extends JpaRepository<Pair,Object>{
	List<Pair> findBySetId(Object set_id);
}
