package com.jdavidtorres.aisoftwarebuilder.shell;

import com.jdavidtorres.aisoftwarebuilder.application.AskAiRequest;
import com.jdavidtorres.aisoftwarebuilder.application.AskAiUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@RequiredArgsConstructor
public class AiShellCommands {

    private final AskAiUseCase askAiUseCase;

    @ShellMethod(key = "ai ask", value = "Sends a prompt to the configured AI provider")
    public String ask(String message) {
        return askAiUseCase.ask(new AskAiRequest(message)).content();
    }
}
