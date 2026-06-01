package com.jdavidtorres.aisoftwarebuilder.ai.provider.openai;

import com.jdavidtorres.aisoftwarebuilder.ai.port.AiClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OpenAiSpringAiClient implements AiClientPort {

    private final ChatClient chatClient;

    @Override
    public String ask(String prompt) {
        return chatClient.prompt(prompt).call().content();
    }
}
