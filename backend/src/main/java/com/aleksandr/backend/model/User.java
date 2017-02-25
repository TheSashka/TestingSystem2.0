package com.aleksandr.backend.model;

import com.aleksandr.backend.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class User extends AbstractEntity {
    @NotNull
    private @Getter @Setter String mail;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    @NotNull
    private @Getter @Setter String password;
    @NotNull @Column(columnDefinition = "VARCHAR(255) default USER")
    private @Getter @Setter Role role;
    @NotNull @Column(columnDefinition = "TINYINT(1) default 1")
    private @Getter @Setter Boolean enabled;

    @OneToMany(mappedBy = "user")
    private List<Test> tests;

    public User() {
        super();
    }
}