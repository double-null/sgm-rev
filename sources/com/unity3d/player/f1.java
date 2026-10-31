package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i1 f12895a;

    f1(i1 i1Var) {
        this.f12895a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f12895a;
        a1 a1Var = i1Var.f12920f;
        if (a1Var != null) {
            i1Var.f12915a.addViewToPlayer(a1Var, true);
            i1 i1Var2 = this.f12895a;
            i1Var2.f12923i = true;
            i1Var2.f12920f.requestFocus();
        }
    }
}
