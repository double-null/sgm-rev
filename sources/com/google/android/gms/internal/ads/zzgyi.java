package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgyi extends zzgwm {
    final /* synthetic */ zzgyj zza;

    zzgyi(zzgyj zzgyjVar) {
        Objects.requireNonNull(zzgyjVar);
        this.zza = zzgyjVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzgyj zzgyjVar = this.zza;
        zzgtj.zzm(i10, zzgyjVar.zzx(), "index");
        int i11 = i10 + i10;
        Object obj = zzgyjVar.zzw()[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzgyjVar.zzw()[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    public final boolean zzf() {
        return true;
    }
}
