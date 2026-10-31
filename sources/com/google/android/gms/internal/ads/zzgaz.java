package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgaz {
    private final zzgav zza;

    public final /* synthetic */ zzgax zza() {
        zziee zzieeVarZzbu = this.zza.zzbu();
        kotlin.jvm.internal.t.e(zzieeVarZzbu, "build(...)");
        return (zzgax) zzieeVarZzbu;
    }

    public final /* synthetic */ zzihj zzb() {
        Map mapZzb = this.zza.zzb();
        kotlin.jvm.internal.t.e(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzihj(mapZzb);
    }

    public final void zzc(zzihj zzihjVar, String key, zzgat value) {
        kotlin.jvm.internal.t.f(zzihjVar, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzihj zzihjVar, String key) {
        kotlin.jvm.internal.t.f(zzihjVar, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        this.zza.zza(key);
    }
}
