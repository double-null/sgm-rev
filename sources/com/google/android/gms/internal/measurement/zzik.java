package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzik extends zzadu implements zzafd {
    private static final zzik zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private zzaee zzf = zzadu.zzcw();

    static {
        zzik zzikVar = new zzik();
        zzg = zzikVar;
        zzadu.zzcs(zzik.class, zzikVar);
    }

    private zzik() {
    }

    public static zzij zzf() {
        return (zzij) zzg.zzcn();
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

    public final long zze(int i10) {
        return this.zzf.zzc(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzik();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzij(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzh;
        if (zzadqVar == null) {
            synchronized (zzik.class) {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }

    final /* synthetic */ void zzh(int i10) {
        this.zzb |= 1;
        this.zze = i10;
    }

    final /* synthetic */ void zzi(Iterable iterable) {
        zzaee zzaeeVar = this.zzf;
        if (!zzaeeVar.zza()) {
            this.zzf = zzadu.zzcx(zzaeeVar);
        }
        zzacb.zzcg(iterable, this.zzf);
    }
}
