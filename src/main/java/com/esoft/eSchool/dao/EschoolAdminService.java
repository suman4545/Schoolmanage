package com.esoft.eSchool.dao;

import com.esoft.eSchool.models.EmpSchoolMap;
import com.esoft.eSchool.models.Masdept;
import com.esoft.eSchool.models.SchollBean;
import com.esoft.eSchool.models.EmpDeptMapping;


public interface EschoolAdminService {
	public SchollBean saveSchool(SchollBean SB);
	public EmpSchoolMap saveEmp(EmpSchoolMap Emp);
	public Masdept saveEmp(Masdept masdept);
	public EmpDeptMapping saveEmpDeptMap(EmpDeptMapping empdeptMap);
	
	

}
