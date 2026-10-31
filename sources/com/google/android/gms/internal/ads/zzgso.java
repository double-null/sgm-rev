package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgso extends kotlin.coroutines.jvm.internal.l implements id.p {
    Object zza;
    int zzb;
    final /* synthetic */ zzgsm zzc;
    final /* synthetic */ id.p zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgso(zzgsm zzgsmVar, id.p pVar, zc.f fVar) {
        super(2, fVar);
        this.zzc = zzgsmVar;
        this.zzd = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zc.f create(Object obj, zc.f fVar) {
        zzgso zzgsoVar = new zzgso(this.zzc, this.zzd, fVar);
        zzgsoVar.zze = obj;
        return zzgsoVar;
    }

    @Override // id.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgso) create((ud.o0) obj, (zc.f) obj2)).invokeSuspend(wc.g0.f27756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        id.p pVar;
        de.a aVarZza;
        de.a aVar;
        Throwable th;
        Object objF = ad.d.f();
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                wc.s.b(obj);
                ud.p0.e((ud.o0) this.zze);
                zzgsm zzgsmVar = this.zzc;
                pVar = this.zzd;
                aVarZza = zzgsmVar.zza();
                this.zze = aVarZza;
                this.zza = pVar;
                this.zzb = 1;
                if (zzgsp.zze(aVarZza, this) != objF) {
                }
                return objF;
            }
            if (i10 != 1) {
                aVar = (de.a) this.zze;
                try {
                    wc.s.b(obj);
                    de.a.C0181a.b(aVar, null, 1, null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    de.a.C0181a.b(aVar, null, 1, null);
                    throw th;
                }
            }
            pVar = (id.p) this.zza;
            de.a aVar2 = (de.a) this.zze;
            wc.s.b(obj);
            aVarZza = aVar2;
            this.zze = aVarZza;
            this.zza = null;
            this.zzb = 2;
            Object objD = ud.p0.d(pVar, this);
            if (objD != objF) {
                aVar = aVarZza;
                obj = objD;
                de.a.C0181a.b(aVar, null, 1, null);
                return obj;
            }
            return objF;
        } catch (Throwable th3) {
            aVar = aVarZza;
            th = th3;
            de.a.C0181a.b(aVar, null, 1, null);
            throw th;
        }
    }
}
