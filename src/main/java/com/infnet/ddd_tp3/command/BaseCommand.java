package com.infnet.ddd_tp3.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

public abstract class BaseCommand<T> {

    @TargetAggregateIdentifier
    public final T id;
    public final UUID commandId;

    public BaseCommand(T id) {
        this.id = id;
        this.commandId = UUID.randomUUID();
    }

    public abstract void execute();
}
