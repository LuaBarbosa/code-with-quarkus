package org.code.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.code.entity.UserEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<UserEntity> {
}
