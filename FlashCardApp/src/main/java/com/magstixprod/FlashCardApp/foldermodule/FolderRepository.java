package com.magstixprod.FlashCardApp.foldermodule;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder,Object>{
	List<Folder> findByUserId(Object user_id);
}
