package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: Lambda.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u<R> implements o<R>, Serializable {
    private final int arity;

    public u(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strI = i0.i(this);
        t.e(strI, "renderLambdaToString(...)");
        return strI;
    }
}
