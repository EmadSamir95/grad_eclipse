package com.gp.registration.form.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="first_name")
	String firstName;	
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="last_name")
	String lastName;
	
	@NotNull(message="is required")
	@Min(value=1, message="must be greater than zero")
	@Max(value=100, message="must be less than or equal to 100")
	@Column(name="age")
	int age;
	
	
	@NotNull(message="is required")
	@Column(name="password")
	String password;

	@Column(name="confirm_password")
    private String confirmPassword;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"    
			   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message="Not valid email")
	@Column(name="mail")
	String mail;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="gender")
	String gender;

	@Column(name="phone_number")
	@ContactNumberConstraint
	String phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", mail=" + mail + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + "]";
	}


}
