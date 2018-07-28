package com.esoft.eSchool.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="mas_employee")
public class MasEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid", nullable = false, unique = true)
	private int empid;
	
	@Column(name = "employee_name", length = 20, nullable = false)	
	@NotBlank
	private String name;
	
	@Column(name = "empAge", nullable = false)
	@Min(value=1)
	@Max(value=100)
	private int empAge;
	
	@Column(name = "employee_dob", length = 20, nullable = false)	
	@NotBlank
	private String dob;
	
	@Column(name = "emp_code", length = 20)
	private String emp_code;
	
	private boolean isAdmin;
	
	
	



	public MasEmployee(){}
	

	public int getEmpid() {
		return empid;
	}




	public void setEmpid(int empid) {
		this.empid = empid;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}

	

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	};
	
}
