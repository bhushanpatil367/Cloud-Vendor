package com.vendorDemo.CloudVendor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CloudVenderExceptionHandler {

	public ResponseEntity<Object> handleCloudVendorNotFoundException(CloudVendorNotFoundException cloudVendorNotFoundException){
		
		CloudVendorException cloudVenderException = new CloudVendorException(cloudVendorNotFoundException.getMessage(),
				cloudVendorNotFoundException.getCause(),HttpStatus.NOT_FOUND );
		
		return new ResponseEntity<>(cloudVenderException, HttpStatus.NOT_FOUND);
	}
	
	
}
