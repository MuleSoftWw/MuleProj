package org.ww.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



@Path("/")
public interface ExampleService {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Object setData(@QueryParam("content") String content);

}
