package ud;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k1 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f26777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private kotlin.collections.i<b1<?>> f26779e;

    public static /* synthetic */ void r0(k1 k1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        k1Var.q0(z10);
    }

    private final long s0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void w0(k1 k1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        k1Var.v0(z10);
    }

    public final boolean A0() {
        b1<?> b1VarZ;
        kotlin.collections.i<b1<?>> iVar = this.f26779e;
        if (iVar == null || (b1VarZ = iVar.z()) == null) {
            return false;
        }
        b1VarZ.run();
        return true;
    }

    public boolean B0() {
        return false;
    }

    @Override // ud.k0
    public final k0 o0(int i10, String str) {
        zd.m.a(i10);
        return zd.m.b(this, str);
    }

    public final void q0(boolean z10) {
        long jS0 = this.f26777c - s0(z10);
        this.f26777c = jS0;
        if (jS0 <= 0 && this.f26778d) {
            shutdown();
        }
    }

    public final void t0(b1<?> b1Var) {
        kotlin.collections.i<b1<?>> iVar = this.f26779e;
        if (iVar == null) {
            iVar = new kotlin.collections.i<>();
            this.f26779e = iVar;
        }
        iVar.addLast(b1Var);
    }

    protected long u0() {
        kotlin.collections.i<b1<?>> iVar = this.f26779e;
        return (iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void v0(boolean z10) {
        this.f26777c += s0(z10);
        if (z10) {
            return;
        }
        this.f26778d = true;
    }

    public final boolean x0() {
        return this.f26777c >= s0(true);
    }

    public final boolean y0() {
        kotlin.collections.i<b1<?>> iVar = this.f26779e;
        if (iVar != null) {
            return iVar.isEmpty();
        }
        return true;
    }

    public long z0() {
        return !A0() ? Long.MAX_VALUE : 0L;
    }

    public void shutdown() {
    }
}
