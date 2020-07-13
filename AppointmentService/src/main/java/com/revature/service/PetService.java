package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Pet;
import com.revature.repositiry.PetRepository;

@Service
public class PetService {

	private PetRepository petRepository;

	@Autowired
	public PetService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	public Pet createPet(Pet pet) {
		return petRepository.save(pet);
	}
	
	
	
}
