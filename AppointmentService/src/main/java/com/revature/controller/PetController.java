package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Pet;
import com.revature.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
	
	private PetService petService;

	@Autowired
	public PetController(PetService petService) {
		this.petService = petService;
	}
	
	//create pet
	@CrossOrigin
	@PostMapping("/register")
	public Pet register(@RequestBody Pet pet) {		
		return petService.createPet(pet);
	}

}
