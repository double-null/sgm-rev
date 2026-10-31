package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzx implements Iterator {
    final /* synthetic */ zzzy zza;
    private final zzyl zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzzx(zzzy zzzyVar, zzyl zzylVar, int i10, byte[] bArr) {
        Objects.requireNonNull(zzzyVar);
        this.zza = zzzyVar;
        this.zzb = zzylVar;
        int i11 = i10 & 31;
        this.zzc = i11;
        this.zzd = i10 >>> (i11 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objZze = this.zzb.zze(this.zza.zze(this.zzc));
        int i10 = this.zzd;
        if (i10 != 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10) + 1;
            this.zzd >>>= iNumberOfTrailingZeros;
            this.zzc += iNumberOfTrailingZeros;
        } else {
            this.zzc = -1;
        }
        return objZze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
