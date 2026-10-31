package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzey extends zzez {
    final /* synthetic */ zzfg zza;
    private int zzb;
    private final int zzc;

    zzey(zzfg zzfgVar) {
        Objects.requireNonNull(zzfgVar);
        this.zza = zzfgVar;
        this.zzb = 0;
        this.zzc = zzfgVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zza(i10);
    }
}
