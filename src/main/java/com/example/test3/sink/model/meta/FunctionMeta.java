package com.example.test3.sink.model.meta;

import java.util.Collection;
import java.util.Objects;

import org.apache.pulsar.functions.api.Context;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FunctionMeta {

    private int instanceId;
    private String namespace;
    private String tenant;
    private String functionId;
    private String functionName;
    private String functionVersion;
    private Collection<String> inputTopics;
    private String outputTopic;
    private String userConfig;

    public FunctionMeta(Context context) {
        this.instanceId = context.getInstanceId();
        this.namespace = context.getNamespace();
        this.tenant = context.getTenant();
        this.functionId = context.getFunctionId();
        this.functionName = context.getFunctionName();
        this.functionVersion = context.getFunctionVersion();
        this.inputTopics = context.getInputTopics();
        this.outputTopic = context.getOutputTopic();
        this.userConfig = Objects.toString(context.getUserConfigMap());
    }
}
