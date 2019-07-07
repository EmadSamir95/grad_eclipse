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
@Table(name="Doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="username")//
	private String userName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="first_name")//
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="last_name")//
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than zero")
	@Max(value=100, message="must be less than or equal to 100")
	@Column(name="age")//
	int age;
	
	@NotNull(message="is required")
	@Column(name="password")
	private String password;
	
	@NotNull(message="is required")
	@Column(name="confirm_password")
    private String confirmPassword;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"    
			   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message="Not valid email")
	@Column(name="mail")//
	private String mail;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="gender")//
	private String gender;
	
	@ContactNumberConstraint
	@Column(name="phone_number1")//
	private String phoneNumber1;
	
	@ContactNumberConstraint
	@Column(name="phone_number2")//
	private String phoneNumber2;
	
	@NotNull(message="is required")
	@Column(name="specialist")//
	private String specialist1;

	@Column(name="specialist2")//
	private String specialist2;
	
	@Column(name="specialist3")//
	private String specialist3;
	
	@Column(name="subspecialist1")//
	private String subSpecialist1;
	
	@Column(name="subspecialist2")//
	private String subSpecialist2;
	
	@Column(name="subspecialist3")//
	private String subSpecialist3;
	
	@Column(name="other_specialist")//
	private String otherSpecialist;
	
	@NotNull(message="is required")
	@Column(name="degree")//
	private String degree;
	
	@Column(name="other_degree")//
	private String otherDegree;
	
	@NotNull(message="is required")
	@Column(name="collage")//
	private String collage;
	
	@NotNull(message="is required")
	@Column(name="year_of_graduation")//
	private int yearOfGraduation;
	
	@Column(name="awards_and_accomplishments")//
	private String awardsAndAccomplishments;
	
	@NotNull(message="is required")
	@Column(name="best_time_to_contact")//
	private String bestTimeToContact;
	
	@NotNull(message="is required")
	@Column(name="response_time")//
	private String responseTime;

	@NotNull(message="is required")
	@Column(name="Fellowship")
	private String Fellowship;

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getSpecialist1() {
		return specialist1;
	}

	public void setSpecialist1(String specialist1) {
		this.specialist1 = specialist1;
	}

	public String getSpecialist2() {
		return specialist2;
	}

	public void setSpecialist2(String specialist2) {
		this.specialist2 = specialist2;
	}

	public String getSpecialist3() {
		return specialist3;
	}

	public void setSpecialist3(String specialist3) {
		this.specialist3 = specialist3;
	}

	public String getSubSpecialist1() {
		return subSpecialist1;
	}

	public void setSubSpecialist1(String subSpecialist1) {
		this.subSpecialist1 = subSpecialist1;
	}

	public String getSubSpecialist2() {
		return subSpecialist2;
	}

	public void setSubSpecialist2(String subSpecialist2) {
		this.subSpecialist2 = subSpecialist2;
	}

	public String getSubSpecialist3() {
		return subSpecialist3;
	}

	public void setSubSpecialist3(String subSpecialist3) {
		this.subSpecialist3 = subSpecialist3;
	}

	public String getOtherSpecialist() {
		return otherSpecialist;
	}

	public void setOtherSpecialist(String otherSpecialist) {
		this.otherSpecialist = otherSpecialist;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getOtherDegree() {
		return otherDegree;
	}

	public void setOtherDegree(String otherDegree) {
		this.otherDegree = otherDegree;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public int getYearOfGraduation() {
		return yearOfGraduation;
	}

	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

	public String getAwardsAndAccomplishments() {
		return awardsAndAccomplishments;
	}

	public void setAwardsAndAccomplishments(String awardsAndAccomplishments) {
		this.awardsAndAccomplishments = awardsAndAccomplishments;
	}

	public String getBestTimeToContact() {
		return bestTimeToContact;
	}

	public void setBestTimeToContact(String bestTimeToContact) {
		this.bestTimeToContact = bestTimeToContact;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getFellowship() {
		return Fellowship;
	}

	public void setFellowship(String fellowship) {
		Fellowship = fellowship;
	}
	
	public String getSpecialist() {
		return specialist1;
	}

	public void setSpecialist(String specialist) {
		this.specialist1 = specialist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", password=" + password + ", confirmPassword=" + confirmPassword + ", mail=" + mail
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber1 + ", phoneNumber2=" + phoneNumber2
				+ ", specialist1=" + specialist1 + ", specialist2=" + specialist2 + ", specialist3=" + specialist3
				+ ", subSpecialist1=" + subSpecialist1 + ", subSpecialist2=" + subSpecialist2 + ", subSpecialist3="
				+ subSpecialist3 + ", otherSpecialist=" + otherSpecialist + ", degree=" + degree + ", otherDegree="
				+ otherDegree + ", collage=" + collage + ", yearOfGraduation=" + yearOfGraduation
				+ ", awardsAndAccomplishments=" + awardsAndAccomplishments + ", bestTimeToContact=" + bestTimeToContact
				+ ", responseTime=" + responseTime + ", bestTimeToTontact=" +  ", Fellowship="
				+ Fellowship + "]";
	}

	
	
	
	
}
