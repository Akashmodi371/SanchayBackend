package com.issurance.Application.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Plan {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planid;
	
	@Column
	private String planname;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Policy> policies;
	
	
	
	
}
