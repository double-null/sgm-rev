package com.google.common.base;

import java.util.Locale;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f11457a = c();

    /* JADX INFO: compiled from: Platform.java */
    private static final class b implements n {
        private b() {
        }
    }

    static String a(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    static String b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    private static n c() {
        return new b();
    }

    static String d(String str) {
        return str == null ? "" : str;
    }

    static boolean e(String str) {
        return str == null || str.isEmpty();
    }
}
