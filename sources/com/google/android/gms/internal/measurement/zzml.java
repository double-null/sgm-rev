package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.j;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzml implements j {
    static final /* synthetic */ zzml zza = new zzml();

    private /* synthetic */ zzml() {
    }

    @Override // com.google.common.util.concurrent.j
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        ApiException apiException = (ApiException) obj;
        throw new zzmk(apiException.getStatusCode(), apiException.getMessage(), apiException);
    }
}
