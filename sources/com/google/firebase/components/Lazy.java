package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public class Lazy<T> implements Provider<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f11932c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f11933a = f11932c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Provider<T> f11934b;

    public Lazy(Provider<T> provider) {
        this.f11934b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t10 = (T) this.f11933a;
        Object obj = f11932c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f11933a;
                if (t10 == obj) {
                    t10 = this.f11934b.get();
                    this.f11933a = t10;
                    this.f11934b = null;
                }
            }
        }
        return t10;
    }
}
