package com.example.flo.controller;

import com.example.flo.model.FlowDefinition;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/flows")
@CrossOrigin(origins = "*")
public class FlowController {

    private final Map<String, FlowDefinition> flowStorage = new HashMap<>();

    @PostMapping
    public FlowDefinition save(@RequestBody FlowDefinition flow) {
        flow.setId(UUID.randomUUID().toString());
        flowStorage.put(flow.getId(), flow);
        return flow;
    }

    @GetMapping("/{id}")
    public FlowDefinition get(@PathVariable String id) {
        return flowStorage.get(id);
    }

    @GetMapping
    public Collection<FlowDefinition> list() {
        return flowStorage.values();
    }
}