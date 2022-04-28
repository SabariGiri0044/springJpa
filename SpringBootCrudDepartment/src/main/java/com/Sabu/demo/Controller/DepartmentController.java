package com.Sabu.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sabu.demo.Entity.Department;
import com.Sabu.demo.services.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired  
	private DepartmentService departmentService;
//save
	@PostMapping("/departments/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	//get all departments Record
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartList();
	}
	
	//get department by id
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long did) {
		return departmentService.fetchDepartmentById(did);
	}
	
	//delete
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long did) {
		departmentService.deleteDepartmentById(did);
		return "Department deleted Successfully";
	}
	
	//update
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long did,@RequestBody Department department) {
		return departmentService.updateDepartment(did,department);
	}
	
	//byname
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentService.fetchDepartmentByName(departmentName);
	}
	
}