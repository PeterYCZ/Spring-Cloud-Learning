package com.learning.springcloud.configclient.testbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class TestBean implements HealthIndicator {

    @Value("${neo.hello:error}")
    private String profile;


    @Override
    public Health health() {
        return Health.up().withDetail("context", profile).build();
    }
}
