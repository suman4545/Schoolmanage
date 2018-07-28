package com.esoft.eSchool.utility;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.esoft.eSchool.models.EmpDeptMapping;
import com.esoft.eSchool.models.EmpSchoolMap;
import com.esoft.eSchool.models.Masdept;
import com.esoft.eSchool.models.SchollBean;

@Service("SBValidator")
public class BeanValidationServiceImpl implements BeanValidationService{

	@Override
	public Set<ConstraintViolation<SchollBean>> validateBean(SchollBean schoolBean) {

		ValidatorFactory factory =
		          Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SchollBean>> constraintViolations =
		           validator.validate(schoolBean);
		
		
		return constraintViolations;
	}

	@Override
	public Set<ConstraintViolation<EmpSchoolMap>> validateBean(
			EmpSchoolMap employee) {
		ValidatorFactory factory =
		          Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<EmpSchoolMap>> constraintViolations =
		           validator.validate(employee);
		
		
		return constraintViolations;
	}

	@Override
	public Set<ConstraintViolation<Masdept>> validateBean(Masdept masdept) {
		ValidatorFactory factory =
		          Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Masdept>> constraintViolations =
		           validator.validate(masdept);
		
		
		return constraintViolations;
	}

	@Override
	public Set<ConstraintViolation<EmpDeptMapping>> validateBean(
			EmpDeptMapping empDept) {
		ValidatorFactory factory =
		          Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<EmpDeptMapping>> constraintViolations =
		           validator.validate(empDept);
		
		
		return constraintViolations;
	}

	

}
