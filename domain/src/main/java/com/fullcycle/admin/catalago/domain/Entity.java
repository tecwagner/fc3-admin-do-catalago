package com.fullcycle.admin.catalago.domain;

import java.util.*;

// O tipo generico ID está extension de um Identificador que é classe abstrata de um objeto de valor.
public abstract class Entity<ID extends Identifier> {

    // Protegido e imutavel
    protected final ID id;

    protected Entity(final ID id) {
        Objects.requireNonNull(id, "'Id' should not be null");
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        final Entity<?> entity = (Entity<?>) obj;
        return getId().equals(entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
