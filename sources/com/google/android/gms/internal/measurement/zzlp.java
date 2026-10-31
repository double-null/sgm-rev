package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.util.concurrent.g0;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzlp implements w {
    static final /* synthetic */ zzlp zza = new zzlp();

    private /* synthetic */ zzlp() {
    }

    @Override // com.google.common.base.w
    public final /* synthetic */ Object get() {
        int i10 = zzlk.zza;
        return g0.b(Executors.newSingleThreadScheduledExecutor(zzlo.zza));
    }
}
