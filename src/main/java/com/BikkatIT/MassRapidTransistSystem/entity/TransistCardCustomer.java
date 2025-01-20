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
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="transistCard_Details")
public class TransistCardCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transistId;
	
	@Column(name="trasnsistCard_lastDigit")
	private long trasnsistCardNumber;
	

}
