package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzby extends zzbs {
    private final zzca zza;

    zzby(zzca zzcaVar, int i10) {
        super(zzcaVar.size(), i10);
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbs
    final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
