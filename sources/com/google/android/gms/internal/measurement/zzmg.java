package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmg extends zzadu implements zzafd {
    private static final zzmg zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private String zze = "";
    private zzacr zzf = zzacr.zza;
    private String zzg = "";
    private zzaef zzh = zzadu.zzcy();
    private zzaef zzi = zzadu.zzcy();
    private boolean zzj;
    private long zzk;

    static {
        zzmg zzmgVar = new zzmg();
        zzl = zzmgVar;
        zzadu.zzcs(zzmg.class, zzmgVar);
    }

    private zzmg() {
    }

    public static zzmf zzh() {
        return (zzmf) zzl.zzcn();
    }

    public final String zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final zzacr zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List zze() {
        return this.zzh;
    }

    public final long zzf() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", zzmi.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzmg();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzmf(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzm;
        if (zzadqVar == null) {
            synchronized (zzmg.class) {
                zzadqVar = zzm;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzl);
                    zzm = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zzj(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    final /* synthetic */ void zzl(zzmi zzmiVar) {
        zzmiVar.getClass();
        zzaef zzaefVar = this.zzh;
        if (!zzaefVar.zza()) {
            this.zzh = zzadu.zzcz(zzaefVar);
        }
        this.zzh.add(zzmiVar);
    }

    final /* synthetic */ void zzm(String str) {
        str.getClass();
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = zzadu.zzcz(zzaefVar);
        }
        this.zzi.add(str);
    }

    final /* synthetic */ void zzn(boolean z10) {
        this.zzb |= 8;
        this.zzj = z10;
    }

    final /* synthetic */ void zzo(long j10) {
        this.zzb |= 16;
        this.zzk = j10;
    }
}
