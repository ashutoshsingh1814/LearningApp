package com.ashu.pra.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String employeeName;
	private String employeePhone;
	private BigDecimal salary;
	 
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_fk_id", referencedColumnName = "id")
	private List<Role> roles;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="add_fk", referencedColumnName = "id")
	private Address address;
	
	
	

	




	
	

	
	
	
	
	

}
