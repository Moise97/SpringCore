package com.springexample.SpringCore.POJOs;

import com.springexample.SpringCore.POJOs.prefix.DatePrefixGenerator;

import java.beans.ConstructorProperties;
import java.util.List;
import java.util.Map;

public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private int counter;
    private DatePrefixGenerator prefixGenerator;
    private List<Object> listSuffixes;
    private Map<Object, Object> mapSuffixes;

    SequenceGenerator() {}

    public SequenceGenerator(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public SequenceGenerator(String prefix, int initial) {
        this.prefix = prefix;
        this.initial = initial;
    }

    // Allow Spring to look up the parameters name from the constructor
    @ConstructorProperties({"initial", "suffix"})
    public SequenceGenerator(int initial, String suffix) {
        this.initial = initial;
        this.suffix = suffix;
    }

    SequenceGenerator(String prefix, String suffix, int initial, int counter) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
        this.counter = counter;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setPrefixGenerator(DatePrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public void setListSuffixes(List<Object> listSuffixes) {
        this.listSuffixes = listSuffixes;
    }

    public void setMapSuffixes(Map<Object, Object> mapSuffixes) {
        this.mapSuffixes = mapSuffixes;
    }

    String getPrefix() {
        return prefix;
    }

    String getSuffix() {
        return suffix;
    }

    int getInitial() {
        return initial;
    }

    int getCounter() {
        return counter;
    }

    public synchronized String getSequence() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        buffer.append(suffix);
        return buffer.toString();
    }

    public synchronized String getSequenceGenerator() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prefixGenerator.getPrefix());
        stringBuilder.append(initial + counter++);
        stringBuilder.append(suffix);
        return stringBuilder.toString();
    }

    public synchronized String getSequenceListGenerator() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix);
        builder.append(initial + counter++);
        for(Object suffix : listSuffixes) {
            builder.append('-');
            builder.append(suffix);
        }
        return builder.toString();
    }

    public synchronized String getSequenceMapGenerator() {
        StringBuilder stringMapBuilder = new StringBuilder();
        stringMapBuilder.append(prefix);
        stringMapBuilder.append(initial + counter++);
        for(Map.Entry entry : mapSuffixes.entrySet()) {
            stringMapBuilder.append('-');
            stringMapBuilder.append(entry.getKey());
            stringMapBuilder.append('@');
            stringMapBuilder.append(entry.getValue());
        }
        return stringMapBuilder.toString();
    }
}
