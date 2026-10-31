package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlf extends zzgg implements zzhn {
    private static final zzlf zzb;
    private int zzd;
    private int zze;

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzgg.zzB(zzlf.class, zzlfVar);
    }

    private zzlf() {
    }

    public static zzlf zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzld.zza});
        }
        if (i11 == 3) {
            return new zzlf();
        }
        zzle zzleVar = null;
        if (i11 == 4) {
            return new zzlc(zzleVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
