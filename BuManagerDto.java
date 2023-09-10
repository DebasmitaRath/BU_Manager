package com.aatral.ATS.dto;

import com.aatral.ATS.model.Division;
import com.aatral.ATS.model.Skill;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BuManagerDto {

	private int request_resource_id;
	private String request_resource_Date;
	private String projectName;
	private String resourceStartDate;
	private String requestorName;
	private String designation;
	private String contactNumber;
	private String email;
	private String empid;
	private String experienceLevel;
	private String jobDescription;
	private String ctcOfferDetails;
	private String workLocation;

    private Skill skill;
    
    private Division division;
}
