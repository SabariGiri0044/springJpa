package com.Sabu.demo.Services;

import java.util.List;

import com.Sabu.demo.entity.Department;
import com.Sabu.demo.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartList();

	public Department fetchDepartmentById(Long did);

	public void deleteDepartmentById(Long did);

	public Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException;

	public Department fetchDepartmentByName(String departmentName);

	}
