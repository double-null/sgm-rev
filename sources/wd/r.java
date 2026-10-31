package wd;

import ud.m0;
import wc.g0;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes5.dex */
final class r<E> extends h<E> implements s<E> {
    public r(zc.j jVar, g<E> gVar) {
        super(jVar, gVar, true, true);
    }

    @Override // ud.a
    protected void V0(Throwable th, boolean z10) {
        if (Y0().m(th) || z10) {
            return;
        }
        m0.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ud.a
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public void W0(g0 g0Var) {
        v.a.a(Y0(), null, 1, null);
    }

    @Override // ud.a, ud.g2, ud.b2
    public boolean c() {
        return super.c();
    }
}
