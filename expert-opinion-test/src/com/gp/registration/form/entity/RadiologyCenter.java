package com.gp.registration.form.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.gp.registration.form.validation.ContactNumberConstraint;
import com.gp.registration.form.validation.FieldsValueMatch;

@FieldsValueMatch.List({ 
    @FieldsValueMatch(
    	      field = "password", 
    	      fieldMatch = "confirmPassword"
    	    )
    	})

@Entity
@Table(name="radiology_center")
public class RadiologyCenter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="name")
	private String name;
	
	@NotNull(message="is required")
	@Column(name="password")
	private String password;
	
	@Column(name="confirm_password")
    private String confirmPassword;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"    
			   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message="Not valid email")
	@Column(name="mail")
	private String mail;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="organization")
	private String organization;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="address")
	private String address;
	
	@Column(name="phone_number")
	@ContactNumberConstraint
	private String phoneNumber;
	
	@Column(name="any_comment")
	private String comment;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getOrganization() {
		return organization;
	}



	public void setOrganization(String organization) {
		this.organization = organization;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	@Override
	public String toString() {
		return "RadiologyCenter [id=" + id + ", name=" + name + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", mail=" + mail + ", organization=" + organization + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", comment=" + comment + "]";
	}

	



}
