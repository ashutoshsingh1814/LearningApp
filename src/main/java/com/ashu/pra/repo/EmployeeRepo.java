package com.ashu.pra.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ashu.pra.dto.EmployeeDto;
import com.ashu.pra.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
//	@Query( nativeQuery = true,
//	        value= "select new com.ashu.pra.dto.EmployeeDto(e.id, e.employeeName, e.employeePhone, a.city, a.state) from Employee e join e.address a on a.city = city") 
//	List<EmployeeDto> findEmployeesByAddressCity(@Param("city") String city);
	
//	@Query(nativeQuery = true,
//		       value = "select e.id, e.employeeName, e.employeePhone, a.city, a.state from Employee e join Address a on e.add_fk = a.id where a.city = :city")
//		List<EmployeeDto> findEmployeesByAddressCity(@Param("city") String city);
	
	@Query("select new com.ashu.pra.dto.EmployeeDto(e.id, e.employeeName, e.employeePhone, a.city, a.state) from Employee e join e.address a on a.city = ?1") 
	List<EmployeeDto> findEmployeesByAddressCity(@Param("city") String city);	
	
	

}
