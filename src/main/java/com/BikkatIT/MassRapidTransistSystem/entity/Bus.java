package com.BikkatIT.MassRapidTransistSystem.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BusDetails")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer busId;
	
	@Column(name="Leaving_From")
	private String leavingFrom;
	
	@Column(name="Going_To")
	private String goingTo;

	@Column(name="Date_Of_Departure")
	private String dateOfDeparture;
	
	
}
