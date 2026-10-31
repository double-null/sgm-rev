package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i1 f12905a;

    g1(i1 i1Var) {
        this.f12905a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f12905a;
        a1 a1Var = i1Var.f12920f;
        if (a1Var != null) {
            i1Var.f12915a.removeViewFromPlayer(a1Var);
            i1Var.f12923i = false;
            i1Var.f12920f.destroyPlayer();
            i1Var.f12920f = null;
            h1 h1Var = i1Var.f12917c;
            if (h1Var != null) {
                ((A0) h1Var).a();
            }
        }
        this.f12905a.f12915a.onResume();
    }
}
