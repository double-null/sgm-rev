package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f7997b;

    private q4(String str, Map map) {
        this.f7996a = str;
        this.f7997b = map;
    }

    public static q4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f7996a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f7996a + "'params='" + this.f7997b + "'}";
    }

    public static q4 a(String str, Map map) {
        return new q4(str, map);
    }

    public Map a() {
        return this.f7997b;
    }
}
