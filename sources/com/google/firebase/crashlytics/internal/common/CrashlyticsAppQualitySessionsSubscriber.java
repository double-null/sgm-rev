package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements c4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataCollectionArbiter f12042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f12043b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f12042a = dataCollectionArbiter;
        this.f12043b = new k(fileStore);
    }

    @Override // c4.d
    public boolean a() {
        return this.f12042a.isAutomaticDataCollectionEnabled();
    }

    @Override // c4.d
    public c4.d.a b() {
        return c4.d.a.CRASHLYTICS;
    }

    @Override // c4.d
    public void c(c4.d.b bVar) {
        z2.f.f().b("App Quality Sessions session changed: " + bVar);
        this.f12043b.h(bVar.a());
    }

    public String d(String str) {
        return this.f12043b.c(str);
    }

    public void e(String str) {
        this.f12043b.i(str);
    }
}
