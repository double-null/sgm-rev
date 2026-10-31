package com.google.android.gms.internal.measurement;

import rd.PSo.cNMUz;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgp extends zzadu implements zzafd {
    private static final zzgp zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        zzgp zzgpVar = new zzgp();
        zzj = zzgpVar;
        zzadu.zzcs(zzgp.class, zzgpVar);
    }

    private zzgp() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", cNMUz.bwtPgcN, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzgp();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgo(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzk;
        if (zzadqVar == null) {
            synchronized (zzgp.class) {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
