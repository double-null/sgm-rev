package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzee extends zzgg implements zzhn {
    private static final zzee zzb;
    private zzgl zzd = zzgg.zzv();

    static {
        zzee zzeeVar = new zzee();
        zzb = zzeeVar;
        zzgg.zzB(zzee.class, zzeeVar);
    }

    private zzee() {
    }

    public static zzed zza() {
        return (zzed) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzee zzeeVar, Iterable iterable) {
        zzgl zzglVar = zzeeVar.zzd;
        if (!zzglVar.zzc()) {
            int size = zzglVar.size();
            zzeeVar.zzd = zzglVar.zzd(size + size);
        }
        zzer.zzk(iterable, zzeeVar.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzec.class});
        }
        if (i11 == 3) {
            return new zzee();
        }
        zzef zzefVar = null;
        if (i11 == 4) {
            return new zzed(zzefVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
