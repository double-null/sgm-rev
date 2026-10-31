package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: InstallIdProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public interface o0 {

    /* JADX INFO: compiled from: InstallIdProvider.java */
    public static abstract class a {
        static a a(String str, n0 n0Var) {
            return new b(str, n0Var.b(), n0Var.a());
        }

        public static a b(String str) {
            return new b(str, null, null);
        }

        public abstract String c();

        public abstract String d();

        public abstract String e();
    }

    a a();
}
