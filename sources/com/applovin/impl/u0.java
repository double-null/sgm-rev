package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f8860a = new StringBuilder();

    public void a(w0 w0Var, long j10) {
        if (w0Var.d() == w0.b.f8989g) {
            return;
        }
        a(a(w0Var), j10);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.f8860a.toString();
    }

    public void b(String str) {
        a("Invalid state: " + str);
    }

    public void a(w0 w0Var, boolean z10, long j10) {
        a(a(w0Var) + ": " + z10, j10);
    }

    public void a() {
        this.f8860a.setLength(0);
    }

    private void a(String str, long j10) {
        a(str + " after " + j10 + "ms");
    }

    private void a(String str) {
        StringBuilder sb2 = this.f8860a;
        sb2.append(str);
        sb2.append("\n");
    }

    private String a(w0 w0Var) {
        w0.b bVarD = w0Var.d();
        if (bVarD == w0.b.EVENT) {
            return ((z0) w0Var).g();
        }
        if (bVarD == w0.b.f8989g) {
            return StringUtils.emptyIfNull(w0Var.b());
        }
        return StringUtils.emptyIfNull(w0Var.e());
    }
}
