package com.example.test3.sink.model;

import com.example.test3.sink.model.Logger.Level;
import com.example.test3.sink.model.meta.FunctionMeta;
import com.example.test3.sink.model.meta.RecordMeta;
import com.example.test3.sink.model.meta.SinkMeta;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class RichLogEntry extends LogEntry {

    private Level level;
    private String className;
    private String _makoId;

    private FunctionMeta functionMeta;
    private SinkMeta sinkMeta;
    private RecordMeta recordMeta;

    private String stackTrace;

    RichLogEntry(LogEntry source, Level level, String className, String _makoId) {
        super(source);
        this.level = level;
        this._makoId = _makoId;
        this.className = className;
    }
}
