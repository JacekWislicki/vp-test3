package com.example.test3.sink.model.meta;

import java.util.Collection;

import org.apache.pulsar.io.core.SinkContext;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SinkMeta {

    private int instanceId;
    private String namespace;
    private String tenant;
    private String sinkName;
    private Collection<String> inputTopics;
    private String outputTopic;

    public SinkMeta(SinkContext context) {
        this.instanceId = context.getInstanceId();
        this.namespace = context.getNamespace();
        this.tenant = context.getTenant();
        this.sinkName = context.getSinkName();
        this.inputTopics = context.getInputTopics();
    }
}
