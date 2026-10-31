package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8757c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8755a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8758d = System.currentTimeMillis();

    public t1(String str, Map map) {
        this.f8756b = str;
        this.f8757c = map;
    }

    public long a() {
        return this.f8758d;
    }

    public String b() {
        return this.f8755a;
    }

    public String c() {
        return this.f8756b;
    }

    public Map d() {
        return this.f8757c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (this.f8758d == t1Var.f8758d && Objects.equals(this.f8756b, t1Var.f8756b) && Objects.equals(this.f8757c, t1Var.f8757c)) {
            return Objects.equals(this.f8755a, t1Var.f8755a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8756b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f8757c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f8758d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f8755a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f8756b + "', id='" + this.f8755a + "', creationTimestampMillis=" + this.f8758d + ", parameters=" + this.f8757c + '}';
    }
}
