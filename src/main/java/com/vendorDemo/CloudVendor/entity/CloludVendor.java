package com.vendorDemo.CloudVendor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CloludVendor {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String VenderId;
	private String VenderName;
	private String VenderAddress;
	private String VenderPhone;
	public CloludVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CloludVendor(String venderId, String venderName, String venderAddress, String venderPhone) {
		super();
		VenderId = venderId;
		VenderName = venderName;
		VenderAddress = venderAddress;
		VenderPhone = venderPhone;
	}
	public String getVenderId() {
		return VenderId;
	}
	public void setVenderId(String venderId) {
		VenderId = venderId;
	}
	public String getVenderName() {
		return VenderName;
	}
	public void setVenderName(String venderName) {
		VenderName = venderName;
	}
	public String getVenderAddress() {
		return VenderAddress;
	}
	public void setVenderAddress(String venderAddress) {
		VenderAddress = venderAddress;
	}
	public String getVenderPhone() {
		return VenderPhone;
	}
	public void setVenderPhone(String venderPhone) {
		VenderPhone = venderPhone;
	}
	@Override
	public String toString() {
		return "ColudVender [VenderId=" + VenderId + ", VenderName=" + VenderName + ", VenderAddress=" + VenderAddress
				+ ", VenderPhone=" + VenderPhone + "]";
	}
	
	
	
}
