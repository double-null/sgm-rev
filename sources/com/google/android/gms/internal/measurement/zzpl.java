package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpl extends zzadu implements zzafd {
    private static final zzpl zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzadu.zzcy();

    static {
        zzpl zzplVar = new zzpl();
        zze = zzplVar;
        zzadu.zzcs(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    public static zzpl zzb(byte[] bArr, zzadf zzadfVar) throws zzaeh {
        return (zzpl) zzadu.zzcA(zze, bArr, zzadfVar);
    }

    public final List zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new zzpl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzpk(bArr);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzf;
        if (zzadqVar == null) {
            synchronized (zzpl.class) {
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
