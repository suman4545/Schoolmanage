package com.esoft.eSchool.dao.impl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esoft.eSchool.dao.EschoolAdminService;
import com.esoft.eSchool.models.EmpDeptMapping;
import com.esoft.eSchool.models.EmpSchoolMap;
import com.esoft.eSchool.models.MasEmployee;
import com.esoft.eSchool.models.Masdept;
import com.esoft.eSchool.models.SchollBean;


@Repository
//@Transactional
public class EschoolAdminServiceImpl implements EschoolAdminService{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public SchollBean saveSchool(SchollBean schollBean) {


		Session session=sessionFactory.openSession();
		Transaction trasaction=session.beginTransaction();
		session.save(schollBean);
		int id=schollBean.getId();
		System.out.println("++++++++++="+id);
		schollBean.setSchoolCode(schollBean.getSchoolName().substring(0, 3)+id);
		
		trasaction.commit();
		
		return schollBean;
	}

	@Override
	public EmpSchoolMap saveEmp(EmpSchoolMap Empschmap) {
		Session session=sessionFactory.openSession();
		Transaction trasaction=session.beginTransaction();
		session.save(Empschmap);
		//int id=Empschmap.getSchoolId();
		//System.out.println("++++++++++="+id);
		//schollBean.setSchoolCode(schollBean.getSchoolName().substring(0, 3)+id);
		
		trasaction.commit();
		
		return Empschmap;
	}

	@Override
	public Masdept saveEmp(Masdept masdept) {
		Session session=sessionFactory.openSession();
		Transaction trasaction=session.beginTransaction();
		session.save(masdept);
		//int id=Empschmap.getSchoolId();
		//System.out.println("++++++++++="+id);
		//schollBean.setSchoolCode(schollBean.getSchoolName().substring(0, 3)+id);
		
		trasaction.commit();
		
		return masdept;
	}

	@Override
	public EmpDeptMapping saveEmpDeptMap(EmpDeptMapping empdeptMap) {
		Session session=sessionFactory.openSession();
		Transaction trasaction=session.beginTransaction();
		session.save(empdeptMap);
		//int id=Empschmap.getSchoolId();
		//System.out.println("++++++++++="+id);
		//schollBean.setSchoolCode(schollBean.getSchoolName().substring(0, 3)+id);
		
		trasaction.commit();
		
		return empdeptMap;
	}

	
}
