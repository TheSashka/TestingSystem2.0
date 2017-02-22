package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
public class Test extends AbstractEntity {
    @NotNull
    private @Getter @Setter Long idUser;
    @NotNull
    private @Getter @Setter Date date;
    @NotNull
    private @Getter @Setter String state;
    @NotNull
    private @Getter @Setter Integer numberOfPoints;

    public Test() {
        super();
    }
}