package org.code.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.code.entity.UserRegistration;

public class UserRepository implements PanacheRepository<UserRegistration> {
}
