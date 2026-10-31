package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8079c;

    r4(String str, String str2, Context context) {
        this.f8077a = str.replace("android.permission.", "");
        this.f8078b = str2;
        this.f8079c = p0.a(str, context);
    }

    public String a() {
        return this.f8078b;
    }

    public String b() {
        return this.f8077a;
    }

    public boolean c() {
        return this.f8079c;
    }
}
