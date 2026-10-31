package com.explorestack.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes.dex */
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a1 f10342a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a1 f10343b = new c1();

    static a1 a() {
        return f10342a;
    }

    static a1 b() {
        return f10343b;
    }

    private static a1 c() {
        try {
            return (a1) b1.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
