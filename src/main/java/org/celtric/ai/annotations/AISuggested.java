package org.celtric.ai.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the annotated code was suggested by an AI assistant and accepted by a human developer with minimal or
 * no modifications. Typically used for inline code completions or autocomplete suggestions.
 * This annotation is for documentation purposes only and has no runtime effect.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface AISuggested {

    /**
     * The name or identifier of the AI model/assistant that suggested this code, including the version if available.
     * Examples: "GitHub Copilot", "ChatGPT-4", "Claude Opus 4.5"
     */
    String model() default "";

    /**
     * The date when the suggestion was accepted (ISO 8601 format recommended).
     * Example: "2025-12-11"
     */
    String date() default "";

    /**
     * The context or trigger that led to this suggestion.
     */
    String context() default "";
}

