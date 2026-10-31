package com.google.android.gms.internal.play_billing;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzec extends zzgg implements zzhn {
    private static final zzec zzb;
    private int zzd;
    private zzem zze;
    private zzem zzf;
    private int zzg;

    static {
        zzec zzecVar = new zzec();
        zzb = zzecVar;
        zzgg.zzB(zzec.class, zzecVar);
    }

    private zzec() {
    }

    public static zzeb zza() {
        return (zzeb) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzec zzecVar, zzem zzemVar) {
        zzemVar.getClass();
        zzecVar.zze = zzemVar;
        zzecVar.zzd |= 1;
    }

    static /* synthetic */ void zze(zzec zzecVar, zzem zzemVar) {
        zzemVar.getClass();
        zzecVar.zzf = zzemVar;
        zzecVar.zzd |= 2;
    }

    static /* synthetic */ void zzf(zzec zzecVar, int i10) {
        zzecVar.zzg = i10 - 1;
        zzecVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgg
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", sRGQSqxgxlS.FzqfetxWAu, zzep.zza()});
        }
        if (i11 == 3) {
            return new zzec();
        }
        zzef zzefVar = null;
        if (i11 == 4) {
            return new zzeb(zzefVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
