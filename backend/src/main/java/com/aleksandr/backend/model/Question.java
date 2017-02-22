package com.aleksandr.backend.model;

import com.aleksandr.backend.commons.Theme;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Question extends AbstractEntity {

    @NotNull @Column(columnDefinition = "TEXT")
    private @Getter @Setter String text;
    private @Getter @Setter Integer difficult;
    @NotNull @Column(columnDefinition = "VARCHAR(255) default TEST")
    private @Getter @Setter String typeOfQuestion;
    @NotNull
    private @Getter @Setter Theme theme;

    public Question() {
        super();
    }
}