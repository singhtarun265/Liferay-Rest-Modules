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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.employee.model.Employee;
import com.liferay.training.employee.service.base.EmployeeLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liferay.training.employee.service.EmployeeLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.liferay.training.employee.model.Employee", service = AopService.class)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.liferay.training.employee.service.EmployeeLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.liferay.training.employee.service.EmployeeLocalServiceUtil</code>.
	 */

	public Employee addEmployee(long userId, String name, String jobTitle, String phoneNo, long salary, long deptId,
			long projectId, ServiceContext serviceContext) throws PortalException {
		
	//ThemeDisplay themeDisplay = (ThemeDisplay) serviceContext.getAttribute(WebKeys.THEME_DISPLAY);
		
	//	long groupId = themeDisplay.getScopeGroupId();
		
		long groupId = serviceContext.getScopeGroupId();
		
		User user = userLocalService.getUserById(userId);

		long empId = counterLocalService.increment();

		Employee employee = employeePersistence.create(empId);

		employee.setUuid(serviceContext.getUuid());
		employee.setUserId(userId);
		employee.setGroupId(groupId);
		employee.setCompanyId(user.getCompanyId());
		employee.setUserName(user.getFullName());
		employee.setCreateDate(serviceContext.getCreateDate());
		employee.setModifiedDate(serviceContext.getModifiedDate());
		employee.setExpandoBridgeAttributes(serviceContext);
		employee.setEmpId(empId);
		employee.setName(name);
		employee.setJobTitle(jobTitle);
		employee.setPhoneNo(phoneNo);
		employee.setSalary(salary);
		employee.setDeptId(deptId);
		employee.setProjectId(projectId);

		employeePersistence.update(employee);
		
		return employee;

	}

	public Employee updateEmployee(long userId, long empId, String name, String jobTitle, String phoneNo, long salary,
			long deptId, long projectId, ServiceContext serviceContext) throws PortalException {

		Employee employee = employeePersistence.findByPrimaryKey(empId);

		User user = userLocalService.getUserById(userId);

		
		employee.setUserId(userId);
		employee.setUserName(user.getFullName());
		employee.setModifiedDate(serviceContext.getModifiedDate());
		employee.setExpandoBridgeAttributes(serviceContext);
		employee.setEmpId(empId);
		employee.setName(name);
		employee.setJobTitle(jobTitle);
		employee.setPhoneNo(phoneNo);
		employee.setSalary(salary);
		employee.setDeptId(deptId);
		employee.setProjectId(projectId);
		employeePersistence.update(employee);

		return employee;
	}

	public Employee deleteEmployee(Employee employee) throws PortalException {

		employeePersistence.remove(employee);

		return employee;
	}

	public Employee deleteEmployee(long empId) throws PortalException {

		Employee employee = employeePersistence.findByPrimaryKey(empId);

		return deleteEmployee(employee);

	}

	public Employee getEmployee(long empId) throws PortalException {

		return employeePersistence.findByPrimaryKey(empId);
	}

	public List<Employee> getEmployees(long deptId, long salary) {

		return employeePersistence.findBydeptSalary(deptId, salary);
	}

	public List<Employee> getEmployees(long deptId, long salary, int start, int end) {

		return employeePersistence.findBydeptSalary(deptId, salary, start, end);
	}

	public List<Employee> getEmployees(long deptId, long salary, int start, int end, OrderByComparator<Employee> obc) {

		return employeePersistence.findBydeptSalary(deptId, salary, start, end, obc);
	}

	public int getEmployeesCount(String name, long salary) {

		return employeePersistence.countBynameSalary(name, salary);
	}

	public List<Employee> getEmployeeByGroupIdAndUserIdAsLocal(long userId, long groupId) {
		return employeeFinder.getEmployeeByGroupIdAndUserId(userId, groupId);

	}

	public List<Employee> getEmployeeByUserNameAndJobTitleAsLocal(String userName, String jobTitle) {

		
		/*
		 * List<Employee> employeeList =
		 * dynamicQuery(employeeLocalService.dynamicQuery().
		 * add(RestrictionsFactoryUtil.eq("name", userName)).
		 * add(RestrictionsFactoryUtil.eq("jobTitle", jobTitle)));
		 * 
		 *  return employeeList;
		 */ 
		
		return employeeFinder.getEmployeeByUserNameAndJobTitleWithDynamic(userName, jobTitle);
		 
	}
	
	public List<Employee> getAllEmployeesInformationAsLocal(int start, int end) {
		return employeeFinder.getAllEmployeesInformation(start,end);
	}
	
	public List<Employee> getSearchEmployeesInformationAsLocal(long userId, long empId, String name, String jobTitle, String phoneNo, long salary,
			long deptId, long projectId)throws SystemException{
		
		DynamicQuery dynamicQuery = buildEmployeesDynamicQuery(userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId);
		
		return employeeLocalService.dynamicQuery(dynamicQuery);
	}

	public int getSearchOfficeEmployeeCountAsLocal(long userId, long empId, String name, String jobTitle, String phoneNo, long salary,
			long deptId, long projectId)	throws SystemException{
		
			DynamicQuery dynamicQuery = buildEmployeesDynamicQuery(userId, empId, name, jobTitle, phoneNo, salary, deptId, projectId);
			return (int)employeeLocalService.dynamicQueryCount(dynamicQuery);
	}
	
	protected DynamicQuery buildEmployeesDynamicQuery(long userId, long empId, String name, String jobTitle, String phoneNo, long salary,
			long deptId, long projectId)
	{
		Junction junction = null;
		
			junction = RestrictionsFactoryUtil.conjunction();
		
		if (userId > 0) {
			Property property = PropertyFactoryUtil.forName("userId");
			junction.add(property.eq(Long.valueOf(userId)));
		}
		if (empId > 0) {
			Property property = PropertyFactoryUtil.forName("empId");
			junction.add(property.eq(Long.valueOf(empId)));
		}
		if (Validator.isNotNull(name)) {
			Property property = PropertyFactoryUtil.forName("name");
			String value = (new StringBuilder("%")).append(name).append("%").toString();
			junction.add(property.like(value));
		}
		if (Validator.isNotNull(jobTitle)) {
			Property property = PropertyFactoryUtil.forName("jobTitle");
			String value = (new StringBuilder("%")).append(jobTitle).append("%").toString();
			junction.add(property.like(value));
		}
		
		if (Validator.isNotNull(phoneNo)) {
			Property property = PropertyFactoryUtil.forName("phoneNo");
			String value = (new StringBuilder("%")).append(phoneNo).append("%").toString();
			junction.add(property.like(value));
		}
		if (salary > 0) {
			Property property = PropertyFactoryUtil.forName("salary");
			junction.add(property.eq(Long.valueOf(salary)));
		}
		if (deptId > 0) {
			Property property = PropertyFactoryUtil.forName("deptId");
			junction.add(property.eq(Long.valueOf(deptId)));
		}
		if (projectId > 0) {
			Property property = PropertyFactoryUtil.forName("projectId");
			junction.add(property.eq(Long.valueOf(projectId)));
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Employee.class, getClassLoader());
		return dynamicQuery.add(junction);
	}
	

}