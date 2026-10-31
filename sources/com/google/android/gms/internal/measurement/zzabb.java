package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzabb extends AbstractSet {
    final int zza;
    final /* synthetic */ zzabc zzb;

    zzabb(zzabc zzabcVar, int i10) {
        Objects.requireNonNull(zzabcVar);
        this.zzb = zzabcVar;
        this.zza = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb(), zzb(), zzc(), obj, this.zza == -1 ? zzabc.zza : zzabe.zzb) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzaba(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzc() - zzb();
    }

    final Object zza(int i10) {
        return this.zzb.zzb()[zzb() + i10];
    }

    final int zzb() {
        int i10 = this.zza;
        if (i10 == -1) {
            return 0;
        }
        return this.zzb.zzc()[i10];
    }

    final int zzc() {
        return this.zzb.zzc()[this.zza + 1];
    }
}
