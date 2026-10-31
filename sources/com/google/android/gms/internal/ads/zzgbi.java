package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgbi {
    public static final zzgbg zza(final ExecutorService executorService) {
        kotlin.jvm.internal.t.f(executorService, "executorService");
        return new zzgbg() { // from class: com.google.android.gms.internal.ads.zzgbh
            @Override // com.google.android.gms.internal.ads.zzgbg
            public final /* synthetic */ ud.o0 zza() {
                return ud.p0.a(ud.t1.b(executorService));
            }
        };
    }
}
