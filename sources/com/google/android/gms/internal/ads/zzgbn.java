package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgbn extends kotlin.coroutines.jvm.internal.l implements id.p {
    zzgbn(zc.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zc.f create(Object obj, zc.f fVar) {
        return new zzgbn(fVar);
    }

    @Override // id.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbn) create((zzgax) obj, (zc.f) obj2)).invokeSuspend(wc.g0.f27756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ad.d.f();
        wc.s.b(obj);
        zzgax zzgaxVarZzd = zzgax.zzd();
        kotlin.jvm.internal.t.e(zzgaxVarZzd, "getDefaultInstance(...)");
        return zzgaxVarZzd;
    }
}
