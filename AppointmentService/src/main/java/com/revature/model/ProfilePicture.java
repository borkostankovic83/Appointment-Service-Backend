package com.revature.model;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "images")
public class ProfilePicture {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "image")
	@Lob
	private byte[] image;

//	@OneToOne(cascade = CascadeType.REFRESH)
//	@JoinColumn(name = "user_id")
//	@JsonIgnoreProperties({"images", "pets"})
	@OneToOne(mappedBy = "images")
	private User user;

	public ProfilePicture() {
	}

	public ProfilePicture(Long id, byte[] image, User user) {
		this.id = id;
		this.image = image;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ProfilePicture [id=" + id + ", image=" + Arrays.toString(image) + ", user=" + user + "]";
	}
	    

}
