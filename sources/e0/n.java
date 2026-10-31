package e0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DataStoreInMemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd.n<k0<T>> f13776a;

    public n() {
        o0 o0Var = o0.f13779b;
        kotlin.jvm.internal.t.d(o0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f13776a = xd.t.a(o0Var);
    }

    public final k0<T> a() {
        return this.f13776a.getValue();
    }

    public final xd.c<k0<T>> b() {
        return this.f13776a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final k0<T> c(k0<T> newState) {
        k0<T> value;
        k0<T> k0Var;
        kotlin.jvm.internal.t.f(newState, "newState");
        xd.n<k0<T>> nVar = this.f13776a;
        do {
            value = nVar.getValue();
            k0Var = value;
            if (k0Var instanceof d0 ? true : kotlin.jvm.internal.t.a(k0Var, o0.f13779b)) {
                k0Var = newState;
            } else if (k0Var instanceof h) {
                if (newState.a() > k0Var.a()) {
                    k0Var = newState;
                }
            } else if (!(k0Var instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!nVar.e(value, k0Var));
        return k0Var;
    }
}
