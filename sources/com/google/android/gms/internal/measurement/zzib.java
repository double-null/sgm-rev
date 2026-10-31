package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzib extends zzadu implements zzafd {
    private static final zzib zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzaef zze = zzadu.zzcy();
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzi = zzibVar;
        zzadu.zzcs(zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static zzhz zzi() {
        return (zzhz) zzi.zzcn();
    }

    public static zzhz zzj(zzib zzibVar) {
        zzadp zzadpVarZzcn = zzi.zzcn();
        zzadpVarZzcn.zzbe(zzibVar);
        return (zzhz) zzadpVarZzcn;
    }

    private final void zzr() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = zzadu.zzcz(zzaefVar);
    }

    public final List zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzid zzc(int i10) {
        return (zzid) this.zze.get(i10);
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", zzid.class, "zzf", "zzg", "zzh", zzia.zza});
        }
        if (i11 == 3) {
            return new zzib();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhz(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzj;
        if (zzadqVar == null) {
            synchronized (zzib.class) {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    public final String zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzk(int i10, zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zze.set(i10, zzidVar);
    }

    final /* synthetic */ void zzl(zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zze.add(zzidVar);
    }

    final /* synthetic */ void zzm(Iterable iterable) {
        zzr();
        zzacb.zzcg(iterable, this.zze);
    }

    final /* synthetic */ void zzn() {
        this.zze = zzadu.zzcy();
    }

    final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }
}
