package org.code.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class UserRegistration extends PanacheEntity {

    public String name;
    public String email;
    public int age;

}

