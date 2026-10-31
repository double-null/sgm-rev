package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahi implements zzagb {
    private final long zzb;
    private final zzagb zzc;

    public zzahi(long j10, zzagb zzagbVar) {
        this.zzb = j10;
        this.zzc = zzagbVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final zzahk zzu(int i10, int i11) {
        return this.zzc.zzu(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzw(zzahb zzahbVar) {
        this.zzc.zzw(new zzahh(this, zzahbVar, zzahbVar));
    }
}
