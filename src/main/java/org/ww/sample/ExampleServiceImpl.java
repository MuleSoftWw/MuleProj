package org.ww.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

public class ExampleServiceImpl implements ExampleService {

	@Override
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("setdata")
	public Object setData(@QueryParam("content") String content) {
		// TODO Auto-generated method stub
		System.out.println("Inside the setData method" + content);
		
		String sampleXml = "<customer><custid>231132</custid></customer>";
		
		
//		return "Hello" + content;
		
		return sampleXml;
	}

}
