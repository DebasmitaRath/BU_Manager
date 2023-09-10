package com.aatral.ATS.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aatral.ATS.Response.ResponseHandler;
import com.aatral.ATS.Service.BuManagerService;
import com.aatral.ATS.dto.BuManagerDto;
import com.aatral.ATS.payloads.ApiResponse;



@RestController
//@RequestMapping("api/BuManager")
@CrossOrigin("*")
public class BuManagerController {
	
	public BuManagerController() {
		super();
		System.out.println("************************************");
	}
	@Autowired
	private BuManagerService buManagerService;
	
	@PostMapping(value="/createBuManager")
	public ResponseEntity<Object> createBuManager( @RequestBody BuManagerDto buManagerDto){
		BuManagerDto createBuManagerDto = this.buManagerService.createBuManager(buManagerDto);
		return ResponseHandler.responseBuilder("New buManager details are given here", HttpStatus.OK, createBuManagerDto);
		
	}
//	@GetMapping("/getBuManager/{id}")
//	public ResponseEntity<Object> getSingleBuManager(@PathVariable String id) {
//		BuManagerDto buManagerDto = this.buManagerService.getBuManager(id);
//		return ResponseHandler.responseBuilder("BuManager details are given here", HttpStatus.OK, buManagerDto);
//
//	}
//	
//	@PutMapping("/updateBuManager/{id}")
//	public ResponseEntity<Object> updateBuManager(@RequestBody BuManagerDto buManagerDto, @PathVariable String id) {
//		BuManagerDto updateBuManager= this.buManagerService.updateBuManager(buManagerDto, id);
//		return ResponseHandler.responseBuilder("Updated BuManager details are given here", HttpStatus.OK, updateBuManager);
//	}
//	@DeleteMapping("/deleteBuManager/{id}")
//	public ResponseEntity<ApiResponse> deleteById(@PathVariable String id) {
//		this.buManagerService.deleteBuManager(id);
//		return new ResponseEntity<ApiResponse>(new ApiResponse("BuManager deleted successfully", false), HttpStatus.OK);
//	}
//	@GetMapping("/getallBuManager")
//	public ResponseEntity<Object> getAllBuManager() {
//		List<BuManagerDto> allBuManager = this.buManagerService.getAllBuManager();
//		return ResponseHandler.responseBuilder("Requested BuManager details are given here", HttpStatus.OK, allBuManager);
//	}
//
//	
}
