package com.jdavidtorres.aisoftwarebuilder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ai")
public record AiProviderProperties(String provider) {

    public AiProviderProperties {
        if (provider == null || provider.isBlank()) {
            provider = "openai";
        }
    }
}
