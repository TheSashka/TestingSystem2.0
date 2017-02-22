package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class VariantOfAnswer extends AbstractEntity {
    @NotNull
    private @Getter @Setter Long idQuestion;
    private @Getter @Setter String text;
    @NotNull @Column(columnDefinition = "TINYINT(1) default true")
    private @Getter @Setter Boolean isTrue;

    public VariantOfAnswer() {
        super();
    }
}