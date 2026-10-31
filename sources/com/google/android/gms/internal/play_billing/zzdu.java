package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdu extends zzgg implements zzhn {
    private static final zzdu zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzdu zzduVar = new zzdu();
        zzb = zzduVar;
        zzgg.zzB(zzdu.class, zzduVar);
    }

    private zzdu() {
    }

    public static zzdu zzb(byte[] bArr) throws zzgs {
        return (zzdu) zzgg.zzt(zzb, bArr);
    }

    public final zzea zzc() {
        return this.zzd == 2 ? (zzea) this.zze : zzea.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzea.class});
        }
        if (i11 == 3) {
            return new zzdu();
        }
        zzdt zzdtVar = null;
        if (i11 == 4) {
            return new zzds(zzdtVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
