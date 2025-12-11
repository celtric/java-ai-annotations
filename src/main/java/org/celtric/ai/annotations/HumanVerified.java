package org.celtric.ai.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that AI-generated or AI-assisted code has been verified by a human. Use this annotation to mark code that
 * has been thoroughly reviewed and tested by a human developer after being generated or modified by AI.
 * This annotation is for documentation purposes only and has no runtime effect.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface HumanVerified {

    /**
     * The name or identifier of the human who verified this code.
     */
    String verifier() default "";

    /**
     * The date when the code was verified (ISO 8601 format recommended).
     * Example: "2025-12-11"
     */
    String date() default "";

    /**
     * A brief description of the verification process or findings.
     */
    String verification() default "";
}

