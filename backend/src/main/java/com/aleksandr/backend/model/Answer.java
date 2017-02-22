package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Answer extends AbstractEntity {
    @NotNull
    private @Getter @Setter Long idQuestion;
    @NotNull
    private @Getter @Setter Long idVariantOfAnswer;
    @NotNull
    private @Getter @Setter Long idTest;

    public Answer() {
        super();
    }
}