package com.vendorDemo.CloudVendor.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendorDemo.CloudVendor.entity.CloludVendor;
import com.vendorDemo.CloudVendor.exception.CloudVendorNotFoundException;
import com.vendorDemo.CloudVendor.repository.CloudeVendorRepository;
import com.vendorDemo.CloudVendor.service.CloudeVendorService;

@Service
public class CloludVendorServiceImpl implements CloudeVendorService {

	@Autowired
	private CloudeVendorRepository cloudeVendorRepository;
	
	@Override
	public CloludVendor getCloudeVender(String venderId) {
		
		if(cloudeVendorRepository.findById(venderId).isEmpty())
			throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
		return cloudeVendorRepository.findById(venderId).get();
	}

	@Override
	public List<CloludVendor> getAllCloludVender() {
		
		return cloudeVendorRepository.findAll();
	}

	@Override
	public String addCloudeVender(CloludVendor cloudeVender) {
		cloudeVendorRepository.save(cloudeVender);
		return "Add Successfully";
	}

	@Override
	public String updateCloludVender(CloludVendor cloludVender) {
		cloudeVendorRepository.save(cloludVender);
		return "Update Successfully";
	}

	@Override
	public String deleteCloludVender(String venderId) {
		cloudeVendorRepository.deleteById(venderId);
		return "Delete Successfully";
	}

}
