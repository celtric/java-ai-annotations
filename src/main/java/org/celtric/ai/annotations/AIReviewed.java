package org.celtric.ai.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the annotated code was reviewed by an AI assistant.
 * The code was originally written by a human and subsequently reviewed or improved based on AI suggestions.
 * This annotation is for documentation purposes only and has no runtime effect.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface AIReviewed {

    /**
     * The name or identifier of the AI model/assistant that reviewed this code, including the version if available.
     * Examples: "GitHub Copilot", "ChatGPT-4", "Claude Opus 4.5"
     */
    String model() default "";

    /**
     * The date when the code was reviewed (ISO 8601 format recommended).
     * Example: "2025-12-11"
     */
    String date() default "";

    /**
     * A brief description of what the AI review covered or improved.
     */
    String review() default "";
}

