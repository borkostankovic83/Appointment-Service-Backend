package com.revature.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
