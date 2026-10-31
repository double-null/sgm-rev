package com.vungle.ads.internal.network;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Callback<T> {
    void onFailure(Call<T> call, Throwable th);

    void onResponse(Call<T> call, Response<T> response);
}
