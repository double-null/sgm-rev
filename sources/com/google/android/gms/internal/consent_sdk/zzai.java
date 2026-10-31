package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzai {
    private Application zza;

    private zzai() {
        throw null;
    }

    /* synthetic */ zzai(zzal zzalVar) {
    }

    public final zza zza() {
        zztj.zzb(this.zza, Application.class);
        return new zzah(this.zza);
    }

    public final zzai zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}
