package com.example.test3.sink.model.meta;

import org.apache.pulsar.functions.api.Record;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RecordMeta {

    private Long eventTime;
    private String topic;
    private String key;
    private String partitionId;
    private Integer partitionIndex;
    private String destinationTopic;
    private Long recordSequence;

    public RecordMeta(Record<?> record) {
        this.eventTime = record.getEventTime().orElse(null);
        this.topic = record.getTopicName().orElse(null);
        this.key = record.getKey().orElse(null);
        this.partitionId = record.getPartitionId().orElse(null);
        this.partitionIndex = record.getPartitionIndex().orElse(null);
        this.destinationTopic = record.getDestinationTopic().orElse(null);
        this.recordSequence = record.getRecordSequence().orElse(null);
    }
}
