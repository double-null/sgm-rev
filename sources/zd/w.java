package zd;

import ud.g1;
import ud.u0;
import ud.x0;

/* JADX INFO: compiled from: NamedDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends ud.k0 implements x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x0 f29243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ud.k0 f29244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29245e;

    /* JADX WARN: Multi-variable type inference failed */
    public w(ud.k0 k0Var, String str) {
        x0 x0Var = k0Var instanceof x0 ? (x0) k0Var : null;
        this.f29243c = x0Var == null ? u0.a() : x0Var;
        this.f29244d = k0Var;
        this.f29245e = str;
    }

    @Override // ud.x0
    public g1 L(long j10, Runnable runnable, zc.j jVar) {
        return this.f29243c.L(j10, runnable, jVar);
    }

    @Override // ud.k0
    public void m0(zc.j jVar, Runnable runnable) {
        this.f29244d.m0(jVar, runnable);
    }

    @Override // ud.k0
    public boolean n0(zc.j jVar) {
        return this.f29244d.n0(jVar);
    }

    @Override // ud.k0
    public String toString() {
        return this.f29245e;
    }

    @Override // ud.x0
    public void u(long j10, ud.n<? super wc.g0> nVar) {
        this.f29243c.u(j10, nVar);
    }
}
