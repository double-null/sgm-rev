package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f11907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v2.a.b f11908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppMeasurementSdk f11909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f11910d;

    public d(AppMeasurementSdk appMeasurementSdk, v2.a.b bVar) {
        this.f11908b = bVar;
        this.f11909c = appMeasurementSdk;
        c cVar = new c(this);
        this.f11910d = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(cVar);
        this.f11907a = new HashSet();
    }

    final /* synthetic */ v2.a.b a() {
        return this.f11908b;
    }
}
