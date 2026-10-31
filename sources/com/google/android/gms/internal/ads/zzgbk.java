package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgbk extends kotlin.coroutines.jvm.internal.l implements id.p {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbk(String str, zc.f fVar) {
        super(2, fVar);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zc.f create(Object obj, zc.f fVar) {
        zzgbk zzgbkVar = new zzgbk(this.zzb, fVar);
        zzgbkVar.zza = obj;
        return zzgbkVar;
    }

    @Override // id.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbk) create((zzgax) obj, (zc.f) obj2)).invokeSuspend(wc.g0.f27756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ad.d.f();
        wc.s.b(obj);
        zzgaz zzgazVarZza = zzgay.zza((zzgav) ((zzgax) this.zza).zzcc());
        zzgazVarZza.zzd(zzgazVarZza.zzb(), this.zzb);
        return zzgazVarZza.zza();
    }
}
