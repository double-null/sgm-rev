package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: Insets.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f1850e = new g(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1854d;

    /* JADX INFO: compiled from: Insets.java */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private g(int i10, int i11, int i12, int i13) {
        this.f1851a = i10;
        this.f1852b = i11;
        this.f1853c = i12;
        this.f1854d = i13;
    }

    public static g a(g gVar, g gVar2) {
        return b(Math.max(gVar.f1851a, gVar2.f1851a), Math.max(gVar.f1852b, gVar2.f1852b), Math.max(gVar.f1853c, gVar2.f1853c), Math.max(gVar.f1854d, gVar2.f1854d));
    }

    public static g b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f1850e : new g(i10, i11, i12, i13);
    }

    public static g c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static g d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f1851a, this.f1852b, this.f1853c, this.f1854d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1854d == gVar.f1854d && this.f1851a == gVar.f1851a && this.f1853c == gVar.f1853c && this.f1852b == gVar.f1852b;
    }

    public int hashCode() {
        return (((((this.f1851a * 31) + this.f1852b) * 31) + this.f1853c) * 31) + this.f1854d;
    }

    public String toString() {
        return "Insets{left=" + this.f1851a + ", top=" + this.f1852b + ", right=" + this.f1853c + ", bottom=" + this.f1854d + '}';
    }
}
