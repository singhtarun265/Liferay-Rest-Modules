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
 * Provides a wrapper for {@link EmployeeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalService
 * @generated
 */
public class EmployeeLocalServiceWrapper
	implements EmployeeLocalService, ServiceWrapper<EmployeeLocalService> {

	public EmployeeLocalServiceWrapper(
		EmployeeLocalService employeeLocalService) {

		_employeeLocalService = employeeLocalService;
	}

	/**
	 * Adds the employee to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employee the employee
	 * @return the employee that was added
	 */
	@Override
	public com.liferay.training.employee.model.Employee addEmployee(
		com.liferay.training.employee.model.Employee employee) {

		return _employeeLocalService.addEmployee(employee);
	}

	@Override
	public com.liferay.training.employee.model.Employee addEmployee(
			long userId, String name, String jobTitle, String phoneNo,
			long salary, long deptId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.addEmployee(
			userId, name, jobTitle, phoneNo, salary, deptId, projectId,
			serviceContext);
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param empId the primary key for the new employee
	 * @return the new employee
	 */
	@Override
	public com.liferay.training.employee.model.Employee createEmployee(
		long empId) {

		return _employeeLocalService.createEmployee(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the employee from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employee the employee
	 * @return the employee that was removed
	 * @throws PortalException
	 */
	@Override
	public com.liferay.training.employee.model.Employee deleteEmployee(
			com.liferay.training.employee.model.Employee employee)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.deleteEmployee(employee);
	}

	/**
	 * Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param empId the primary key of the employee
	 * @return the employee that was removed
	 * @throws PortalException if a employee with the primary key could not be found
	 */
	@Override
	public com.liferay.training.employee.model.Employee deleteEmployee(
			long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.deleteEmployee(empId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.employee.model.impl.EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _employeeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.employee.model.impl.EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _employeeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employeeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _employeeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.employee.model.Employee fetchEmployee(
		long empId) {

		return _employeeLocalService.fetchEmployee(empId);
	}

	/**
	 * Returns the employee matching the UUID and group.
	 *
	 * @param uuid the employee's UUID
	 * @param groupId the primary key of the group
	 * @return the matching employee, or <code>null</code> if a matching employee could not be found
	 */
	@Override
	public com.liferay.training.employee.model.Employee
		fetchEmployeeByUuidAndGroupId(String uuid, long groupId) {

		return _employeeLocalService.fetchEmployeeByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _employeeLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getAllEmployeesInformationAsLocal(int start, int end) {

		return _employeeLocalService.getAllEmployeesInformationAsLocal(
			start, end);
	}

	/**
	 * Returns the employee with the primary key.
	 *
	 * @param empId the primary key of the employee
	 * @return the employee
	 * @throws PortalException if a employee with the primary key could not be found
	 */
	@Override
	public com.liferay.training.employee.model.Employee getEmployee(long empId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.getEmployee(empId);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployeeByGroupIdAndUserIdAsLocal(long userId, long groupId) {

		return _employeeLocalService.getEmployeeByGroupIdAndUserIdAsLocal(
			userId, groupId);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployeeByUserNameAndJobTitleAsLocal(
			String userName, String jobTitle) {

		return _employeeLocalService.getEmployeeByUserNameAndJobTitleAsLocal(
			userName, jobTitle);
	}

	/**
	 * Returns the employee matching the UUID and group.
	 *
	 * @param uuid the employee's UUID
	 * @param groupId the primary key of the group
	 * @return the matching employee
	 * @throws PortalException if a matching employee could not be found
	 */
	@Override
	public com.liferay.training.employee.model.Employee
			getEmployeeByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.getEmployeeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.employee.model.impl.EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of employees
	 */
	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployees(int start, int end) {

		return _employeeLocalService.getEmployees(start, end);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployees(long deptId, long salary) {

		return _employeeLocalService.getEmployees(deptId, salary);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployees(long deptId, long salary, int start, int end) {

		return _employeeLocalService.getEmployees(deptId, salary, start, end);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployees(
			long deptId, long salary, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.employee.model.Employee> obc) {

		return _employeeLocalService.getEmployees(
			deptId, salary, start, end, obc);
	}

	/**
	 * Returns all the employees matching the UUID and company.
	 *
	 * @param uuid the UUID of the employees
	 * @param companyId the primary key of the company
	 * @return the matching employees, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployeesByUuidAndCompanyId(String uuid, long companyId) {

		return _employeeLocalService.getEmployeesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of employees matching the UUID and company.
	 *
	 * @param uuid the UUID of the employees
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching employees, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
		getEmployeesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.employee.model.Employee>
					orderByComparator) {

		return _employeeLocalService.getEmployeesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
	 */
	@Override
	public int getEmployeesCount() {
		return _employeeLocalService.getEmployeesCount();
	}

	@Override
	public int getEmployeesCount(String name, long salary) {
		return _employeeLocalService.getEmployeesCount(name, salary);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _employeeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _employeeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<com.liferay.training.employee.model.Employee>
			getSearchEmployeesInformationAsLocal(
				long userId, long empId, String name, String jobTitle,
				String phoneNo, long salary, long deptId, long projectId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _employeeLocalService.getSearchEmployeesInformationAsLocal(
			userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId);
	}

	@Override
	public int getSearchOfficeEmployeeCountAsLocal(
			long userId, long empId, String name, String jobTitle,
			String phoneNo, long salary, long deptId, long projectId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _employeeLocalService.getSearchOfficeEmployeeCountAsLocal(
			userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId);
	}

	/**
	 * Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employee the employee
	 * @return the employee that was updated
	 */
	@Override
	public com.liferay.training.employee.model.Employee updateEmployee(
		com.liferay.training.employee.model.Employee employee) {

		return _employeeLocalService.updateEmployee(employee);
	}

	@Override
	public com.liferay.training.employee.model.Employee updateEmployee(
			long userId, long empId, String name, String jobTitle,
			String phoneNo, long salary, long deptId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.updateEmployee(
			userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId,
			serviceContext);
	}

	@Override
	public EmployeeLocalService getWrappedService() {
		return _employeeLocalService;
	}

	@Override
	public void setWrappedService(EmployeeLocalService employeeLocalService) {
		_employeeLocalService = employeeLocalService;
	}

	private EmployeeLocalService _employeeLocalService;

}