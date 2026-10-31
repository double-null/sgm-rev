package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhy extends zzadu implements zzafd {
    private static final zzhy zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private zzhc zzg;

    static {
        zzhy zzhyVar = new zzhy();
        zzh = zzhyVar;
        zzadu.zzcs(zzhy.class, zzhyVar);
    }

    private zzhy() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzhy();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhx(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzadqVar = zzi;
        if (zzadqVar == null) {
            synchronized (zzhy.class) {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            }
        }
        return zzadqVar;
    }
}
