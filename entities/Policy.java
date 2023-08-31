package com.issurance.Application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Policy {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policynumber;
	
	@Column
	private String policyname;
	
	@Column
	private int minage;
	
	@Column
	private int maxage;
	
	@Column
	private int minamount;
	
	@Column
	private int maxamount;
	
	@Column
	private double interestrate;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
	@JsonIgnore
    private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="planid", referencedColumnName = "planid")
	@JsonIgnore
	private Plan plan;
	
	
	
	
}
