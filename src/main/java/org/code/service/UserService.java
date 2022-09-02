package org.code.service;

import org.code.entity.UserEntity;
import org.code.repository.UserRepository;
import org.h2.engine.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepository;
    
    public List<UserEntity> listAll(){
        return userRepository.findAll().list();
    };

    public void newUser(UserEntity user){
        userRepository.persist(user);
    };

    public UserEntity listUser(Long id) {
      return userRepository.findById(id);

    }
    public boolean delete(Long id){
        return userRepository.deleteById(id);
    }

    public UserEntity update(Long id, UserEntity user){
        UserEntity userId = UserEntity.findById(id);
        if (userId == null) {
            throw new WebApplicationException("User with id of " + id + " does not exist.",
                    Response.Status.NOT_FOUND);
        }
        userId.setId(userId.getId());
        userId.setName(userId.getName());
        userId.setCity(userId.getCity());
        userId.setAge(userId.getAge());

        return userId;
    }


}
