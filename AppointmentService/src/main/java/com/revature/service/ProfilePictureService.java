package com.revature.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.revature.exception.ImageConflictException;
import com.revature.exception.ImageNotFoundException;
import com.revature.model.ProfilePicture;
import com.revature.model.User;
import com.revature.repositiry.ProfilePictureRepository;
import com.revature.repositiry.UserRepository;

@Service
public class ProfilePictureService {
	
	private UserRepository userRepository;

	private ProfilePictureRepository profilePictureRepository;

	public ProfilePictureService(UserRepository userRepository, ProfilePictureRepository profilePictureRepository) {
		this.userRepository = userRepository;
		this.profilePictureRepository = profilePictureRepository;
	}

	public ProfilePicture addImage(User user, MultipartHttpServletRequest request) throws IOException, ImageConflictException {
		
		MultipartFile mPF = request.getFile("image");
		byte[] bytes = mPF.getBytes();
		if (bytes == null) {
			throw new ImageConflictException("Invalid image");
		} else {
			ProfilePicture profilePicture = new ProfilePicture((long) 0, bytes, user);
			return profilePictureRepository.save(profilePicture);
		}		
	}
	
	public ProfilePicture getImage(Long id) {
		try {
			ProfilePicture profilePicture = userRepository.findById(id).get().getImage();
			if(((MultipartFile) profilePicture).isEmpty() || profilePicture == null) {
				throw new ImageNotFoundException("Image not found");
			}
			return profilePicture;
		}catch (Exception e) {
  			throw new ImageNotFoundException("Image not found");
		}
	}
}
