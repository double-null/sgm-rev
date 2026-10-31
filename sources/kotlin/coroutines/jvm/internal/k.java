package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k extends j implements o<Object> {
    private final int arity;

    public k(int i10, zc.f<Object> fVar) {
        super(fVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = i0.h(this);
        t.e(strH, "renderLambdaToString(...)");
        return strH;
    }

    public k(int i10) {
        this(i10, null);
    }
}
