package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Theme extends AbstractEntity {
    @NotNull
    private @Getter @Setter String text;

    @OneToMany(mappedBy = "theme")
    private List<Question> questions;
}
