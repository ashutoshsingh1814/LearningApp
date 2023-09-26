package com.ashu.pra.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.pra.dto.EmployeeDto;
import com.ashu.pra.entity.Employee;
import com.ashu.pra.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/postEmp")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp){
		Employee entity = new Employee();
		entity.setEmployeeName(emp.getEmployeeName());
		entity.setEmployeePhone(emp.getEmployeePhone());
		entity.setSalary(emp.getSalary());
		entity.setAddress(emp.getAddress());
		repo.save(entity);
		
		
		return new ResponseEntity<>("Employee Saved", HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getEmp/{city}")
	public ResponseEntity<List<EmployeeDto>> getEmployee(@PathVariable("city") String city){
		List<EmployeeDto> em = repo.findEmployeesByAddressCity(city);
		return ResponseEntity.ok(em);
	}
	
	
	//public ResponseEntity<String> updateEmployee(@RequestB)

}
