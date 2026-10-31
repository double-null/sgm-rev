package com.google.android.gms.internal.measurement;

import b2.Bo.yeILL;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfb extends zzadu implements zzafd {
    private static final zzfb zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        zzfb zzfbVar = new zzfb();
        zzi = zzfbVar;
        zzadu.zzcs(zzfb.class, zzfbVar);
    }

    private zzfb() {
    }

    public static zzfa zza() {
        return (zzfa) zzi.zzcn();
    }

    final /* synthetic */ void zzb(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zzc(boolean z10) {
        this.zzb |= 2;
        this.zzf = true;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    final /* synthetic */ void zze(long j10) {
        this.zzb |= 8;
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{yeILL.HMHtnfrc, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzfb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfa(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzj;
        if (zzadqVar == null) {
            synchronized (zzfb.class) {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
