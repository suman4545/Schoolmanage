package com.esoft.eSchool.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="school_empMapping")
public class EmpSchoolMap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mapid", nullable = false, unique = true)
	private int id;
	
	@OneToOne(fetch=FetchType.LAZY, targetEntity=MasEmployee.class, cascade=CascadeType.ALL)
	 @JoinColumn(name = "empid", referencedColumnName="empid")
	 private MasEmployee masemployee;
	
		
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id", nullable = false)
	 private SchollBean school;
	
	public int getId() {
		return id;
	}

	

	public SchollBean getSchool() {
		return school;
	}



	public void setSchool(SchollBean school) {
		this.school = school;
	}



	public void setId(int id) {
		this.id = id;
	}

	public MasEmployee getMasemployee() {
		return masemployee;
	}

	public void setMasemployee(MasEmployee masemployee) {
		this.masemployee = masemployee;
	}

	

	

}
