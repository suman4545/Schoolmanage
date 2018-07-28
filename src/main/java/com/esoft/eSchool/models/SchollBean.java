package com.esoft.eSchool.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "SchollDeatils")
public class SchollBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id", unique = true)
	private int id;
	
	@Column(name = "SCHOOL_NAME", length = 20, nullable = false)	
	@NotBlank
	private String schoolName;
	
	@Column(name = "SCHOOL_CODE", length = 20)
	private String schoolCode;

	@Column(name = "SCHOOL_ADD", length = 20)
	@NotBlank
	private String schoolAddress;
	@Column(name = "SCODE", nullable = false)
	@Min(value=1)
	@Max(value=100)
	private int stateCode;
	@Column(name = "COUNTRY_CODE", nullable = false)
	@Min(value=1)
	@Max(value=100)	
	private int countryCode;
	@Column(name = "PIN_CODE",length = 6, nullable = false)
	@NotBlank
	private String pin;
	
	
	
	@OneToMany(fetch=FetchType.LAZY)
	 @Cascade({CascadeType.SAVE_UPDATE})
	
	 @JoinTable(
	            name = "school_AdminUserMapping",
	            joinColumns = @JoinColumn(name = "school_id"),
	            inverseJoinColumns = @JoinColumn(name = "empid")
	    )
	 
	 private Set<MasEmployee> masemployee;
	
	
	

	

	public Set<MasEmployee> getMasemployee() {
		return masemployee;
	}

	public void setMasemployee(Set<MasEmployee> masemployee) {
		this.masemployee = masemployee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
