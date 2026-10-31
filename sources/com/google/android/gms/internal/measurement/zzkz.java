package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkz extends b {
    Object zza;

    zzkz(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        this.zza = null;
    }

    @Override // com.google.common.util.concurrent.b
    public final String pendingToString() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.common.util.concurrent.b
    public final boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // com.google.common.util.concurrent.b
    public final boolean setException(Throwable th) {
        return super.setException(th);
    }
}
