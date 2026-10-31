package zd;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final ud.k0 b(ud.k0 k0Var, String str) {
        return str != null ? new w(k0Var, str) : k0Var;
    }
}
