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

package com.liferay.training.employee.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.training.employee.model.Employee;

import java.util.List;

/**
 * Provides the remote service utility for Employee. This utility wraps
 * <code>com.liferay.training.employee.service.impl.EmployeeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.employee.service.impl.EmployeeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Employee addEmployee(
			long userId, String name, String jobTitle, String phoneNo,
			long salary, long deptId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addEmployee(
			userId, name, jobTitle, phoneNo, salary, deptId, projectId,
			serviceContext);
	}

	public static Employee deleteEmployee(long empId) throws PortalException {
		return getService().deleteEmployee(empId);
	}

	public static List<Employee> getAllEmployeesInformation(
		int start, int end) {

		return getService().getAllEmployeesInformation(start, end);
	}

	public static Employee getEmployee(long empId) throws PortalException {
		return getService().getEmployee(empId);
	}

	public static List<Employee> getEmployeeByGroupIdAndUserIdAsRemote(
		long userId, long groupId) {

		return getService().getEmployeeByGroupIdAndUserIdAsRemote(
			userId, groupId);
	}

	public static List<Employee> getEmployeeByUserNameAndJobTitleAsRemote(
		String userName, String jobTitle) {

		return getService().getEmployeeByUserNameAndJobTitleAsRemote(
			userName, jobTitle);
	}

	public static List<Employee> getEmployees(long deptId, long salary) {
		return getService().getEmployees(deptId, salary);
	}

	public static int getEmployeesCount(String name, long salary) {
		return getService().getEmployeesCount(name, salary);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Employee updateEmployee(
			long userId, long empId, String name, String jobTitle,
			String phoneNo, long salary, long deptId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateEmployee(
			userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId,
			serviceContext);
	}

	public static EmployeeService getService() {
		return _service;
	}

	private static volatile EmployeeService _service;

}