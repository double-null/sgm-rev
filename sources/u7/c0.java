package u7;

import android.view.Surface;

/* JADX INFO: compiled from: SurfaceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f26002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26006e;

    public c0(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f26003b == c0Var.f26003b && this.f26004c == c0Var.f26004c && this.f26005d == c0Var.f26005d && this.f26006e == c0Var.f26006e && this.f26002a.equals(c0Var.f26002a);
    }

    public int hashCode() {
        return (((((((this.f26002a.hashCode() * 31) + this.f26003b) * 31) + this.f26004c) * 31) + this.f26005d) * 31) + (this.f26006e ? 1 : 0);
    }

    public c0(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public c0(Surface surface, int i10, int i11, int i12, boolean z10) {
        x7.a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f26002a = surface;
        this.f26003b = i10;
        this.f26004c = i11;
        this.f26005d = i12;
        this.f26006e = z10;
    }
}
