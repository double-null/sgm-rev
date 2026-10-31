package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class c1 implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d1 f12879a;

    c1(d1 d1Var) {
        this.f12879a = d1Var;
    }

    public final void a(int i10) {
        this.f12879a.f12888h.f12919e.lock();
        i1 i1Var = this.f12879a.f12888h;
        i1Var.f12921g = i10;
        if (i10 == 3 && i1Var.f12923i) {
            i1Var.runOnUiThread(new b1(this));
        }
        if (i10 != 0) {
            this.f12879a.f12888h.f12918d.release();
        }
        this.f12879a.f12888h.f12919e.unlock();
    }
}
