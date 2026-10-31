package ud;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T a(zc.j jVar, id.p<? super o0, ? super zc.f<? super T>, ? extends Object> pVar) throws InterruptedException {
        k1 k1VarA;
        zc.j jVarJ;
        Thread threadCurrentThread = Thread.currentThread();
        zc.g gVar = (zc.g) jVar.e(zc.g.f29179a9);
        if (gVar == null) {
            k1VarA = v2.f26824a.b();
            jVarJ = i0.j(u1.f26821a, jVar.z(k1VarA));
        } else {
            k1 k1Var = gVar instanceof k1 ? (k1) gVar : null;
            if (k1Var == null) {
                k1VarA = v2.f26824a.a();
            } else {
                k1 k1Var2 = k1Var.B0() ? k1Var : null;
                if (k1Var2 == null) {
                    k1VarA = v2.f26824a.a();
                } else {
                    k1VarA = k1Var2;
                }
            }
            jVarJ = i0.j(u1.f26821a, jVar);
        }
        g gVar2 = new g(jVarJ, threadCurrentThread, k1VarA);
        gVar2.X0(q0.DEFAULT, gVar2, pVar);
        return (T) gVar2.Y0();
    }

    public static /* synthetic */ Object b(zc.j jVar, id.p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            jVar = zc.k.f29181a;
        }
        return i.e(jVar, pVar);
    }
}
