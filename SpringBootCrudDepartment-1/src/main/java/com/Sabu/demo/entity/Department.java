package com.Sabu.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity

public class Department{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long departmentId;
	@NotBlank(message="Please add departmentname")
private String departmentName;
	@Length(max=20,min=5,message="Length should be in range")
private String departmentAddress;
	//generate constructor with no arg and const with all args
	
	public Department() {
		super();
	}

	public Department(Long departmentId, String departmentName, String departmentAddress) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}

	
	//generate setter and getter methods
		//generate toString()
	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	@Override
	public String toString() {
		return "Deparment [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + "]";
	}
	
	}
