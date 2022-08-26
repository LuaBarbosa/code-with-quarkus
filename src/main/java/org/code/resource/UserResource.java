package org.code.resource;

import org.code.entity.UserRegistration;
import org.h2.engine.User;

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

    @GET
    @Path("/{id}")
    public UserRegistration listUser(Long id){
        return UserRegistration.findById(id);
    }

    @POST
    @Transactional
    public Response createUser(UserRegistration user){
        user.persist();
        return Response.created(URI.create("/user/")).build();
    }
    @PUT
    @Path("/{id}")
    @Transactional
    public UserRegistration update(Long id, UserRegistration user) {
        UserRegistration entity = UserRegistration.findById(id);
        if(entity == null){
            throw new NotFoundException();
        }
        return entity;
    }

    @DELETE
    @Path("/{id}")
    public void delete(Long id ){

        UserRegistration entity = UserRegistration.findById(id);
        if(entity == null){
            throw new NotFoundException();
        }
        entity.delete();
    }
}
