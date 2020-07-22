package com.revature.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
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

	@CrossOrigin
	@GetMapping("image/{userId}")
	public ResponseEntity<ProfilePicture> getImage(@PathVariable int userId) throws ImageNotFoundException {
		try {
	      return ResponseEntity.ok(userService.findById((long) userId).getImage());
	    } catch (ImageNotFoundException e) {
	      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Image not found!", e);
	    }
	  }

	
//	@PutMapping("/update/{user_id}")
//	public void updateImage(@PathVariable int id, MultipartHttpServletRequest file) throws IOException, ResourceNotFoundException {
//		ProfilePicture im = profilePictureService.findByUserId(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Image not found"));
//		System.out.println("Original Image Byte Size - " + file.getBytes().length);
//		im.setName(file.getOriginalFilename());
//		im.setPicByte(compressBytes(file.getBytes()));
//		im.setType(file.getContentType());
//		final ProfilePicture updatedImageModel = profilePictureService.save(im);
//	}
//	
	
	
	@CrossOrigin
	@PutMapping("/image/{id}")
	public ResponseEntity<ProfilePicture> addImage(@PathVariable int id, MultipartHttpServletRequest file){
		User user = userService.findById((long) id);
	    try {
	      return ResponseEntity.ok(profilePictureService.addImage(user, file));
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
