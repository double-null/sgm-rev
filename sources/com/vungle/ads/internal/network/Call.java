package com.vungle.ads.internal.network;

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Call<T> {
    void cancel();

    void enqueue(Callback<T> callback);

    Response<T> execute();

    boolean isCanceled();
}
