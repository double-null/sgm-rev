package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    protected T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t10) {
        this.zza = t10;
    }

    protected Response(T t10) {
        this.zza = t10;
    }
}
