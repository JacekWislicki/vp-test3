package com.example.test3.sink.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LogEntry {

    @SuppressWarnings("java:S116")
    private long _timestamp = System.currentTimeMillis();
    private String message;
    private String event;
    private String result;
    private byte[] serialisedThrowable;

    protected LogEntry(LogEntry source) {
        this.message = source.getMessage();
        this.event = source.getEvent();
        this.result = source.getResult();
        this.serialisedThrowable = source.getSerialisedThrowable();
    }
}
