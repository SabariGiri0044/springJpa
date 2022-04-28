package com.Sabu.demo.Repository;

//import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Sabu.demo.entity.Department;
public interface DepartmentRepository   extends JpaRepository<Department, Long> {

	//Department findByDepartmentName(String departmentName);

	Department findByDepartmentName(String departmentName);

}
