package com.revature.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.model.ProfilePicture;

public interface ProfilePictureRepository extends JpaRepository<ProfilePicture, Long> {

//	@Query("FROM images WHERE user_id=?")
//	ProfilePicture findByUserId(int id);

}
