package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: AnalyticsDeferredProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deferred<v2.a> f12026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile AnalyticsEventLogger f12027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile BreadcrumbSource f12028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b3.a> f12029d;

    public d(Deferred<v2.a> deferred) {
        this(deferred, new b3.b(), new a3.e());
    }

    private void f() {
        this.f12026a.a(new Deferred.a() { // from class: com.google.firebase.crashlytics.c
            @Override // com.google.firebase.inject.Deferred.a
            public final void a(Provider provider) {
                this.f12025a.i(provider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f12027b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(b3.a aVar) {
        synchronized (this) {
            if (this.f12028c instanceof b3.b) {
                this.f12029d.add(aVar);
            }
            this.f12028c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Provider provider) {
        z2.f.f().b("AnalyticsConnector now available.");
        v2.a aVar = (v2.a) provider.get();
        a3.d dVar = new a3.d(aVar);
        e eVar = new e();
        if (j(aVar, eVar) == null) {
            z2.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        z2.f.f().b("Registered Firebase Analytics listener.");
        a3.c cVar = new a3.c();
        a3.b bVar = new a3.b(dVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<b3.a> it = this.f12029d.iterator();
            while (it.hasNext()) {
                cVar.a(it.next());
            }
            eVar.d(cVar);
            eVar.e(bVar);
            this.f12028c = cVar;
            this.f12027b = bVar;
        }
    }

    private static v2.a.InterfaceC0448a j(v2.a aVar, e eVar) {
        v2.a.InterfaceC0448a interfaceC0448aA = aVar.a("clx", eVar);
        if (interfaceC0448aA == null) {
            z2.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0448aA = aVar.a(AppMeasurement.CRASH_ORIGIN, eVar);
            if (interfaceC0448aA != null) {
                z2.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0448aA;
    }

    public AnalyticsEventLogger d() {
        return new AnalyticsEventLogger() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void a(String str, Bundle bundle) {
                this.f12024a.g(str, bundle);
            }
        };
    }

    public BreadcrumbSource e() {
        return new BreadcrumbSource() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void a(b3.a aVar) {
                this.f12023a.h(aVar);
            }
        };
    }

    public d(Deferred<v2.a> deferred, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
        this.f12026a = deferred;
        this.f12028c = breadcrumbSource;
        this.f12029d = new ArrayList();
        this.f12027b = analyticsEventLogger;
        f();
    }
}
