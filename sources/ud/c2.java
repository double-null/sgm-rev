package ud;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c2 extends g2 implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26725c;

    public c2(b2 b2Var) {
        super(true);
        t0(b2Var);
        this.f26725c = U0();
    }

    private final boolean U0() {
        g2 g2VarV;
        u uVarN0 = n0();
        v vVar = uVarN0 instanceof v ? (v) uVarN0 : null;
        if (vVar != null && (g2VarV = vVar.v()) != null) {
            while (!g2VarV.f0()) {
                u uVarN1 = g2VarV.n0();
                v vVar2 = uVarN1 instanceof v ? (v) uVarN1 : null;
                if (vVar2 == null || (g2VarV = vVar2.v()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ud.g2
    public boolean f0() {
        return this.f26725c;
    }

    @Override // ud.g2
    public boolean g0() {
        return true;
    }
}
