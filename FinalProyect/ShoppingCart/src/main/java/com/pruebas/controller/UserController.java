package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.User;
import com.pruebas.service.UserService;

@RestController
@RequestMapping (value="/user")
public class UserController {
	
	UserService userService;
	
	@Autowired
	public UserController (UserService userService) {
	this.userService = userService;
	}
	
	// Method to Create a User   /*{ "password":"123","firstname" : "Middfe", "lastname" : "Wore","dateofbirth" : "05-05-1999"} */ 
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User user) {
       this.userService.addEntity(user);
	   return new ResponseEntity<User>( user, HttpStatus.OK);
	 }
   
	// method to validate id and pass from  User
	@RequestMapping(value="/validate" , method = RequestMethod.GET )
     public String validateUser(
    	@RequestParam(value="password", required = true) String password,	 
    	@RequestParam(value="id", required = true) int id){
		User user = this.userService.getEntity(id);
		if (user.getPassword().equals(password)) {
			return "Loggin Correcto";
		}
		return "Loggin Incorrecto";
	}
	
	// method to get a User by Id
	@RequestMapping(value="/list/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable int id) {
	       User user = this.userService.getEntity(id);
		   return new ResponseEntity<User>( user, HttpStatus.OK);
		 }
	
	
	

}
