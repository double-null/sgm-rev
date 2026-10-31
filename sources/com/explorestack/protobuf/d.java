package com.explorestack.protobuf;

/* JADX INFO: compiled from: Android.java */
/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f10326b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f10327c;

    static {
        f10327c = (f10325a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f10326b;
    }

    static boolean c() {
        return f10325a || !(f10326b == null || f10327c);
    }
}
