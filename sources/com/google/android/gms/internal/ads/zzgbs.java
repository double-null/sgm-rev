package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgbs extends kotlin.coroutines.jvm.internal.l implements id.p {
    int zza;
    final /* synthetic */ zzgce zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbs(zzgce zzgceVar, String str, zc.f fVar) {
        super(2, fVar);
        this.zzb = zzgceVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zc.f create(Object obj, zc.f fVar) {
        return new zzgbs(this.zzb, this.zzc, fVar);
    }

    @Override // id.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbs) create((ud.o0) obj, (zc.f) obj2)).invokeSuspend(wc.g0.f27756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = ad.d.f();
        int i10 = this.zza;
        wc.s.b(obj);
        if (i10 == 0) {
            zzgce zzgceVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzgceVar.zzt(str, this) == objF) {
                return objF;
            }
        }
        return wc.g0.f27756a;
    }
}
