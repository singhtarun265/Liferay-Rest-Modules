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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceWrapper
	implements EmployeeService, ServiceWrapper<EmployeeService> {

	public EmployeeServiceWrapper(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	@Override
	public com.liferay.training.employee.model.Employee addEmployee(
			long userId, String name, String jobTitle, String phoneNo,
			long salary, long deptId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.addEmployee(
			userId, name, jobTitle, phoneNo, salary, deptId, projectId,
			serviceContext);
	}

	@Override
	public com.liferay.training.employee.model.Employee deleteEmployee(
			long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.deleteEmployee(empId);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getAllEmployeesInformation(int start, int end) {

		return _employeeService.getAllEmployeesInformation(start, end);
	}

	@Override
	public com.liferay.training.employee.model.Employee getEmployee(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.getEmployee(empId);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployeeByGroupIdAndUserIdAsRemote(long userId, long groupId) {

		return _employeeService.getEmployeeByGroupIdAndUserIdAsRemote(
			userId, groupId);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployeeByUserNameAndJobTitleAsRemote(
			String userName, String jobTitle) {

		return _employeeService.getEmployeeByUserNameAndJobTitleAsRemote(
			userName, jobTitle);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployees(long deptId, long salary) {

		return _employeeService.getEmployees(deptId, salary);
	}

	@Override
	public int getEmployeesCount(String name, long salary) {
		return _employeeService.getEmployeesCount(name, salary);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.employee.model.Employee updateEmployee(
			long userId, long empId, String name, String jobTitle,
			String phoneNo, long salary, long deptId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.updateEmployee(
			userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId,
			serviceContext);
	}

	@Override
	public EmployeeService getWrappedService() {
		return _employeeService;
	}

	@Override
	public void setWrappedService(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	private EmployeeService _employeeService;

}