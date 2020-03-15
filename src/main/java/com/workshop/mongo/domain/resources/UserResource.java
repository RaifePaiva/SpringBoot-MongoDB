package com.workshop.mongo.domain.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.mongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET ) // pode ser usado o GetMapping, aqui é so uma alternativa
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Brown", "maria.brown@gmail.com");
		User alex = new User("2", "Alex grey", "alex.grey@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}

}
