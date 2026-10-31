package com.explorestack.protobuf;

/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z<?> f10247a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z<?> f10248b = c();

    static z<?> a() {
        z<?> zVar = f10248b;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static z<?> b() {
        return f10247a;
    }

    private static z<?> c() {
        try {
            int i10 = a0.f10171b;
            return (z) a0.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
