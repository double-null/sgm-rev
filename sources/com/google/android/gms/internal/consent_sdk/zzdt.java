package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdt extends zzdq {
    private final zzdv zza;

    zzdt(zzdv zzdvVar, int i10) {
        super(zzdvVar.size(), i10);
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdq
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
