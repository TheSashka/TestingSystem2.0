package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class VariantOfAnswer extends AbstractEntity {
    @ManyToOne @JoinColumn(name = "idQuestion")
    private @Getter @Setter Question question;
    private @Getter @Setter String text;
    @NotNull @Column(columnDefinition = "TINYINT(1) default true")
    private @Getter @Setter Boolean isTrue;

    @OneToMany(mappedBy = "variantOfAnswer")
    private List<Answer> answers;

    public VariantOfAnswer() {
        super();
    }
}