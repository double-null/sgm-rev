package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfd extends zzadu implements zzafd {
    private static final zzfd zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private zzaef zzf = zzadu.zzcy();
    private zzaef zzg = zzadu.zzcy();
    private boolean zzh;
    private boolean zzi;

    static {
        zzfd zzfdVar = new zzfd();
        zzj = zzfdVar;
        zzadu.zzcs(zzfd.class, zzfdVar);
    }

    private zzfd() {
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzf.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfn zze(int i10) {
        return (zzfn) this.zzf.get(i10);
    }

    public final List zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzfn.class, "zzg", zzff.class, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzfd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfc(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzk;
        if (zzadqVar == null) {
            synchronized (zzfd.class) {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    public final int zzh() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzff zzi(int i10) {
        return (zzff) this.zzg.get(i10);
    }

    final /* synthetic */ void zzj(int i10, zzfn zzfnVar) {
        zzfnVar.getClass();
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = zzadu.zzcz(zzaefVar);
        }
        this.zzf.set(i10, zzfnVar);
    }

    final /* synthetic */ void zzk(int i10, zzff zzffVar) {
        zzffVar.getClass();
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = zzadu.zzcz(zzaefVar);
        }
        this.zzg.set(i10, zzffVar);
    }
}
