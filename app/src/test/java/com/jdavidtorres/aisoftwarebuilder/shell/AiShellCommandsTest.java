package com.jdavidtorres.aisoftwarebuilder.shell;

import com.jdavidtorres.aisoftwarebuilder.application.AskAiUseCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AiShellCommandsTest {

    @Test
    void delegatesPromptToUseCase() {
        AskAiUseCase useCase = new AskAiUseCase(prompt -> "mocked");
        AiShellCommands commands = new AiShellCommands(useCase);

        String result = commands.ask("hello from shell");

        assertEquals("mocked", result);
    }
}
