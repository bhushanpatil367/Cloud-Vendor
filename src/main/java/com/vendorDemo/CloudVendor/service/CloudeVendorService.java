package com.vendorDemo.CloudVendor.service;

import java.util.List;

import com.vendorDemo.CloudVendor.entity.CloludVendor;

public interface CloudeVendorService {

	public CloludVendor getCloudeVender(String venderId);
	public List<CloludVendor> getAllCloludVender();
	public String addCloudeVender(CloludVendor cloudeVender);
	public String updateCloludVender(CloludVendor cloludVender);
	public String deleteCloludVender(String venderId);
}
