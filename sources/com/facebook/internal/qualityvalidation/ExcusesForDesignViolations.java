package com.facebook.internal.qualityvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: ExcusesForDesignViolations.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface ExcusesForDesignViolations {
    Excuse[] value();
}
