package com.fullcycle.admin.catalago.domain;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    //Constructor
    protected AggregateRoot(ID id) {
        super(id);
    }

}
