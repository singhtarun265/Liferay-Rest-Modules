package com.liferay.rest.application;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.training.employee.model.Employee;
import com.liferay.training.employee.service.EmployeeLocalService;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author Argil DX
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest"
	},
	service = Application.class
)
public class EmployeeRestApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	/*
	 * @GET
	 * 
	 * @Produces("text/plain") public String working() { return "It works!"; }
	 * 
	 * @GET
	 * 
	 * @Path("/morning")
	 * 
	 * @Produces("text/plain") public String hello() { return "Good morning!"; }
	 * 
	 * @GET
	 * 
	 * @Path("/morning/{name}")
	 * 
	 * @Produces("text/plain") public String morning(
	 * 
	 * @PathParam("name") String name,
	 * 
	 * @QueryParam("drink") String drink) {
	 * 
	 * String greeting = "Good Morning " + name;
	 * 
	 * if (drink != null) { greeting += ". Would you like some " + drink + "?"; }
	 * 
	 * return greeting; }
	 */
	private EmployeeLocalService employeeLocalService;

	  @Reference(unbind="-")

	  public void setLeaveLocalService(EmployeeLocalService employeeLocalService){

	         this.employeeLocalService=employeeLocalService;

	   }

	   @GET

	   @Path("/employee-info/{employeeId}")

	   @Produces(MediaType.APPLICATION_JSON)

	  public String getLeave(@PathParam("employeeId") long employeeId){

	       Employee employee = null;

	       String jsonString = null;

	     try {

	                employee = employeeLocalService.getEmployee(employeeId);

	                jsonString = JSONFactoryUtil.serialize(employee);
	                
	              
	                	

	        } catch (Exception e) {

	        jsonString = JSONFactoryUtil.serialize("Employee ID: "+employeeId+" does not exist");
	         e.printStackTrace();
	         

	       }

	     return jsonString;

	    }
	
	
	/*
	 * dependencies { compileOnly group: "javax.ws.rs", name: "javax.ws.rs-api"
	 * compileOnly group: "org.osgi", name: "org.osgi.service.component.annotations"
	 * compileOnly group: "org.osgi", name: "org.osgi.service.jaxrs" }
	 */
}