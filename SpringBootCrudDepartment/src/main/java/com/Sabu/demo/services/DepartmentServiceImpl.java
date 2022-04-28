package com.Sabu.demo.services;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sabu.demo.Entity.Department;
import com.Sabu.demo.Repository.DepartmentRepository;



@Service
public  class DepartmentServiceImpl implements DepartmentService{
     @Autowired
	public DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> fetchDepartList() {
		return departmentRepository.findAll();
	}
	@Override
	public Department fetchDepartmentById(Long did) {
		return departmentRepository.findById(did).get();
	}
	@Override
	public void deleteDepartmentById(Long did) {
	 departmentRepository.deleteById(did);
		
	}
	@Override
	public Department updateDepartment(Long did, Department department) {
		Department depDB=departmentRepository.findById(did).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
			
		}
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
			System.out.println(department.getDepartmentAddress());
		}
		return departmentRepository.save(depDB);
	}
	@Override
	public Department fetchDepartmentByName(String departmentName) {
		return departmentRepository(departmentName);
	}
	private Department departmentRepository(String departmentName) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
