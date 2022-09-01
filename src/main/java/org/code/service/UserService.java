package org.code.service;

import org.code.entity.UserEntity;
import org.code.repository.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepository = null;
    
    public List<UserEntity> listAll(){
        return userRepository.findAll().list();
    };

    public void newUser(UserEntity user){
        userRepository.persist(user);
    };

    // UserRepository update(Long id);
    // Response delete(Long id);

}
