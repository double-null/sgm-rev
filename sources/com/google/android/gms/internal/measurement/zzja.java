package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzja extends zzadu implements zzafd {
    private static final zzja zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzadu.zzcy();
    private zziw zzf;

    static {
        zzja zzjaVar = new zzja();
        zzg = zzjaVar;
        zzadu.zzcs(zzja.class, zzjaVar);
    }

    private zzja() {
    }

    public final List zza() {
        return this.zze;
    }

    public final zziw zzb() {
        zziw zziwVar = this.zzf;
        return zziwVar == null ? zziw.zzc() : zziwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", zzje.class, "zzf"});
        }
        if (i11 == 3) {
            return new zzja();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zziz(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzh;
        if (zzadqVar == null) {
            synchronized (zzja.class) {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
