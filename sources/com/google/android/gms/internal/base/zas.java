package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public class zas extends Handler {
    private final Looper zaa;

    public zas() {
        this.zaa = Looper.getMainLooper();
    }

    public zas(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public zas(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}
