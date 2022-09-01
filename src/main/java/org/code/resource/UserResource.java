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
        return UserEntity.findById(id);
    }
    @POST
    @Transactional
    public void newUser(UserEntity user){
        service.newUser(user);

    }



}
