package com.aatral.ATS.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Division {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DIV_ID")
    private Long div_id;

    @Column(name = "DIVNAME")
    private String div_name;

    @OneToMany(mappedBy = "division")
    private List<Skill> skills;

    
}


