# ai-soft-builder

Base inicial de un CLI tipo **AI Harness** con Java 21, Spring Boot, Spring Shell y Spring AI.

## Configuración

Define estas variables de entorno:

```bash
export AI_API_KEY="tu_api_key"
export AI_MODEL="gpt-4o-mini"
# opcional
export AI_BASE_URL="https://api.openai.com"
# opcional (por defecto openai)
export AI_PROVIDER="openai"
```

## Ejecutar el CLI

```bash
./gradlew :app:bootRun
```

## Ejemplo de uso

Dentro del prompt interactivo de Spring Shell:

```text
shell:>ai ask "Hola, ¿quién eres?"
```
