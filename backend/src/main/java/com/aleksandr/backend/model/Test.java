package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Entity
public class Test extends AbstractEntity {

    @ManyToOne @JoinColumn(name = "idUser")
    private @Getter @Setter User user;
    @NotNull
    private @Getter @Setter Date date;
    @NotNull
    private @Getter @Setter String state;
    @NotNull
    private @Getter @Setter Integer numberOfPoints;

    @OneToMany(mappedBy = "test")
    private List<Answer> answers;

    public Test() {
        super();
    }
}