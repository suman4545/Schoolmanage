package com.esoft.eSchool.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.eSchool.customexception.BeanValidationException;
import com.esoft.eSchool.dao.EschoolAdminService;
import com.esoft.eSchool.models.EmpDeptMapping;
import com.esoft.eSchool.models.EmpSchoolMap;
import com.esoft.eSchool.models.MasEmployee;
import com.esoft.eSchool.models.Masdept;
import com.esoft.eSchool.models.SchollBean;
import com.esoft.eSchool.services.CreateSchoolService;
import com.esoft.eSchool.utility.BeanValidationService;


@Service("createSchoolservice")
public class CreateSchoolServiceImpl implements CreateSchoolService {
	@Autowired
	BeanValidationService SBValidator;
    @Autowired
    EschoolAdminService eschool;
	
	@Override
	public SchollBean addSchool(SchollBean schollBean) throws BeanValidationException {
		// TODO Auto-generated method stub
		
		
		if(SBValidator.validateBean(schollBean).isEmpty()){
		System.out.println("Sucess");	
		eschool.saveSchool(schollBean);
			
		}
		else{ 
			throw new BeanValidationException("error");
			
		}
		
		return schollBean;
	}

	@Override
	public EmpSchoolMap addEmployee(EmpSchoolMap employeeSch)
			throws BeanValidationException {
		if(SBValidator.validateBean(employeeSch).isEmpty()){
			System.out.println("Sucess");	
			eschool.saveEmp(employeeSch);
				
			}
			else{ 
				throw new BeanValidationException("error");
				
			}
			
			return employeeSch;
	}

	@Override
	public Masdept adddept(Masdept masdept) throws BeanValidationException {
		if(SBValidator.validateBean(masdept).isEmpty()){
			System.out.println("Sucess");	
			eschool.saveEmp(masdept);
				
			}
			else{ 
				throw new BeanValidationException("error");
				
			}
			
			return masdept;
	}

	@Override
	public EmpDeptMapping addempDeptMapping(EmpDeptMapping empDeptMapping)
			throws BeanValidationException {
		if(SBValidator.validateBean(empDeptMapping).isEmpty()){
			System.out.println("Sucess");	
			eschool.saveEmpDeptMap(empDeptMapping);
				
			}
			else{ 
				throw new BeanValidationException("error");
				
			}
			
			return empDeptMapping;
	}

}
