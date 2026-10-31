package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgj extends zzadu implements zzafd {
    private static final zzgj zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzgj zzgjVar = new zzgj();
        zzi = zzgjVar;
        zzadu.zzcs(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    public final String zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgi(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzj;
        if (zzadqVar == null) {
            synchronized (zzgj.class) {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    public final int zzh() {
        return this.zzh;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
