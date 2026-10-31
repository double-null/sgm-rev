package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaj extends zzae {
    private final zzam zza;

    zzaj(zzam zzamVar, int i10) {
        super(zzamVar.size(), i10);
        this.zza = zzamVar;
    }

    @Override // com.google.android.gms.internal.common.zzae
    final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
