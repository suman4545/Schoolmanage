package com.esoft.eSchool.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name="Employee_DeptMapping")
public class EmpDeptMapping {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//@NotBlank
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	 @JoinColumn(name = "deptid", referencedColumnName="deptid")
	private Masdept masdept;
	
	//@NotBlank
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	 @JoinColumn(name = "empid", referencedColumnName="empid")
	private MasEmployee masEmp;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Masdept getMasdept() {
		return masdept;
	}

	public void setMasdept(Masdept masdept) {
		this.masdept = masdept;
	}

	public MasEmployee getMasEmp() {
		return masEmp;
	}

	public void setMasEmp(MasEmployee masEmp) {
		this.masEmp = masEmp;
	}

	
	
	
	

}
