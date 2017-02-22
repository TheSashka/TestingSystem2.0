package com.aleksandr.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id @GeneratedValue
    private @Getter @Setter Long id;

    public AbstractEntity() {}
}
