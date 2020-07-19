package com.revature.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.ProfilePicture;

public interface ProfilePictureRepository extends JpaRepository<ProfilePicture, Long> {

}
