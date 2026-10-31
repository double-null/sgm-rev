package com.facebook.internal.qualityvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Excuse.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({})
@Retention(RetentionPolicy.SOURCE)
public @interface Excuse {
    String reason();

    String type();
}
