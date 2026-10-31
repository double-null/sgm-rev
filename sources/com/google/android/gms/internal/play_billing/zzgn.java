package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgn implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzgq zzgqVar = (zzgq) this.zza.getValue();
        if (zzgqVar == null) {
            return null;
        }
        return zzgqVar.zzf();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzhm)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.zza;
        zzhm zzhmVar = ((zzgq) entry.getValue()).zza;
        entry.setValue(new zzgq((zzhm) obj));
        return zzhmVar;
    }

    public final zzgq zza() {
        return (zzgq) this.zza.getValue();
    }
}
