package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgby extends kotlin.coroutines.jvm.internal.l implements id.p {
    int zza;
    final /* synthetic */ zzgce zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgby(zzgce zzgceVar, zc.f fVar) {
        super(2, fVar);
        this.zzb = zzgceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zc.f create(Object obj, zc.f fVar) {
        return new zzgby(this.zzb, fVar);
    }

    @Override // id.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgby) create((ud.o0) obj, (zc.f) obj2)).invokeSuspend(wc.g0.f27756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = ad.d.f();
        int i10 = this.zza;
        wc.s.b(obj);
        if (i10 == 0) {
            zzgce zzgceVar = this.zzb;
            this.zza = 1;
            if (zzgceVar.zzs(this) == objF) {
                return objF;
            }
        }
        return wc.g0.f27756a;
    }
}
