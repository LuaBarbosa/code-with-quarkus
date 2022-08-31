package org.code.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "users")
public class UserRegistration extends PanacheEntityBase {

    @Id
    private Long id;
    public String name;
    public String city;
    public int age;

}



