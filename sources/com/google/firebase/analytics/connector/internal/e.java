package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import be.LNO.fzLzfW;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
final class e implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f11911a;

    public e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f11911a = fVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong(fzLzfW.AtewQXhIZwPnTSS, j10);
        bundle2.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, bundle);
        this.f11911a.a().a(3, bundle2);
    }
}
