package com.investoros.core.config.application;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "investoros")
public record ApplicationProperties(
        String version,
        String environment
) {
}