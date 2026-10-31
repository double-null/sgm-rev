package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdx extends zzgg implements zzhn {
    private static final zzdx zzb;
    private int zzd;
    private String zze = "";

    static {
        zzdx zzdxVar = new zzdx();
        zzb = zzdxVar;
        zzgg.zzB(zzdx.class, zzdxVar);
    }

    private zzdx() {
    }

    public static zzdx zzb(byte[] bArr) throws zzgs {
        return (zzdx) zzgg.zzt(zzb, bArr);
    }

    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzdx();
        }
        zzdw zzdwVar = null;
        if (i11 == 4) {
            return new zzdv(zzdwVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
