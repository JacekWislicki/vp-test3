package com.example.test3.sink;

import java.util.Map;

import org.apache.pulsar.functions.api.Record;
import org.apache.pulsar.io.core.Sink;
import org.apache.pulsar.io.core.SinkContext;

public abstract class BaseSink<IN> implements Sink<IN> {

    @Override
    public void open(Map<String, Object> config, SinkContext context) throws Exception {}

    @Override
    public void write(Record<IN> record) throws Exception {
        System.out.print("***************** RECEIVED: " + record);
        record.ack();
    }

    @Override
    public void close() throws Exception {}
}
