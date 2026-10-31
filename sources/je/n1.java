package je;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n1 extends z2<String> {
    protected abstract String a0(String str, String str2);

    protected abstract String b0(he.f fVar, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.z2
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(he.f fVar, int i10) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        return d0(b0(fVar, i10));
    }

    protected final String d0(String nestedName) {
        kotlin.jvm.internal.t.f(nestedName, "nestedName");
        String strW = W();
        if (strW == null) {
            strW = "";
        }
        return a0(strW, nestedName);
    }
}
