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

package com.liferay.training.employee.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.employee.service.EmployeeServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>EmployeeServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.training.employee.model.EmployeeSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.training.employee.model.Employee</code>, that is translated to a
 * <code>com.liferay.training.employee.model.EmployeeSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmployeeServiceSoap {

	public static com.liferay.training.employee.model.EmployeeSoap addEmployee(
			long userId, String name, String jobTitle, String phoneNo,
			long salary, long deptId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.employee.model.Employee returnValue =
				EmployeeServiceUtil.addEmployee(
					userId, name, jobTitle, phoneNo, salary, deptId, projectId,
					serviceContext);

			return com.liferay.training.employee.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.employee.model.EmployeeSoap
			updateEmployee(
				long userId, long empId, String name, String jobTitle,
				String phoneNo, long salary, long deptId, long projectId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.training.employee.model.Employee returnValue =
				EmployeeServiceUtil.updateEmployee(
					userId, empId, name, jobTitle, phoneNo, salary, deptId,
					projectId, serviceContext);

			return com.liferay.training.employee.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.employee.model.EmployeeSoap
			deleteEmployee(long empId)
		throws RemoteException {

		try {
			com.liferay.training.employee.model.Employee returnValue =
				EmployeeServiceUtil.deleteEmployee(empId);

			return com.liferay.training.employee.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.employee.model.EmployeeSoap getEmployee(
			long empId)
		throws RemoteException {

		try {
			com.liferay.training.employee.model.Employee returnValue =
				EmployeeServiceUtil.getEmployee(empId);

			return com.liferay.training.employee.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int getEmployeesCount(String name, long salary)
		throws RemoteException {

		try {
			int returnValue = EmployeeServiceUtil.getEmployeesCount(
				name, salary);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.employee.model.EmployeeSoap[]
			getEmployees(long deptId, long salary)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.employee.model.Employee>
				returnValue = EmployeeServiceUtil.getEmployees(deptId, salary);

			return com.liferay.training.employee.model.EmployeeSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.employee.model.EmployeeSoap[]
			getEmployeeByGroupIdAndUserIdAsRemote(long userId, long groupId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.employee.model.Employee>
				returnValue =
					EmployeeServiceUtil.getEmployeeByGroupIdAndUserIdAsRemote(
						userId, groupId);

			return com.liferay.training.employee.model.EmployeeSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.employee.model.EmployeeSoap[]
			getEmployeeByUserNameAndJobTitleAsRemote(
				String userName, String jobTitle)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.employee.model.Employee>
				returnValue =
					EmployeeServiceUtil.
						getEmployeeByUserNameAndJobTitleAsRemote(
							userName, jobTitle);

			return com.liferay.training.employee.model.EmployeeSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.training.employee.model.EmployeeSoap[]
			getAllEmployeesInformation(int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.liferay.training.employee.model.Employee>
				returnValue = EmployeeServiceUtil.getAllEmployeesInformation(
					start, end);

			return com.liferay.training.employee.model.EmployeeSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EmployeeServiceSoap.class);

}