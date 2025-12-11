package org.celtric.ai.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the annotated code was refactored by an AI assistant.
 * The original implementation existed but was restructured or improved by AI.
 * This annotation is for documentation purposes only and has no runtime effect.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface AIRefactored {

    /**
     * The name or identifier of the AI model/assistant that refactored this code, including the version if available.
     * Examples: "GitHub Copilot", "ChatGPT-4", "Claude Opus 4.5"
     */
    String model() default "";

    /**
     * The date when the code was refactored (ISO 8601 format recommended).
     * Example: "2025-12-11"
     */
    String date() default "";

    /**
     * A brief description of the refactoring that was performed.
     */
    String refactoring() default "";

    /**
     * The reason or goal for the refactoring.
     */
    String reason() default "";
}

