package com.google.android.gms.internal.common;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzak extends zzam {
    private final transient zzam zza;

    zzak(zzam zzamVar) {
        this.zza = zzamVar;
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzam zzamVar = this.zza;
        zzs.zzb(i10, zzamVar.size(), "index");
        return zzamVar.get((zzamVar.size() - 1) - i10);
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.List
    public final int indexOf(Object obj) {
        zzam zzamVar = this.zza;
        int iLastIndexOf = zzamVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzamVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.List
    public final int lastIndexOf(Object obj) {
        zzam zzamVar = this.zza;
        int iIndexOf = zzamVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzamVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.common.zzah
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzam
    public final zzam zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzam
    /* JADX INFO: renamed from: zzi */
    public final zzam subList(int i10, int i11) {
        zzam zzamVar = this.zza;
        zzs.zzd(i10, i11, zzamVar.size());
        return zzamVar.subList(zzamVar.size() - i11, zzamVar.size() - i10).zzh();
    }
}
