package com.jdavidtorres.aisoftwarebuilder.config;

import com.jdavidtorres.aisoftwarebuilder.ai.port.AiClientPort;
import com.jdavidtorres.aisoftwarebuilder.ai.provider.openai.OpenAiSpringAiClient;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AiProviderProperties.class)
public class AiConfiguration {

    @Bean
    ChatClient chatClient(ChatModel chatModel) {
        return ChatClient.builder(chatModel).build();
    }

    @Bean
    AiClientPort aiClientPort(
            AiProviderProperties properties,
            OpenAiSpringAiClient openAiSpringAiClient
    ) {
        return switch (properties.provider().toLowerCase()) {
            case "openai" -> openAiSpringAiClient;
            default -> throw new IllegalArgumentException("Unsupported AI provider: " + properties.provider());
        };
    }
}
