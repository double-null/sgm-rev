package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzigl implements Iterator {
    final /* synthetic */ zzign zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzigl(zzign zzignVar, byte[] bArr) {
        Objects.requireNonNull(zzignVar);
        this.zza = zzignVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzign zzignVar = this.zza;
        if (i10 >= zzignVar.zzj()) {
            return !zzignVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzign zzignVar = this.zza;
        return i10 < zzignVar.zzj() ? (zzigk) zzignVar.zzi()[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzign zzignVar = this.zza;
        zzignVar.zzh();
        int i10 = this.zzb;
        if (i10 >= zzignVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzignVar.zzg(i10);
        }
    }
}
