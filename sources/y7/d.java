package y7;

import u7.v;

/* JADX INFO: compiled from: Mp4LocationData.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28690b;

    public d(float f10, float f11) {
        x7.a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f28689a = f10;
        this.f28690b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f28689a == dVar.f28689a && this.f28690b == dVar.f28690b;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.c.a(this.f28689a)) * 31) + com.google.common.primitives.c.a(this.f28690b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f28689a + ", longitude=" + this.f28690b;
    }
}
