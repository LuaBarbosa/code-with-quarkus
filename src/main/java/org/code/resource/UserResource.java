package org.code.resource;

import org.code.entity.UserRegistration;
import org.code.repository.UserRepository;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    public List<UserRegistration> listAll(){
        return UserRegistration.listAll();
    }



}
