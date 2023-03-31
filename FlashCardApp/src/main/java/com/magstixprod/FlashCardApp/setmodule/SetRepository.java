
package com.magstixprod.FlashCardApp.setmodule;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetRepository extends JpaRepository<Set,Object>{
	List<Set> findAllByFolderId(Object folder_id);
}
