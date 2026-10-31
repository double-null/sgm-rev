package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjs extends zzgg implements zzhn {
    private static final zzjs zzb;

    static {
        zzjs zzjsVar = new zzjs();
        zzb = zzjsVar;
        zzgg.zzB(zzjs.class, zzjsVar);
    }

    private zzjs() {
    }

    public static zzjs zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzjr zzjrVar = null;
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzjs();
        }
        if (i11 == 4) {
            return new zzjq(zzjrVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
