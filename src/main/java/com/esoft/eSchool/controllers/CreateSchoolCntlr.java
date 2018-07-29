package com.esoft.eSchool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esoft.eSchool.customexception.BeanValidationException;
import com.esoft.eSchool.models.EmpSchoolMap;
import com.esoft.eSchool.models.Masdept;
import com.esoft.eSchool.models.SchollBean;
import com.esoft.eSchool.models.MasEmployee;
import com.esoft.eSchool.models.EmpDeptMapping;
import com.esoft.eSchool.services.CreateSchoolService;

@RestController
public class CreateSchoolCntlr {

	@Autowired
	CreateSchoolService createSchoolservice;

	@GetMapping(value = "/getTest")
	public ResponseEntity<?> getTest() {

		return new ResponseEntity<String>("hi  git", HttpStatus.OK);

	}

	@PostMapping(value = "/addschool", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createSchool(RequestEntity<SchollBean> reqEntity) {

		SchollBean SB = reqEntity.getBody();

		try {
			createSchoolservice.addSchool(SB);
		} catch (BeanValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	
	
	@PostMapping(value = "/addemp", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createEmp(RequestEntity<EmpSchoolMap> reqEntity) {

		EmpSchoolMap empschool = reqEntity.getBody();

		try {
			createSchoolservice.addEmployee(empschool);
		} catch (BeanValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	@PostMapping(value = "/adddept", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createDept(RequestEntity<Masdept> reqEntity) {

		Masdept masdept = reqEntity.getBody();

		try {
			createSchoolservice.adddept(masdept);
		} catch (BeanValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	
	
	@PostMapping(value = "/addEmpDeptMap", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createEmpDeptMap(RequestEntity<EmpDeptMapping> reqEntity) {

		EmpDeptMapping empDeptMapping = reqEntity.getBody();

		try {
			createSchoolservice.addempDeptMapping(empDeptMapping);
		} catch (BeanValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<EmpDeptMapping>(empDeptMapping, HttpStatus.OK) ;

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
