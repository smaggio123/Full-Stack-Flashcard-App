
package com.magstixprod.FlashCardApp.usermodule;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Object>{
	 List<User> findByuserusername(String username);
}
