package com.aatral.ATS.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aatral.ATS.dto.BuManagerDto;


public interface BuManagerService {

	BuManagerDto createBuManager(BuManagerDto buManagerDto);

//	BuManagerDto getBuManager(String id);
//
//	BuManagerDto updateBuManager(BuManagerDto buManagerDto, String id);
//	
//	void deleteBuManager(String id);
//	
//	List<BuManagerDto> getAllBuManager();
//}
}