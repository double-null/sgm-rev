package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import d3.o;
import z2.d;
import z2.f;
import z3.a;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteConfigDeferredProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deferred<a> f12033a;

    public RemoteConfigDeferredProxy(Deferred<a> deferred) {
        this.f12033a = deferred;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(d dVar, Provider provider) {
        ((a) provider.get()).a("firebase", dVar);
        f.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(o oVar) {
        if (oVar == null) {
            f.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final d dVar = new d(oVar);
            this.f12033a.a(new Deferred.a() { // from class: z2.i
                @Override // com.google.firebase.inject.Deferred.a
                public final void a(Provider provider) {
                    RemoteConfigDeferredProxy.b(dVar, provider);
                }
            });
        }
    }
}
