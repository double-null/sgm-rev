package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05662i extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C05662i() {
    }

    @Deprecated
    public C05662i(String str) {
        super(str);
    }

    public C05662i(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.A01 = z10;
        this.A00 = i10;
    }

    public static C05662i A00(String str) {
        return new C05662i(str, null, false, 1);
    }

    public static C05662i A01(String str, Throwable th) {
        return new C05662i(str, th, true, 1);
    }

    public static C05662i A02(String str, Throwable th) {
        return new C05662i(str, th, true, 0);
    }
}
