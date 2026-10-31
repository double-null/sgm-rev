package com.explorestack.protobuf;

/* JADX INFO: compiled from: NewInstanceSchemas.java */
/* JADX INFO: loaded from: classes.dex */
final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l1 f10708a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l1 f10709b = new n1();

    static l1 a() {
        return f10708a;
    }

    static l1 b() {
        return f10709b;
    }

    private static l1 c() {
        try {
            return (l1) m1.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
