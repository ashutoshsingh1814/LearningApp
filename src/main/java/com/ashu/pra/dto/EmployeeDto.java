package com.ashu.pra.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	private Integer id;
	private String employeeName;
	private String employeePhone;
	
	private String city;
	private String state;
}
