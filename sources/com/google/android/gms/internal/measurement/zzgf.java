package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgf extends zzadu implements zzafd {
    private static final zzgf zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private boolean zzh;
    private zzaef zze = zzadu.zzcy();
    private zzaef zzf = zzadu.zzcy();
    private zzaef zzg = zzadu.zzcy();
    private zzaef zzi = zzadu.zzcy();

    static {
        zzgf zzgfVar = new zzgf();
        zzj = zzgfVar;
        zzadu.zzcs(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzgf zzh() {
        return zzj;
    }

    public final List zza() {
        return this.zze;
    }

    public final List zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", zzfu.class, "zzf", zzfw.class, "zzg", zzgc.class, "zzh", "zzi", zzfu.class});
        }
        if (i11 == 3) {
            return new zzgf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfs(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzk;
        if (zzadqVar == null) {
            synchronized (zzgf.class) {
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
