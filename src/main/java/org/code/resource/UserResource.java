package org.code.resource;

import org.code.entity.UserEntity;
import org.code.service.UserService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
    @Inject
    private UserService service;

    @GET
    public List<UserEntity> listAll(){
        return service.listAll();
    }
    @GET
    @Path("/{id}")
    public UserEntity listUser(@PathParam("id") Long id){
        return service.listUser(id);
    }
    @POST
    @Transactional
    public void newUser(UserEntity user){
        service.newUser(user);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public boolean delete(@PathParam("id") Long id){
        return service.delete(id);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, UserEntity user){
       service.update(id, user);
       return Response.ok(user).build();
    }

}
