package h8;

import android.util.SparseArray;
import x7.g0;

/* JADX INFO: compiled from: TimestampAdjusterProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<g0> f15736a = new SparseArray<>();

    public g0 a(int i10) {
        g0 g0Var = this.f15736a.get(i10);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(9223372036854775806L);
        this.f15736a.put(i10, g0Var2);
        return g0Var2;
    }

    public void b() {
        this.f15736a.clear();
    }
}
