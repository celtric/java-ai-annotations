package org.celtric.ai.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the annotated code was written with AI assistance, meaning a human developer collaborated with an AI
 * but made significant modifications or contributions.
 * This annotation is for documentation purposes only and has no runtime effect.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface AIAssisted {

    /**
     * The name or identifier of the AI model/assistant used including the version if available.
     * Examples: "GitHub Copilot", "ChatGPT-4", "Claude Opus 4.5"
     */
    String model() default "";

    /**
     * The date when the code was created (ISO 8601 format recommended).
     * Example: "2025-12-11"
     */
    String date() default "";

    /**
     * A brief description of how AI assisted in creating this code.
     */
    String description() default "";
}

