package prac.rk.rest;

import java.util.List;

import javax.ws.rs.Consumes;

// url:
// http://localhost:8080/RKRestJerseyExample/rkprojects/ctofservice/12.2

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import prac.models.Person;
import prac.models.Response;
 
@Path("/ctofservice")
public class CtoFService {
	/*@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}*/
	
	@GET
	//@Produces("application/xml")
	public Response convertCtoF() {
 
		Response r = new Response();
		r.setId(1);
		r.setMessage("test mesg");
		return r;
	}
	
	
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	
	@Path("/multiValue")
	@GET
	public String getMV(@Context UriInfo ui) {
	    MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
	    MultivaluedMap<String, String> pathParams = ui.getPathParameters();
		return "ok";
	}
	
	@Path("/multiValue2")
	@GET
	@Produces("application/xml") // if it is present then you return xml only
	public String getMV2(@QueryParam("param1") int param1, @QueryParam("param2") List<String> param2) {
	    for (String s : param2) {
	    	System.out.println(s);
	    }
		//return "ok";
	    return "<tag1><mesg>ok</mesg></tag1>";
	}
	
	@Path("/multiValue3")
	@GET
	public String getMV3(@PathParam("id") List<String> ids) {
	    if (ids != null) {
	    	String abc = "";
	    }
		
		return "ok";
	}
	
	
	@Path("/post1")
	@POST
	@Consumes("application/xml")
	public String postSingle(Person p) {
	    if (p != null) {
	    	String abc = "";
	    }
		
		return "ok";
	}
	
	@Path("/post2")
	@POST
	@Consumes("application/xml")
	public String postMultiple(List<Person> plist) {
	    if (plist != null) {
	    	String abc = "";
	    }
		
		return "ok";
	}
	
	// Path has to be different for all the methods
}