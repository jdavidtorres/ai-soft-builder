package com.jdavidtorres.aisoftwarebuilder.application;

import com.jdavidtorres.aisoftwarebuilder.ai.port.AiClientPort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AskAiUseCaseTest {

    @Test
    void returnsResponseFromAiPort() {
        AiClientPort port = prompt -> "answer to: " + prompt;
        AskAiUseCase useCase = new AskAiUseCase(port);

        AskAiResponse response = useCase.ask(new AskAiRequest("hello"));

        assertEquals("answer to: hello", response.content());
    }
}
