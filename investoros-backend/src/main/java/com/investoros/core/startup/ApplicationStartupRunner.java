package com.investoros.core.startup;

import com.investoros.core.config.application.ApplicationProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ApplicationStartupRunner implements CommandLineRunner {

    private final ApplicationProperties properties;

    @Override
    public void run(String... args) {

        log.info("========================================");
        log.info("InvestorOS Started");
        log.info("Version      : {}", properties.version());
        log.info("Environment  : {}", properties.environment());
        log.info("========================================");

    }
}