package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgbr extends kotlin.coroutines.jvm.internal.l implements id.p {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgat zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbr(zzgat zzgatVar, zc.f fVar) {
        super(2, fVar);
        this.zzb = zzgatVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zc.f create(Object obj, zc.f fVar) {
        zzgbr zzgbrVar = new zzgbr(this.zzb, fVar);
        zzgbrVar.zza = obj;
        return zzgbrVar;
    }

    @Override // id.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbr) create((zzgax) obj, (zc.f) obj2)).invokeSuspend(wc.g0.f27756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ad.d.f();
        wc.s.b(obj);
        zzgaz zzgazVarZza = zzgay.zza((zzgav) ((zzgax) this.zza).zzcc());
        zzihj zzihjVarZzb = zzgazVarZza.zzb();
        zzgat zzgatVar = this.zzb;
        String strZza = zzgatVar.zza();
        kotlin.jvm.internal.t.e(strZza, "getGwsQueryId(...)");
        zzgazVarZza.zzc(zzihjVarZzb, strZza, zzgatVar);
        return zzgazVarZza.zza();
    }
}
