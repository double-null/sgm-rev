package com.iab.omid.library.applovin.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f12571b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12572a;

    private g() {
    }

    public static g b() {
        return f12571b;
    }

    public Context a() {
        return this.f12572a;
    }

    public void a(Context context) {
        this.f12572a = context != null ? context.getApplicationContext() : null;
    }
}
