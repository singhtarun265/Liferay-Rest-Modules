/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.employee.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.employee.model.Employee;
import com.liferay.training.employee.service.base.EmployeeServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the employee remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liferay.training.employee.service.EmployeeService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeServiceBaseImpl
 */
@Component(property = { "json.web.service.context.name=employee",
		"json.web.service.context.path=Employee" }, service = AopService.class)
public class EmployeeServiceImpl extends EmployeeServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.liferay.training.employee.service.EmployeeServiceUtil</code> to
	 * access the employee remote service.
	 */

	public Employee addEmployee(long userId, String name, String jobTitle, String phoneNo, long salary, long deptId,
			long projectId, ServiceContext serviceContext) throws PortalException {
		
		return employeeLocalService.addEmployee(userId, name, jobTitle, phoneNo, salary, deptId, projectId,
				serviceContext);
	}

	public Employee updateEmployee(long userId, long empId, String name, String jobTitle, String phoneNo, long salary,
			long deptId, long projectId, ServiceContext serviceContext) throws PortalException {
		return employeeLocalService.updateEmployee(userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId,
				serviceContext);
	}

	public Employee deleteEmployee(long empId) throws PortalException {
		return employeeLocalService.deleteEmployee(empId);
	}

	public Employee getEmployee(long empId) throws PortalException {
		return employeeLocalService.getEmployee(empId);
	}

	public int getEmployeesCount(String name, long salary) {

		return employeeLocalService.getEmployeesCount(name, salary);
	}

	public List<Employee> getEmployees(long deptId, long salary) {

		return employeeLocalService.getEmployees(deptId, salary);
	}

	// Custom SQL Query
	public List<Employee> getEmployeeByGroupIdAndUserIdAsRemote(long userId, long groupId) {

		return employeeLocalService.getEmployeeByGroupIdAndUserIdAsLocal(userId, groupId);

	}

	// Dynamic Query
	public List<Employee> getEmployeeByUserNameAndJobTitleAsRemote(String userName, String jobTitle) {

		return employeeLocalService.getEmployeeByUserNameAndJobTitleAsLocal(userName, jobTitle);
	}
	
	//Custom SQL Query
	public List<Employee> getAllEmployeesInformation(int start, int end) {
		return employeeLocalService.getAllEmployeesInformationAsLocal(start, end);
	}
		

}