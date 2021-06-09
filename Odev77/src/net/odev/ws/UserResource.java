package net.odev.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {
	private UserDAO dao = UserDAO.getInstance();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> list() {
		return dao.listAll();
	}
	
	@POST
	@Path("/add")
	public Response add(@FormParam("id") int id,@FormParam("name") String
            name, @FormParam("email") String email, @FormParam("country") String country) {
		User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        user.setCountry(country);
        User userResponse = dao.add(user);
	    return Response.ok(userResponse, MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") int id) {
	    User user = dao.get(id);
	    if (user != null) {
	        return Response.ok(user, MediaType.APPLICATION_JSON).build();
	    } else {
	        return Response.status(Response.Status.NOT_FOUND).build();
	    }
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response update(@PathParam("id") int id, @FormParam("name") String
            name, @FormParam("email") String email, @FormParam("country") String country) {
	    User user = dao.get(id);
	    	    
	    if (dao.update(id,name,email,country)) {
	    	return Response.ok(user, MediaType.APPLICATION_JSON).build();
	    } else {
	        return Response.notModified().build();
	    }
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") int id) {
	    if (dao.delete(id)) {
	        return Response.ok().build();
	    } else {
	        return Response.notModified().build();
	    }
	}
}
