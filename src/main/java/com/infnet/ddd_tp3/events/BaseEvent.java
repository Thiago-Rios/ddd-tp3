package com.infnet.ddd_tp3.events;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEvent<T> {

    public T eventData;
    public UUID eventId;
    public LocalDateTime eventTimestamp;

    public BaseEvent(T eventData) {
        this.eventId = UUID.randomUUID();
        this.eventTimestamp = LocalDateTime.now();
        this.eventData = eventData;
    }

}
