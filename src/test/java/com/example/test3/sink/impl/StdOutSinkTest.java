package com.example.test3.sink.impl;

import java.util.Arrays;

import org.apache.pulsar.common.io.SinkConfig;
import org.apache.pulsar.functions.LocalRunner;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

class StdOutSinkTest {

    public static void main(String[] args) throws Exception {
        Logger root = (Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.INFO);

        SinkConfig sinkConfig = new SinkConfig();
        sinkConfig.setName(StdOutSink.class.getSimpleName());
        sinkConfig.setInputs(Arrays.asList("persistent://public/default/log-function"));
        sinkConfig.setSourceSubscriptionName("log-function-sink");
        sinkConfig.setClassName(StdOutSink.class.getName());

        LocalRunner localRunner = LocalRunner.builder().sinkConfig(sinkConfig).build();
        localRunner.start(false);
    }
}
