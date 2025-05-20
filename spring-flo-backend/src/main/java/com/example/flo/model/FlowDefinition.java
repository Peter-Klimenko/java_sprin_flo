package com.example.flo.model;

public class FlowDefinition {
    private String id;
    private String name;
    private String dsl;

    public FlowDefinition() {}

    public FlowDefinition(String id, String name, String dsl) {
        this.id = id;
        this.name = name;
        this.dsl = dsl;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDsl() { return dsl; }
    public void setDsl(String dsl) { this.dsl = dsl; }
}