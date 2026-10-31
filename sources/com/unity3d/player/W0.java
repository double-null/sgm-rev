package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class W0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f12831e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12832a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12833b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12834c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12835d = false;

    W0() {
    }

    static void e() {
        f12831e = true;
    }

    static void f() {
        f12831e = false;
    }

    final boolean a() {
        return this.f12835d;
    }

    final void b(boolean z10) {
        this.f12832a = z10;
    }

    final void c(boolean z10) {
        this.f12833b = z10;
    }

    final void d(boolean z10) {
        this.f12835d = z10;
    }

    public final String toString() {
        return super.toString();
    }

    static boolean d() {
        return f12831e;
    }

    final boolean a(boolean z10) {
        return f12831e && !((!z10 && !this.f12832a) || this.f12834c || this.f12833b);
    }

    final boolean b() {
        return this.f12834c;
    }

    final boolean c() {
        return this.f12833b;
    }

    final void e(boolean z10) {
        this.f12834c = z10;
    }
}
