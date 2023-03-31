
package com.magstixprod.FlashCardApp.usermodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User createUser(User user) {
		return repository.save(user);
	}
	public User getUser(Object id) {
		return repository.findById(id).orElseThrow(()->new EntityNotFoundException());
	}
	public List<User> getAllUsers(){
		return repository.findAll();
	}
	
	public User updateUser(Object id, User user) {
		User existingUser = repository.findById(id).orElseThrow(()->new EntityNotFoundException());
		existingUser.setId(user.getId());
		existingUser.setName(user.getName());
		existingUser.setUsername(user.getUsername());
		existingUser.setPassword(user.getPassword());
		return repository.save(existingUser);
	}
	public void deleteUser(Object id) {
		repository.deleteById(id);
	}

}
