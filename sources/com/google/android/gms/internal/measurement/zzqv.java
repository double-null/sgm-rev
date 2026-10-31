package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqv extends zzadu implements zzafd {
    private static final zzqv zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private zzacr zzf = zzacr.zza;
    private String zzg = "";
    private zzaef zzi = zzadu.zzcy();

    static {
        zzqv zzqvVar = new zzqv();
        zzj = zzqvVar;
        zzadu.zzcs(zzqv.class, zzqvVar);
    }

    private zzqv() {
    }

    public static zzqu zzh() {
        return (zzqu) zzj.zzcn();
    }

    public static zzqv zzi() {
        return zzj;
    }

    public final String zza() {
        return this.zze;
    }

    public final zzacr zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final List zze() {
        return this.zzi;
    }

    public final int zzf() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzqx.class});
        }
        if (i11 == 3) {
            return new zzqv();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzqu(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzk;
        if (zzadqVar == null) {
            synchronized (zzqv.class) {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    final /* synthetic */ void zzj(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zzk(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    final /* synthetic */ void zzm(long j10) {
        this.zzb |= 8;
        this.zzh = j10;
    }

    final /* synthetic */ void zzn(zzqx zzqxVar) {
        zzqxVar.getClass();
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = zzadu.zzcz(zzaefVar);
        }
        this.zzi.add(zzqxVar);
    }
}
