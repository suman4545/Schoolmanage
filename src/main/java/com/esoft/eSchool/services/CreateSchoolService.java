package com.esoft.eSchool.services;

import com.esoft.eSchool.customexception.BeanValidationException;
import com.esoft.eSchool.models.EmpDeptMapping;
import com.esoft.eSchool.models.EmpSchoolMap;
import com.esoft.eSchool.models.Masdept;
import com.esoft.eSchool.models.SchollBean;

public interface CreateSchoolService {
	public SchollBean addSchool(SchollBean schollBean)throws BeanValidationException;
	
	public EmpSchoolMap addEmployee(EmpSchoolMap employee)throws BeanValidationException;
	public Masdept adddept(Masdept masdept)throws BeanValidationException;
	public EmpDeptMapping addempDeptMapping(EmpDeptMapping empDeptMapping)throws BeanValidationException;
	

}
