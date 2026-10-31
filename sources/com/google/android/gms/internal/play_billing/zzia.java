package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzia implements Iterator {
    final /* synthetic */ zzid zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzia(zzid zzidVar, zzic zzicVar) {
        Objects.requireNonNull(zzidVar);
        this.zza = zzidVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzid zzidVar = this.zza;
        if (i10 >= zzidVar.zzb) {
            return !zzidVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzid zzidVar = this.zza;
        return i10 < zzidVar.zzb ? (zzhz) zzidVar.zza[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzid zzidVar = this.zza;
        zzidVar.zzo();
        int i10 = this.zzb;
        if (i10 >= zzidVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzidVar.zzm(i10);
        }
    }
}
