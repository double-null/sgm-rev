package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzho extends zzadu implements zzafd {
    private static final zzho zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzadu.zzcy();

    static {
        zzho zzhoVar = new zzho();
        zze = zzhoVar;
        zzadu.zzcs(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static zzhh zzb() {
        return (zzhh) zze.zzcn();
    }

    public static zzho zzc() {
        return zze;
    }

    public final List zza() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(Iterable iterable) {
        zzaef zzaefVar = this.zzb;
        if (!zzaefVar.zza()) {
            this.zzb = zzadu.zzcz(zzaefVar);
        }
        zzacb.zzcg(iterable, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
        }
        if (i11 == 3) {
            return new zzho();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhh(bArr);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzf;
        if (zzadqVar == null) {
            synchronized (zzho.class) {
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
