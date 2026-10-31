package com.google.firebase.crashlytics.internal.common;

import java.io.File;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.h0 f12092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f12094c;

    a(e3.h0 h0Var, String str, File file) {
        if (h0Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f12092a = h0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f12093b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f12094c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.h0
    public e3.h0 b() {
        return this.f12092a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.h0
    public File c() {
        return this.f12094c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.h0
    public String d() {
        return this.f12093b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f12092a.equals(h0Var.b()) && this.f12093b.equals(h0Var.d()) && this.f12094c.equals(h0Var.c());
    }

    public int hashCode() {
        return ((((this.f12092a.hashCode() ^ 1000003) * 1000003) ^ this.f12093b.hashCode()) * 1000003) ^ this.f12094c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f12092a + ", sessionId=" + this.f12093b + ", reportFile=" + this.f12094c + "}";
    }
}
