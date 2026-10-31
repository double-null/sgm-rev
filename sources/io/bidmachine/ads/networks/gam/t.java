package io.bidmachine.ads.networks.gam;

import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.Map;

/* JADX INFO: compiled from: GAMUnitData.java */
/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f16592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f16593d;

    public t(String str, float f10, float f11, Map<String, String> map) {
        this.f16590a = str;
        this.f16591b = f10;
        this.f16592c = f11;
        this.f16593d = map;
    }

    public String a() {
        return this.f16590a;
    }

    public Map<String, String> b() {
        return this.f16593d;
    }

    public float c() {
        return this.f16592c;
    }

    public float d() {
        return this.f16591b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f16590a.equals(tVar.f16590a) && Float.compare(tVar.f16591b, this.f16591b) == 0 && Float.compare(tVar.f16592c, this.f16592c) == 0;
    }

    public int hashCode() {
        return (((this.f16590a.hashCode() * 31) + Float.floatToIntBits(this.f16591b)) * 31) + Float.floatToIntBits(this.f16592c);
    }

    public String toString() {
        return "adUnitId - " + this.f16590a + WKirgUEJJ.IQlCJQKMsQRAyV + this.f16591b + ", price - " + this.f16592c;
    }
}
