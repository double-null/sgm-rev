package zd;

import ud.u2;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.j f29223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f29224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u2<Object>[] f29225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29226d;

    public p0(zc.j jVar, int i10) {
        this.f29223a = jVar;
        this.f29224b = new Object[i10];
        this.f29225c = new u2[i10];
    }

    public final void a(u2<?> u2Var, Object obj) {
        Object[] objArr = this.f29224b;
        int i10 = this.f29226d;
        objArr[i10] = obj;
        u2<Object>[] u2VarArr = this.f29225c;
        this.f29226d = i10 + 1;
        kotlin.jvm.internal.t.d(u2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        u2VarArr[i10] = u2Var;
    }

    public final void b(zc.j jVar) {
        int length = this.f29225c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            u2<Object> u2Var = this.f29225c[length];
            kotlin.jvm.internal.t.c(u2Var);
            u2Var.I(jVar, this.f29224b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
