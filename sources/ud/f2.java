package ud;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f2 extends zd.p implements g1, w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2 f26744d;

    @Override // ud.w1
    public l2 a() {
        return null;
    }

    @Override // ud.w1
    public boolean c() {
        return true;
    }

    @Override // ud.g1
    public void e() {
        v().I0(this);
    }

    @Override // zd.p
    public String toString() {
        return s0.a(this) + '@' + s0.b(this) + "[job@" + s0.b(v()) + ']';
    }

    public final g2 v() {
        g2 g2Var = this.f26744d;
        if (g2Var != null) {
            return g2Var;
        }
        kotlin.jvm.internal.t.u("job");
        return null;
    }

    public abstract boolean w();

    public abstract void x(Throwable th);

    public final void y(g2 g2Var) {
        this.f26744d = g2Var;
    }
}
