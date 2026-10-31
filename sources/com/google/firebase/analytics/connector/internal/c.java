package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
final class c implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f11906a;

    public c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f11906a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        d dVar = this.f11906a;
        if (dVar.f11907a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i10 = b.f11905g;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            dVar.a().a(2, bundle2);
        }
    }
}
