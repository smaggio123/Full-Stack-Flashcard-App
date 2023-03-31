
package com.magstixprod.FlashCardApp.usermodule;

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
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("")
	public User createUser(@RequestBody Map<String,Object> json) {
		User user = new User();
		user.setUsername((String)json.get("username"));
		user.setPassword((String)json.get("password"));
		user.setName((String)json.get("name"));
		user.setSalt((String)json.get("salt"));
		return service.createUser(user);
	}
	
	@GetMapping("user/{id}")
	public User getUser(@PathVariable Object id) {
		return service.getUser(id);
	}
	@GetMapping("allusers")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Object id,@RequestBody Map<String,Object> json) {
		User user = new User();
		user.setId(Integer.parseInt((String)id));
		user.setUsername((String)json.get("username"));
		user.setPassword((String)json.get("password"));
		user.setName((String)json.get("name"));
		user.setSalt((String)json.get("salt"));
		return service.updateUser(id, user);
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Object id) {
		service.deleteUser(id);
	}
	
}
