package com.Sabu.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sabu.demo.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department saveDepartment(Department department);

}
