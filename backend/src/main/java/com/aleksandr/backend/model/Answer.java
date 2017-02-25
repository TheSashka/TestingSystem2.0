package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer extends AbstractEntity {
    @ManyToOne @JoinColumn(name = "idQuestion")
    private @Getter @Setter Question question;
    @ManyToOne @JoinColumn(name = "idVariantOfAnswer")
    private @Getter @Setter VariantOfAnswer variantOfAnswer;
    @ManyToOne @JoinColumn(name = "idTest")
    private @Getter @Setter Test test;

    public Answer() {
        super();
    }
}