package je;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m1 extends y2<String> {
    protected abstract String e0(String str, String str2);

    protected String f0(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return descriptor.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.y2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final String Z(he.f fVar, int i10) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        return h0(f0(fVar, i10));
    }

    protected final String h0(String nestedName) {
        kotlin.jvm.internal.t.f(nestedName, "nestedName");
        String strY = Y();
        if (strY == null) {
            strY = "";
        }
        return e0(strY, nestedName);
    }

    protected final String i0() {
        return a0().isEmpty() ? "$" : kotlin.collections.b0.V(a0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
