/**
 * 
 */
package com.techhungry.providers.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shabarish
 *
 */
@RestController
@RequestMapping("/providers")
public class Providers {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<String> getProviders(@PathVariable("id") String id) {
		
		return new ResponseEntity<String>("provider data "+id,HttpStatus.ACCEPTED);
	}

}
