package com.Sabu.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;

	//constructor with args
	public Department(Long departmentId, String departmentName, String departmentAddress) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}

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
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
			+ departmentAddress + "]";
}

}