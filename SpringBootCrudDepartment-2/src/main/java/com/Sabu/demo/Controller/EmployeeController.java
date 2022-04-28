package com.Sabu.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sabu.demo.entity.Department;
import com.Sabu.demo.error.DepartmentNotFoundException;
import com.Sabu.demo.services.DepartmentService;

@RestController
public class EmployeeController {
	@Autowired  //propertybased
	private EmployeeService employeeService;
//save
	@PostMapping("/employees/")
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	//get all departments Record
	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList(){
		return employeeService.fetchEmployeeList();
	}
	
	//get department by id
	@GetMapping("/employees/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long did) {
		return departmentService.fetchDepartmentById(did);
	}
	
	//delete
	@DeleteMapping("/employees/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long did) {
		departmentService.deleteDepartmentById(did);
		return "Department deleted Successfully";
	}
	
	//update
	@PutMapping("/employees/{id}")
	public Department updateDepartment(@PathVariable("id") Long did,@RequestBody Department department) throws DepartmentNotFoundException {
		return departmentService.updateDepartment(did,department);
	}
	
	//byname
	GetMapping("/employees-=/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentService.fetchDepartmentByName(departmentName);
	}
	
}