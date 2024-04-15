package com.vendorDemo.CloudVendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vendorDemo.CloudVendor.entity.CloludVendor;

@Repository
public interface CloudeVendorRepository extends JpaRepository<CloludVendor, String>{

}
