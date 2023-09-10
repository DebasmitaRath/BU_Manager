package com.aatral.ATS.model;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BuManager {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int request_resource_id;//pk
	private String request_resource_Date;
	private String projectName;
	private String resourceStartDate;
	private String requestorName;
	private String designation;
	private String contactNumber;
	private String email;
	// JOIN WITH USERS
	private String empid;//fk
	private String experienceLevel;
	private String jobDescription;
	private String ctcOfferDetails;
	private String workLocation;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DIV_ID")
	private Division division;

	@ManyToOne
	@JoinColumn(name = "skill_id")
	private Skill skill;

	
}
