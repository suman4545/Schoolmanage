package com.esoft.eSchool.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="mas_dept")
public class Masdept {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="deptid")
	private int id;
	
	@NotBlank
	@Column(name="deptname")
	private String deptname;
	
	@NotBlank
	@Column(name="deptCode")
	private String deptCode;
	
	/*@OneToOne(fetch=FetchType.LAZY,  cascade=CascadeType.ALL)
	@JoinColumn(name = "school_id", referencedColumnName="school_id")
	*/
	
	/*@ManyToOne(fetch=FetchType.LAZY)	
	@Cascade({CascadeType.SAVE_UPDATE})
	 @JoinTable(
	            name = "school_deptMapping",
	            joinColumns = @JoinColumn(name = "deptid"),
	            inverseJoinColumns = @JoinColumn(name = "school_id")
	    )*/
	 //@Transient	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id", nullable = false)
	
	@JoinTable(
            name = "school_deptMapping",
            joinColumns = @JoinColumn(name = "deptid"),
            inverseJoinColumns = @JoinColumn(name = "school_id")
    )
	
	
	private SchollBean school;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public SchollBean getSchool() {
		return school;
	}

	public void setSchool(SchollBean school) {
		this.school = school;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
