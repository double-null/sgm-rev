package k9;

import u7.v;

/* JADX INFO: compiled from: SmtaMetadataEntry.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21277b;

    public d(float f10, int i10) {
        this.f21276a = f10;
        this.f21277b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21276a == dVar.f21276a && this.f21277b == dVar.f21277b;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.c.a(this.f21276a)) * 31) + this.f21277b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f21276a + ", svcTemporalLayerCount=" + this.f21277b;
    }
}
