package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: OptionalProvider.java */
/* JADX INFO: loaded from: classes4.dex */
class j<T> implements Provider<T>, Deferred<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Deferred.a<Object> f11953c = new Deferred.a() { // from class: com.google.firebase.components.g
        @Override // com.google.firebase.inject.Deferred.a
        public final void a(Provider provider) {
            j.f(provider);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Provider<Object> f11954d = new Provider() { // from class: com.google.firebase.components.h
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return j.g();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Deferred.a<T> f11955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Provider<T> f11956b;

    private j(Deferred.a<T> aVar, Provider<T> provider) {
        this.f11955a = aVar;
        this.f11956b = provider;
    }

    static <T> j<T> e() {
        return new j<>(f11953c, f11954d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Deferred.a aVar, Deferred.a aVar2, Provider provider) {
        aVar.a(provider);
        aVar2.a(provider);
    }

    static <T> j<T> i(Provider<T> provider) {
        return new j<>(null, provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void a(final Deferred.a<T> aVar) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.f11956b;
        Provider<Object> provider4 = f11954d;
        if (provider3 != provider4) {
            aVar.a(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f11956b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.a<T> aVar2 = this.f11955a;
                this.f11955a = new Deferred.a() { // from class: com.google.firebase.components.i
                    @Override // com.google.firebase.inject.Deferred.a
                    public final void a(Provider provider5) {
                        j.h(aVar2, aVar, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            aVar.a(provider);
        }
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.f11956b.get();
    }

    void j(Provider<T> provider) {
        Deferred.a<T> aVar;
        if (this.f11956b != f11954d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f11955a;
            this.f11955a = null;
            this.f11956b = provider;
        }
        aVar.a(provider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Provider provider) {
    }
}
