package ud;

/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> extends g2 implements zc.f<T>, o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zc.j f26711c;

    public a(zc.j jVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            t0((b2) jVar.e(b2.X8));
        }
        this.f26711c = jVar.z(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ud.g2
    protected final void E0(Object obj) {
        if (!(obj instanceof c0)) {
            W0(obj);
        } else {
            c0 c0Var = (c0) obj;
            V0(c0Var.f26724a, c0Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ud.g2
    public String R() {
        return s0.a(this) + " was cancelled";
    }

    protected void U0(Object obj) {
        A(obj);
    }

    public final <R> void X0(q0 q0Var, R r10, id.p<? super R, ? super zc.f<? super T>, ? extends Object> pVar) {
        q0Var.c(pVar, r10, this);
    }

    @Override // ud.g2, ud.b2
    public boolean c() {
        return super.c();
    }

    @Override // zc.f
    public final zc.j getContext() {
        return this.f26711c;
    }

    @Override // ud.o0
    public zc.j q() {
        return this.f26711c;
    }

    @Override // zc.f
    public final void resumeWith(Object obj) {
        Object objY0 = y0(d0.b(obj));
        if (objY0 == h2.f26766b) {
            return;
        }
        U0(objY0);
    }

    @Override // ud.g2
    public final void s0(Throwable th) {
        m0.a(this.f26711c, th);
    }

    @Override // ud.g2
    public String z0() {
        String strG = i0.g(this.f26711c);
        if (strG == null) {
            return super.z0();
        }
        return '\"' + strG + "\":" + super.z0();
    }

    protected void W0(T t10) {
    }

    protected void V0(Throwable th, boolean z10) {
    }
}
