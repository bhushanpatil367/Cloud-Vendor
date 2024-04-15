package com.vendorDemo.CloudVendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendorDemo.CloudVendor.entity.CloludVendor;
import com.vendorDemo.CloudVendor.service.CloudeVendorService;

@RestController
@RequestMapping("cloudVender")
public class CloudeVendorController {

	@Autowired
	private CloudeVendorService cloudeVenderService;
	
	@GetMapping("/{venderId}")
	public CloludVendor getgetCloudeVender(@PathVariable("venderId") String venderId) {
		
		return cloudeVenderService.getCloudeVender(venderId);
	}
	
	@GetMapping("/getAllCloludVender")
	public List<CloludVendor> getAllCloludVender(){
		
		return cloudeVenderService.getAllCloludVender();
	}
	
	@PostMapping("/add")
	public String addCloudeVender(@RequestBody CloludVendor cloudeVender) {
		
		cloudeVenderService.addCloudeVender(cloudeVender);
		return "Add Succes";
	}
	
	@PutMapping("/update")
	public String updateCloludVender(@RequestBody CloludVendor cloludVender) {
		
		cloudeVenderService.updateCloludVender(cloludVender);
		return "update Success";
	}
	
	@DeleteMapping("/delete/{venderId}")
	public String deleteCloludVender(@PathVariable("venderId") String venderId) {
		
		cloudeVenderService.deleteCloludVender(venderId);
		return "Delete Success";
	}
}
