package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Question extends AbstractEntity {

    @NotNull @Column(columnDefinition = "TEXT")
    private @Getter @Setter String text;
    private @Getter @Setter Integer difficult;
    @NotNull @Column(columnDefinition = "VARCHAR(255) default TEST")
    private @Getter @Setter String typeOfQuestion;

    @ManyToOne @JoinColumn(name = "idTheme")
    private @Getter @Setter Theme theme;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @OneToMany(mappedBy = "question")
    private List<VariantOfAnswer> variantOfAnswers;

    public Question() {
        super();
    }
}