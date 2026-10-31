package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f12881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f12882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f12883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f12884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f12885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f12886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f12887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ i1 f12888h;

    d1(i1 i1Var, String str, int i10, int i11, int i12, boolean z10, long j10, long j11) {
        this.f12888h = i1Var;
        this.f12881a = str;
        this.f12882b = i10;
        this.f12883c = i11;
        this.f12884d = i12;
        this.f12885e = z10;
        this.f12886f = j10;
        this.f12887g = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f12888h;
        if (i1Var.f12920f != null) {
            AbstractC2409z.Log(5, "Video already playing");
            i1 i1Var2 = this.f12888h;
            i1Var2.f12921g = 2;
            i1Var2.f12918d.release();
            return;
        }
        i1 i1Var3 = this.f12888h;
        i1Var.f12920f = new a1(i1Var3.f12916b, i1Var3.f12915a, this.f12881a, this.f12882b, this.f12883c, this.f12884d, this.f12885e, this.f12886f, this.f12887g, new c1(this));
        i1 i1Var4 = this.f12888h;
        if (i1Var4.f12920f != null) {
            i1Var4.f12915a.bringToFront();
            i1 i1Var5 = this.f12888h;
            i1Var5.f12915a.addView(i1Var5.f12920f);
        }
    }
}
