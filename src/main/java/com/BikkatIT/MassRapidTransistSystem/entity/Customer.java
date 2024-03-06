package com.BikkatIT.MassRapidTransistSystem.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.BikkatIT.MassRapidTransistSystem.payloads.ApiContants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customerDeta")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	
	@Column(name="first_Name")
	@NotEmpty
	private String firstName;
	
	@Column(name="last_Name")
	@NotEmpty
	private String lastName;
	
	@Column(name="email_Id")
	@NotNull
	@Email(message = ApiContants.USER_EMAIL_VALIDATION_MSG)
	private String emailId;
	
	@Column(name="birth_Date")
	@NotEmpty
	private String birthDate;
	
	@Column(name="mobile_Number")
	@NotEmpty
	private long mobNumber;
	
	

}
