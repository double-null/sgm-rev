package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: FirebaseInstallationId.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12181b;

    public n0(String str, String str2) {
        this.f12180a = str;
        this.f12181b = str2;
    }

    public final String a() {
        return this.f12181b;
    }

    public final String b() {
        return this.f12180a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.t.a(this.f12180a, n0Var.f12180a) && kotlin.jvm.internal.t.a(this.f12181b, n0Var.f12181b);
    }

    public int hashCode() {
        String str = this.f12180a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12181b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f12180a + ", authToken=" + this.f12181b + ')';
    }
}
