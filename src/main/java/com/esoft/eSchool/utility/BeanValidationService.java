package com.esoft.eSchool.utility;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.esoft.eSchool.models.EmpSchoolMap;
import com.esoft.eSchool.models.Masdept;
import com.esoft.eSchool.models.SchollBean;
import com.esoft.eSchool.models.EmpDeptMapping;

public interface BeanValidationService {
	
	public Set<ConstraintViolation<SchollBean>> validateBean(SchollBean SB);
	public Set<ConstraintViolation<EmpSchoolMap>> validateBean(EmpSchoolMap employee);
	public Set<ConstraintViolation<Masdept>> validateBean(Masdept masdept);
	public Set<ConstraintViolation<EmpDeptMapping>>  validateBean(EmpDeptMapping empDept);

}
