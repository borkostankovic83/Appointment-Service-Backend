package com.revature.repositiry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.ProfilePicture;
import com.revature.model.User;

public interface ProfilePictureRepository extends JpaRepository<ProfilePicture, Long> {

	Optional<ProfilePicture> findById(User user);

}
