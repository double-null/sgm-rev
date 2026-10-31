package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgbl extends kotlin.coroutines.jvm.internal.d {
    long zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgce zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbl(zzgce zzgceVar, zc.f fVar) {
        super(fVar);
        this.zzd = zzgceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzB(0L, this);
    }
}
