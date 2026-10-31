package com.google.android.gms.internal.measurement;

import com.vungle.ads.internal.network.converters.vY.vgmm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgv extends zzadu implements zzafd {
    private static final zzgv zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        zzgv zzgvVar = new zzgv();
        zzj = zzgvVar;
        zzadu.zzcs(zzgv.class, zzgvVar);
    }

    private zzgv() {
    }

    public static zzgv zze() {
        return zzj;
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{vgmm.ojWemkBhdu, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzgv();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgu(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzk;
        if (zzadqVar == null) {
            synchronized (zzgv.class) {
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
