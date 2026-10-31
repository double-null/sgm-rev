package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f6392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6393d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f6391b;
    }

    public Map b() {
        return this.f6392c;
    }

    public String c() {
        return this.f6390a;
    }

    public boolean d() {
        return this.f6393d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f6390a + "', backupUrl='" + this.f6391b + "', headers='" + this.f6392c + "', shouldFireInWebView='" + this.f6393d + "'}";
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f6390a = str;
        this.f6391b = str2;
        this.f6392c = map;
        this.f6393d = z10;
    }
}
