package yd;

import java.util.Arrays;
import wc.g0;
import yd.c;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<S extends c<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private S[] f28873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28875c;

    protected final S d() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f28873a;
            if (sArr == null) {
                sArr = (S[]) g(2);
                this.f28873a = sArr;
            } else if (this.f28874b >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                kotlin.jvm.internal.t.e(objArrCopyOf, "copyOf(...)");
                this.f28873a = (S[]) ((c[]) objArrCopyOf);
                sArr = (S[]) ((c[]) objArrCopyOf);
            }
            int i10 = this.f28875c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = (S) f();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                kotlin.jvm.internal.t.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f28875c = i10;
            this.f28874b++;
        }
        return s10;
    }

    protected abstract S f();

    protected abstract S[] g(int i10);

    protected final void h(S s10) {
        int i10;
        zc.f<g0>[] fVarArrB;
        synchronized (this) {
            int i11 = this.f28874b - 1;
            this.f28874b = i11;
            if (i11 == 0) {
                this.f28875c = 0;
            }
            kotlin.jvm.internal.t.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            fVarArrB = s10.b(this);
        }
        for (zc.f<g0> fVar : fVarArrB) {
            if (fVar != null) {
                wc.r.a aVar = wc.r.f27774b;
                fVar.resumeWith(wc.r.c(g0.f27756a));
            }
        }
    }

    protected final S[] i() {
        return this.f28873a;
    }
}
