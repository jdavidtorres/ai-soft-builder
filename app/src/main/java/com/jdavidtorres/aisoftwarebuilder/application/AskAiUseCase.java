package com.jdavidtorres.aisoftwarebuilder.application;

import com.jdavidtorres.aisoftwarebuilder.ai.port.AiClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AskAiUseCase {

    private final AiClientPort aiClientPort;

    public AskAiResponse ask(AskAiRequest request) {
        String response = aiClientPort.ask(request.prompt());
        return new AskAiResponse(response);
    }
}
