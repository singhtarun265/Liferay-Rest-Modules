package com.liferay.training.employee.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.training.employee.model.Employee;
import com.liferay.training.employee.model.impl.EmployeeImpl;
import com.liferay.training.employee.service.EmployeeLocalService;
import com.liferay.training.employee.service.persistence.EmployeeFinder;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = EmployeeFinder.class)
public class EmployeeFinderImpl extends EmployeeFinderBaseImpl implements EmployeeFinder {

	public List<Employee> getEmployeeByGroupIdAndUserId(long userId, long groupId) {

		System.out.println("Inside custom sql");
		Session session = null;
		try {
			session = openSession();
			String sql = _customSQL.get(getClass(),
					"com.liferay.training.employee.service.persistence.impl.EmployeeFinderImpl");
			System.out.println("Query==>" + sql);

			SQLQuery queryObject = session.createSQLQuery(sql);

			queryObject.setCacheable(false);
			queryObject.addEntity("Employee", EmployeeImpl.class);

			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(userId);
			qPos.add(groupId);

			List<Employee> emp = queryObject.list();
			return emp;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

	
	public List<Employee> getAllEmployeesInformation(int start, int end) {
		
	System.out.println("Inside custom sql");
	Session session = null;
	try {
		session = openSession();
		String sql = _customSQL.get(getClass(), "com.liferay.training.employee.service.persistence.impl.EmployeeFinderImpl.Alldata");
		System.out.println("Query==>" + sql);

		SQLQuery queryObject = session.createSQLQuery(sql);

		queryObject.setCacheable(false);
		queryObject.addEntity("Employee", EmployeeImpl.class);

		QueryPos qPos = QueryPos.getInstance(queryObject);
		qPos.add(start);
		qPos.add(end);
		
		List<Employee> emp= queryObject.list();
		return emp;

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		closeSession(session);
	}
	return null;
}

	public List<Employee> getEmployeeByUserNameAndJobTitleWithDynamic(String userName, String jobTitle) {

		List<Employee> employeeList  = employeeLocalService.dynamicQuery(employeeLocalService.dynamicQuery().
															  add(RestrictionsFactoryUtil.eq("name", userName)).
															  add(RestrictionsFactoryUtil.eq("jobTitle", jobTitle)));
		
		return employeeList;
	}

	
	// @ServiceReference(type = CustomSQL.class)

	@Reference
	private CustomSQL _customSQL;

	@ServiceReference(type = EmployeeLocalService.class)
	private EmployeeLocalService employeeLocalService;



}
