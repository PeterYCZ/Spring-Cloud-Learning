package com.jky.monitor;

import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.stereotype.Component;


import java.time.Instant;
import java.util.List;
import java.util.Map;

@Component
public class Myevent implements AuditEventRepository {


    @Override
    public void add(AuditEvent event) {

    }

    @Override
    public List<AuditEvent> find(String principal, Instant after, String type) {
        return null;
    }
}
