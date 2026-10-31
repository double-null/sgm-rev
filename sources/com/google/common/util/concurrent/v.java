package com.google.common.util.concurrent;

/* JADX INFO: compiled from: FutureCallback.java */
/* JADX INFO: loaded from: classes4.dex */
public interface v<V> {
    void onFailure(Throwable th);

    void onSuccess(V v10);
}
