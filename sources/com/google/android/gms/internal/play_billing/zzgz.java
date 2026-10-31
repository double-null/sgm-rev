package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgz extends zzgg implements zzhn {
    private static final zzgz zzb;
    private zzgl zzd = zzhu.zze();

    static {
        zzgz zzgzVar = new zzgz();
        zzb = zzgzVar;
        zzgg.zzB(zzgz.class, zzgzVar);
    }

    private zzgz() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzhv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzja.class});
        }
        if (i11 == 3) {
            return new zzgz();
        }
        zzgy zzgyVar = null;
        if (i11 == 4) {
            return new zzgx(zzgyVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
