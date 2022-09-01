package org.code.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //lombok
@NoArgsConstructor
@Table(name = "users")
public class UserEntity extends PanacheEntityBase {

    @Id
    public Long id;
    public String name;
    public String city;
    public int age;

}



