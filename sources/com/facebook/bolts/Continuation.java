package com.facebook.bolts;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes.dex */
public interface Continuation<TTaskResult, TContinuationResult> {
    TContinuationResult then(Task<TTaskResult> task) throws Exception;
}
