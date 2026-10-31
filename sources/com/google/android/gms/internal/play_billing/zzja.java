package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzja extends zzgg implements zzhn {
    private static final zzja zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzja zzjaVar = new zzja();
        zzb = zzjaVar;
        zzgg.zzB(zzja.class, zzjaVar);
    }

    private zzja() {
    }

    public static zziy zza() {
        return (zziy) zzb.zzp();
    }

    public static zzja zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzja zzjaVar, String str) {
        str.getClass();
        zzjaVar.zzd = 3;
        zzjaVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzhv(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", zzih.class, zzgz.class});
        }
        if (i11 == 3) {
            return new zzja();
        }
        zziz zzizVar = null;
        if (i11 == 4) {
            return new zziy(zzizVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
