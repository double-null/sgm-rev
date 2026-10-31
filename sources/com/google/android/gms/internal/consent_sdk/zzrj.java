package com.google.android.gms.internal.consent_sdk;

import b2.Bo.yeILL;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrj {
    private final zzri zza;

    private zzrj(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        this.zza = new zzri(zzszVar, "", zzszVar2, obj2);
    }

    static int zzb(zzri zzriVar, Object obj, Object obj2) {
        return zzqf.zza(zzriVar.zza, 1, obj) + zzqf.zza(zzriVar.zzb, 2, obj2);
    }

    public final int zza(int i10, Object obj, Object obj2) {
        zzri zzriVar = this.zza;
        int iZzC = zzpv.zzC(i10 << 3);
        int iZzb = zzb(zzriVar, obj, obj2);
        return iZzC + zzpv.zzC(iZzb) + iZzb;
    }

    final zzri zzc() {
        return this.zza;
    }

    public static zzrj zzd(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        return new zzrj(zzszVar, yeILL.vTBleirys, zzszVar2, obj2);
    }
}
