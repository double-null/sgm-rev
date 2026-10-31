package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeh extends zzgg implements zzhn {
    private static final zzeh zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzeh zzehVar = new zzeh();
        zzb = zzehVar;
        zzgg.zzB(zzeh.class, zzehVar);
    }

    private zzeh() {
    }

    public static zzeh zzc(byte[] bArr) throws zzgs {
        return (zzeh) zzgg.zzt(zzb, bArr);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzeh();
        }
        zzek zzekVar = null;
        if (i11 == 4) {
            return new zzeg(zzekVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String zze() {
        return this.zzf;
    }
}
