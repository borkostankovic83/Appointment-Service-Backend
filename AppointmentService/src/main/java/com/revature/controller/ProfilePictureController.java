package com.revature.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.server.ResponseStatusException;

import com.revature.exception.ImageConflictException;
import com.revature.exception.ImageNotFoundException;
import com.revature.exception.UserNotFoundException;
import com.revature.model.ProfilePicture;
import com.revature.model.User;
import com.revature.service.ProfilePictureService;
import com.revature.service.UserService;

@RestController
public class ProfilePictureController {
	
	private ProfilePictureService profilePictureService;
	
	private UserService userService;
	
	public ProfilePictureController(ProfilePictureService profilePictureService, UserService userService) {
		this.profilePictureService = profilePictureService;
		this.userService = userService;
	}

	@GetMapping("image/{userId}")
	public ResponseEntity<ProfilePicture> getImage(@PathVariable int userId) throws ImageNotFoundException {
		try {
	      return ResponseEntity.ok(profilePictureService.getImage((long) userId));
	    } catch (ImageNotFoundException e) {
	      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Image not found!", e);
	    }
	  }

	
	@PutMapping("/image/{id}")
	public ResponseEntity<ProfilePicture> addImage(@PathVariable int id, MultipartHttpServletRequest request){
		User user = userService.findById((long) id);
	    try {
	      return ResponseEntity.ok(profilePictureService.addImage(user, request));
	    }
	    catch (UserNotFoundException e) {
	      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found!", e);
	    }
	    catch( ImageConflictException e) {
	      throw new ResponseStatusException(HttpStatus.CONFLICT, "There was an issue uploading the image!", e);
	    } catch (IOException e) {
	      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There was an I/O error!", e);
	    }
	    
	  }
}
