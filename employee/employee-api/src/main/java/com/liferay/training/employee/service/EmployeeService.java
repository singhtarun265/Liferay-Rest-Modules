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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.training.employee.model.Employee;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Employee. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface EmployeeService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.training.employee.service.impl.EmployeeServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the employee remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link EmployeeServiceUtil} if injection and service tracking are not available.
	 */
	public Employee addEmployee(
			long userId, String name, String jobTitle, String phoneNo,
			long salary, long deptId, long projectId,
			ServiceContext serviceContext)
		throws PortalException;

	public Employee deleteEmployee(long empId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Employee> getAllEmployeesInformation(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Employee getEmployee(long empId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Employee> getEmployeeByGroupIdAndUserIdAsRemote(
		long userId, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Employee> getEmployeeByUserNameAndJobTitleAsRemote(
		String userName, String jobTitle);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Employee> getEmployees(long deptId, long salary);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getEmployeesCount(String name, long salary);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public Employee updateEmployee(
			long userId, long empId, String name, String jobTitle,
			String phoneNo, long salary, long deptId, long projectId,
			ServiceContext serviceContext)
		throws PortalException;

}