package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6719d;

    public h(int i10, int i11, int i12, int i13) {
        this.f6716a = i10;
        this.f6717b = i11;
        this.f6718c = i12;
        this.f6719d = i13;
    }

    protected boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f6718c;
    }

    public int c() {
        return this.f6717b;
    }

    public int d() {
        return this.f6716a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f6716a));
        map.put("air_num", Integer.valueOf(this.f6717b));
        map.put("fsr_num", Integer.valueOf(this.f6718c));
        map.put("fir_num", Integer.valueOf(this.f6719d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.f6719d;
    }
}
