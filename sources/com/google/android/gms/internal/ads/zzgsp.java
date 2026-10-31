package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgsp {
    public static final ud.v0 zza(ud.o0 o0Var, zzgsm coroutineSequence, id.p block) {
        kotlin.jvm.internal.t.f(o0Var, "<this>");
        kotlin.jvm.internal.t.f(coroutineSequence, "coroutineSequence");
        kotlin.jvm.internal.t.f(block, "block");
        return ud.k.b(o0Var, null, ud.q0.UNDISPATCHED, new zzgso(coroutineSequence, block, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zzd(de.a aVar, zc.f fVar) {
        Object objD = aVar.d(null, fVar);
        return objD == ad.d.f() ? objD : wc.g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zze(de.a aVar, zc.f fVar) {
        zzgsn zzgsnVar = zzgsn.zza;
        if ((!(zzgsnVar instanceof kotlin.coroutines.jvm.internal.a) ? ad.c.d(zzgsnVar, aVar, fVar) : ((id.p) kotlin.jvm.internal.m0.d(zzgsnVar, 2)).invoke(aVar, fVar)) != ad.d.f()) {
            ad.c.c(fVar).resumeWith(wc.r.c(wc.g0.f27756a));
        }
        Object objF = ad.d.f();
        if (objF == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF == ad.d.f() ? objF : wc.g0.f27756a;
    }
}
