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

package com.liferay.training.employee.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.employee.model.Employee;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the employee service. This utility wraps <code>com.liferay.training.employee.service.persistence.impl.EmployeePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeePersistence
 * @generated
 */
public class EmployeeUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Employee employee) {
		getPersistence().clearCache(employee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Employee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Employee update(Employee employee) {
		return getPersistence().update(employee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Employee update(
		Employee employee, ServiceContext serviceContext) {

		return getPersistence().update(employee, serviceContext);
	}

	/**
	 * Returns all the employees where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching employees
	 */
	public static List<Employee> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByUuid_First(
			String uuid, OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUuid_First(
		String uuid, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByUuid_Last(
			String uuid, OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUuid_Last(
		String uuid, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where uuid = &#63;.
	 *
	 * @param empId the primary key of the current employee
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByUuid_PrevAndNext(
			long empId, String uuid,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_PrevAndNext(
			empId, uuid, orderByComparator);
	}

	/**
	 * Removes all the employees where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of employees where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching employees
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the employee where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the employee where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the employee where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the employee where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the employee that was removed
	 */
	public static Employee removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of employees where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching employees
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the employees where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching employees
	 */
	public static List<Employee> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the employees where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param empId the primary key of the current employee
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByUuid_C_PrevAndNext(
			long empId, String uuid, long companyId,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			empId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the employees where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of employees where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching employees
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the employees where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching employees
	 */
	public static List<Employee> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the employees where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByGroupId_First(
			long groupId, OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByGroupId_First(
		long groupId, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByGroupId_Last(
			long groupId, OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByGroupId_Last(
		long groupId, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where groupId = &#63;.
	 *
	 * @param empId the primary key of the current employee
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByGroupId_PrevAndNext(
			long empId, long groupId,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByGroupId_PrevAndNext(
			empId, groupId, orderByComparator);
	}

	/**
	 * Removes all the employees where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of employees where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching employees
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the employees where deptId = &#63; and salary = &#63;.
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @return the matching employees
	 */
	public static List<Employee> findBydeptSalary(long deptId, long salary) {
		return getPersistence().findBydeptSalary(deptId, salary);
	}

	/**
	 * Returns a range of all the employees where deptId = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findBydeptSalary(
		long deptId, long salary, int start, int end) {

		return getPersistence().findBydeptSalary(deptId, salary, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where deptId = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findBydeptSalary(
		long deptId, long salary, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findBydeptSalary(
			deptId, salary, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where deptId = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findBydeptSalary(
		long deptId, long salary, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBydeptSalary(
			deptId, salary, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where deptId = &#63; and salary = &#63;.
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findBydeptSalary_First(
			long deptId, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findBydeptSalary_First(
			deptId, salary, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where deptId = &#63; and salary = &#63;.
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchBydeptSalary_First(
		long deptId, long salary,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchBydeptSalary_First(
			deptId, salary, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where deptId = &#63; and salary = &#63;.
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findBydeptSalary_Last(
			long deptId, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findBydeptSalary_Last(
			deptId, salary, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where deptId = &#63; and salary = &#63;.
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchBydeptSalary_Last(
		long deptId, long salary,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchBydeptSalary_Last(
			deptId, salary, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where deptId = &#63; and salary = &#63;.
	 *
	 * @param empId the primary key of the current employee
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findBydeptSalary_PrevAndNext(
			long empId, long deptId, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findBydeptSalary_PrevAndNext(
			empId, deptId, salary, orderByComparator);
	}

	/**
	 * Removes all the employees where deptId = &#63; and salary = &#63; from the database.
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 */
	public static void removeBydeptSalary(long deptId, long salary) {
		getPersistence().removeBydeptSalary(deptId, salary);
	}

	/**
	 * Returns the number of employees where deptId = &#63; and salary = &#63;.
	 *
	 * @param deptId the dept ID
	 * @param salary the salary
	 * @return the number of matching employees
	 */
	public static int countBydeptSalary(long deptId, long salary) {
		return getPersistence().countBydeptSalary(deptId, salary);
	}

	/**
	 * Returns all the employees where projectId = &#63; and salary = &#63;.
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @return the matching employees
	 */
	public static List<Employee> findByprojectSalary(
		long projectId, long salary) {

		return getPersistence().findByprojectSalary(projectId, salary);
	}

	/**
	 * Returns a range of all the employees where projectId = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByprojectSalary(
		long projectId, long salary, int start, int end) {

		return getPersistence().findByprojectSalary(
			projectId, salary, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where projectId = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByprojectSalary(
		long projectId, long salary, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByprojectSalary(
			projectId, salary, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where projectId = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByprojectSalary(
		long projectId, long salary, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByprojectSalary(
			projectId, salary, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where projectId = &#63; and salary = &#63;.
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByprojectSalary_First(
			long projectId, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByprojectSalary_First(
			projectId, salary, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where projectId = &#63; and salary = &#63;.
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByprojectSalary_First(
		long projectId, long salary,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByprojectSalary_First(
			projectId, salary, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where projectId = &#63; and salary = &#63;.
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByprojectSalary_Last(
			long projectId, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByprojectSalary_Last(
			projectId, salary, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where projectId = &#63; and salary = &#63;.
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByprojectSalary_Last(
		long projectId, long salary,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByprojectSalary_Last(
			projectId, salary, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where projectId = &#63; and salary = &#63;.
	 *
	 * @param empId the primary key of the current employee
	 * @param projectId the project ID
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByprojectSalary_PrevAndNext(
			long empId, long projectId, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByprojectSalary_PrevAndNext(
			empId, projectId, salary, orderByComparator);
	}

	/**
	 * Removes all the employees where projectId = &#63; and salary = &#63; from the database.
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 */
	public static void removeByprojectSalary(long projectId, long salary) {
		getPersistence().removeByprojectSalary(projectId, salary);
	}

	/**
	 * Returns the number of employees where projectId = &#63; and salary = &#63;.
	 *
	 * @param projectId the project ID
	 * @param salary the salary
	 * @return the number of matching employees
	 */
	public static int countByprojectSalary(long projectId, long salary) {
		return getPersistence().countByprojectSalary(projectId, salary);
	}

	/**
	 * Returns all the employees where name = &#63; and salary = &#63;.
	 *
	 * @param name the name
	 * @param salary the salary
	 * @return the matching employees
	 */
	public static List<Employee> findBynameSalary(String name, long salary) {
		return getPersistence().findBynameSalary(name, salary);
	}

	/**
	 * Returns a range of all the employees where name = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findBynameSalary(
		String name, long salary, int start, int end) {

		return getPersistence().findBynameSalary(name, salary, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where name = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findBynameSalary(
		String name, long salary, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findBynameSalary(
			name, salary, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where name = &#63; and salary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param salary the salary
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findBynameSalary(
		String name, long salary, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBynameSalary(
			name, salary, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where name = &#63; and salary = &#63;.
	 *
	 * @param name the name
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findBynameSalary_First(
			String name, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findBynameSalary_First(
			name, salary, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where name = &#63; and salary = &#63;.
	 *
	 * @param name the name
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchBynameSalary_First(
		String name, long salary,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchBynameSalary_First(
			name, salary, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where name = &#63; and salary = &#63;.
	 *
	 * @param name the name
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findBynameSalary_Last(
			String name, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findBynameSalary_Last(
			name, salary, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where name = &#63; and salary = &#63;.
	 *
	 * @param name the name
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchBynameSalary_Last(
		String name, long salary,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchBynameSalary_Last(
			name, salary, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where name = &#63; and salary = &#63;.
	 *
	 * @param empId the primary key of the current employee
	 * @param name the name
	 * @param salary the salary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findBynameSalary_PrevAndNext(
			long empId, String name, long salary,
			OrderByComparator<Employee> orderByComparator)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findBynameSalary_PrevAndNext(
			empId, name, salary, orderByComparator);
	}

	/**
	 * Removes all the employees where name = &#63; and salary = &#63; from the database.
	 *
	 * @param name the name
	 * @param salary the salary
	 */
	public static void removeBynameSalary(String name, long salary) {
		getPersistence().removeBynameSalary(name, salary);
	}

	/**
	 * Returns the number of employees where name = &#63; and salary = &#63;.
	 *
	 * @param name the name
	 * @param salary the salary
	 * @return the number of matching employees
	 */
	public static int countBynameSalary(String name, long salary) {
		return getPersistence().countBynameSalary(name, salary);
	}

	/**
	 * Caches the employee in the entity cache if it is enabled.
	 *
	 * @param employee the employee
	 */
	public static void cacheResult(Employee employee) {
		getPersistence().cacheResult(employee);
	}

	/**
	 * Caches the employees in the entity cache if it is enabled.
	 *
	 * @param employees the employees
	 */
	public static void cacheResult(List<Employee> employees) {
		getPersistence().cacheResult(employees);
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param empId the primary key for the new employee
	 * @return the new employee
	 */
	public static Employee create(long empId) {
		return getPersistence().create(empId);
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empId the primary key of the employee
	 * @return the employee that was removed
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee remove(long empId)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().remove(empId);
	}

	public static Employee updateImpl(Employee employee) {
		return getPersistence().updateImpl(employee);
	}

	/**
	 * Returns the employee with the primary key or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param empId the primary key of the employee
	 * @return the employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee findByPrimaryKey(long empId)
		throws com.liferay.training.employee.exception.NoSuchEmployeeException {

		return getPersistence().findByPrimaryKey(empId);
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param empId the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 */
	public static Employee fetchByPrimaryKey(long empId) {
		return getPersistence().fetchByPrimaryKey(empId);
	}

	/**
	 * Returns all the employees.
	 *
	 * @return the employees
	 */
	public static List<Employee> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of employees
	 */
	public static List<Employee> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employees
	 */
	public static List<Employee> findAll(
		int start, int end, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of employees
	 */
	public static List<Employee> findAll(
		int start, int end, OrderByComparator<Employee> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the employees from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EmployeePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmployeePersistence, EmployeePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EmployeePersistence.class);

		ServiceTracker<EmployeePersistence, EmployeePersistence>
			serviceTracker =
				new ServiceTracker<EmployeePersistence, EmployeePersistence>(
					bundle.getBundleContext(), EmployeePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}