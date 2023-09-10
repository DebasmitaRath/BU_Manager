package com.aatral.ATS.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aatral.ATS.Repository.BuManagerRepo;
import com.aatral.ATS.Service.BuManagerService;
import com.aatral.ATS.dto.BuManagerDto;
import com.aatral.ATS.model.BuManager;
import com.aatral.ATS.Exception.*;
@Service
public class BuManagerServiceImpl implements BuManagerService {

	@Autowired
	private BuManagerRepo buManagerRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public BuManagerDto createBuManager(BuManagerDto buManagerDto) {
		BuManager buManager = this.modelMapper.map(buManagerDto,BuManager.class);
		BuManager savedUser = this.buManagerRepo.save(buManager);
		BuManagerDto map = this.modelMapper.map(savedUser, BuManagerDto.class);
		return map;
	}

//	@Override
//	public BuManagerDto getBuManager(int id) {
//		BuManager buManager = this.buManagerRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("BuManager", "id", id));
//		return this.modelMapper.map(buManager, BuManagerDto.class);
//	}
//
//	@Override
//	public BuManagerDto updateBuManager(BuManagerDto buManagerDto, int id) {
//		BuManager buManager = this.buManagerRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("BuManager", "id", id));
//
//		// user.setAddress(userDto.getAddress());
//        buManager.setContactNumber(buManagerDto.getContactNumber());
//        buManager.setCtcOfferDetails(buManagerDto.getCtcOfferDetails());
//        buManager.setDesignation(buManagerDto.getDesignation());
//        buManager.setEmail(buManagerDto.getEmail());
//        buManager.setEmpid(buManager.getEmpid());
//        buManager.setExperienceLevel(buManagerDto.getExperienceLevel());
//        buManager.setJobDescription(buManagerDto.getJobDescription());
//        buManager.setProjectName(buManagerDto.getProjectName());
//        buManager.setRequest_resource_Date(buManagerDto.getRequest_resource_Date());
//        buManager.setRequest_resource_id(buManagerDto.getRequest_resource_id());
//        buManager.setRequestorName(buManagerDto.getRequestorName());
//        buManager.setResourceStartDate(buManagerDto.getResourceStartDate()); 
//        buManager.setWorkLocation(buManager.getWorkLocation());
//        
//        buManager.setSkill(buManagerDto.getSkill());
//        
//        buManager.setDivision(buManagerDto.getDivision());
        
//		
//		BuManager updateBuManager = this.buManagerRepo.save(buManager);
//		return this.modelMapper.map(updateBuManager, BuManagerDto.class);
//	}
//
//	@Override
//	public void deleteBuManager(String id) {
//		BuManager buManager = this.buManagerRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("BuManager", "id", id));
//		this.buManagerRepo.save(buManager);
//
//	}
//
//	@Override
//	public List<BuManagerDto> getAllBuManager() {
//		List<BuManager> buManager = this.buManagerRepo.findAll();
//		List<BuManagerDto> buManagerDto = buManager.stream().map((item) -> this.modelMapper.map(item, BuManagerDto.class))
//				.collect(Collectors.toList());
//		return buManagerDto;
//	}
//
//	public BuManager dtoToBuManager(BuManagerDto buManagerDto) {
//		BuManager buManager = this.modelMapper.map(buManagerDto, BuManager.class);
//		return buManager;
//	}
//
//	public BuManagerDto buManagerToDTO(BuManager buManager) {
//		BuManagerDto buManagerDto = this.modelMapper.map(buManager, BuManagerDto.class);
//		return buManagerDto;
//	}

}
