package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznu extends zzadu implements zzafd {
    private static final zznu zze;
    private static volatile zzafj zzf;
    private zzaew zzb = zzaew.zza();

    static {
        zznu zznuVar = new zznu();
        zze = zznuVar;
        zzadu.zzcs(zznu.class, zznuVar);
    }

    private zznu() {
    }

    public static zznu zzb() {
        return zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zznr zza(String str, zznr zznrVar) {
        str.getClass();
        zznr zznrVar2 = (zznr) this.zzb.get(str);
        return zznrVar2 != null ? zznrVar2 : zznrVar;
    }

    final /* synthetic */ Map zzc() {
        if (!this.zzb.zze()) {
            this.zzb = this.zzb.zzc();
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", zzns.zza});
        }
        if (i11 == 3) {
            return new zznu();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zznt(bArr);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzf;
        if (zzadqVar == null) {
            synchronized (zznu.class) {
                zzadqVar = zzf;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zze);
                    zzf = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
