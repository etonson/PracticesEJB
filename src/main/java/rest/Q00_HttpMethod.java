package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("httpmethod")
public class Q00_HttpMethod {

	@Path("example01")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public void example01() {
		System.out.println("hello world!!");
	}
}