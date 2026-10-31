package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziy extends zzadu implements zzafd {
    private static final zziy zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private zzaef zzf = zzadu.zzcy();

    static {
        zziy zziyVar = new zziy();
        zzg = zziyVar;
        zzadu.zzcs(zziy.class, zziyVar);
    }

    private zziy() {
    }

    public final String zza() {
        return this.zze;
    }

    public final List zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzje.class});
        }
        if (i11 == 3) {
            return new zziy();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzix(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzh;
        if (zzadqVar == null) {
            synchronized (zziy.class) {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
