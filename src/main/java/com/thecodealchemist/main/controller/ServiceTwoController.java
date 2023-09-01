package com.thecodealchemist.main.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ServiceTwoController {
    @Value("${trade.key}")
    private String tradekey;

    @Value("${some.key}")
    private String someKey;

    @GetMapping
    public String printKey() {
        return "Service-2 ->" + tradekey +" ->" + someKey;
    }
}
