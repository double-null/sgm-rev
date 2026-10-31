package com.facebook.bolts;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ExecutorException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecutorException(Exception e10) {
        super("An exception was thrown by an Executor", e10);
        t.f(e10, "e");
    }
}
