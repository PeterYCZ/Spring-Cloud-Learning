package com.learning.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RefreshScope
public class HelloController {

    @Value("${neo.hello:error}")
    private String profile;

    @GetMapping("/info")
    public Mono<String> hello() {
        return Mono.justOrEmpty(profile);
    }
}