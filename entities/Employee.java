package com.issurance.Application.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
		
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid", referencedColumnName = "userid")
	private UserInfo userInfo;
	
	
}
