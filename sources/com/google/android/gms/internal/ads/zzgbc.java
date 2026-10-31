package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgbc implements zzimu {
    private final zzind zza;

    private zzgbc(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzgbc zza(zzind zzindVar, zzind zzindVar2) {
        return new zzgbc(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcnq) this.zza).zza();
        zzgbg coroutineScopeProvider = zzcnu.zzc();
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(coroutineScopeProvider, "coroutineScopeProvider");
        e0.k kVarC = e0.l.c(e0.l.f13625a, zzgba.zza, null, null, coroutineScopeProvider.zza(), new id.a() { // from class: com.google.android.gms.internal.ads.zzgbb
            @Override // id.a
            public final /* synthetic */ Object invoke() {
                return d0.a.a(context, "ad_quality_data.pb");
            }
        }, 6, null);
        zzinc.zzb(kVarC);
        return kVarC;
    }
}
