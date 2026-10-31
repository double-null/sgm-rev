package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* JADX INFO: loaded from: classes.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f5 f6416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxError f6420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f6421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f6422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f6423h;

    public interface a {
        void a(e5 e5Var);
    }

    private e5(f5 f5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j10, long j11) {
        this(f5Var, str, maxError, j10, j11, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static e5 a(f5 f5Var, com.applovin.impl.mediation.h hVar, String str, long j10, long j11) {
        if (f5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new e5(f5Var, hVar, str, null, j10, j11);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f6422g;
    }

    public MaxError c() {
        return this.f6420e;
    }

    public String d() {
        return this.f6417b;
    }

    public String e() {
        return this.f6419d;
    }

    public f5 f() {
        return this.f6416a;
    }

    public boolean g() {
        return this.f6423h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f6416a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f6417b);
        sb2.append('\'');
        sb2.append(", mAdapterVersion='");
        sb2.append(this.f6418c);
        sb2.append('\'');
        sb2.append(", mSignalDataLength='");
        String str = this.f6419d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append('\'');
        sb2.append(", mErrorMessage=");
        MaxError maxError = this.f6420e;
        sb2.append(maxError != null ? maxError.getMessage() : "");
        sb2.append('}');
        return sb2.toString();
    }

    private e5(f5 f5Var, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f6416a = f5Var;
        this.f6419d = str;
        this.f6420e = maxError;
        this.f6421f = j10;
        this.f6422g = j11;
        this.f6417b = str2;
        this.f6418c = str3;
        this.f6423h = z10;
    }

    public static e5 a(f5 f5Var, MaxError maxError) {
        return a(f5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static e5 a(f5 f5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j10, long j11) {
        if (f5Var != null) {
            return new e5(f5Var, hVar, null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static e5 a(e5 e5Var) {
        return new e5(e5Var.f(), e5Var.e(), e5Var.c(), e5Var.f6421f, e5Var.f6422g, e5Var.d(), e5Var.a(), true);
    }

    public String a() {
        return this.f6418c;
    }
}
