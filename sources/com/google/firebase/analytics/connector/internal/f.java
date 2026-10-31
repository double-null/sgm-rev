package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v2.a.b f11912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppMeasurementSdk f11913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f11914c;

    public f(AppMeasurementSdk appMeasurementSdk, v2.a.b bVar) {
        this.f11912a = bVar;
        this.f11913b = appMeasurementSdk;
        e eVar = new e(this);
        this.f11914c = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(eVar);
    }

    final /* synthetic */ v2.a.b a() {
        return this.f11912a;
    }
}
