package zc;

import id.p;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static final <R, T> void a(p<? super R, ? super f<? super T>, ? extends Object> pVar, R r10, f<? super T> completion) {
        t.f(pVar, "<this>");
        t.f(completion, "completion");
        f fVarC = ad.c.c(ad.c.a(pVar, r10, completion));
        r.a aVar = r.f27774b;
        fVarC.resumeWith(r.c(g0.f27756a));
    }
}
