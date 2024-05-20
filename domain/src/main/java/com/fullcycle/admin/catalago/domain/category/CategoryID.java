package com.fullcycle.admin.catalago.domain.category;

import com.fullcycle.admin.catalago.domain.Identifier;

import java.util.*;

public class CategoryID extends Identifier {

    private final String value;

    //Construtor
    private CategoryID(final String value) {
        //Não permite valor nulo
        Objects.requireNonNull(value);
        this.value = value;
    }

    //Factory
    public static CategoryID unique() {
        return CategoryID.from(UUID.randomUUID());
    }

    //Helpers
    public static CategoryID from(final String anId) {
        return new CategoryID(anId);
    }

    public static CategoryID from(final UUID anId) {
        return new CategoryID(anId.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryID that = (CategoryID) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
