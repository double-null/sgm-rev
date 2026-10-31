package be;

import ud.r1;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f4490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f4492h = q0();

    public f(int i10, int i11, long j10, String str) {
        this.f4488d = i10;
        this.f4489e = i11;
        this.f4490f = j10;
        this.f4491g = str;
    }

    private final a q0() {
        return new a(this.f4488d, this.f4489e, this.f4490f, this.f4491g);
    }

    @Override // ud.k0
    public void m0(zc.j jVar, Runnable runnable) {
        a.n(this.f4492h, runnable, false, false, 6, null);
    }

    public final void r0(Runnable runnable, boolean z10, boolean z11) {
        this.f4492h.k(runnable, z10, z11);
    }
}
