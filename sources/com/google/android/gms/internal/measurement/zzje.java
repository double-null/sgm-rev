package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzje extends zzadu implements zzafd {
    private static final zzje zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private int zze;
    private zzaef zzf = zzadu.zzcy();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        zzje zzjeVar = new zzje();
        zzk = zzjeVar;
        zzadu.zzcs(zzje.class, zzjeVar);
    }

    private zzje() {
    }

    public final List zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzg;
    }

    public final boolean zzc() {
        return (this.zzb & 4) != 0;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", zzjc.zza, "zzf", zzje.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzje();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzjb(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzl;
        if (zzadqVar == null) {
            synchronized (zzje.class) {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    public final boolean zzh() {
        return (this.zzb & 16) != 0;
    }

    public final double zzi() {
        return this.zzj;
    }

    public final int zzk() {
        int iZza = zzjd.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
