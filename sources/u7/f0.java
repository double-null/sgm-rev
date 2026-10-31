package u7;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TrackSelectionOverride.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26064c = x7.l0.C0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f26065d = x7.l0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f26066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.u<Integer> f26067b;

    public f0(e0 e0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= e0Var.f26054a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f26066a = e0Var;
        this.f26067b = com.google.common.collect.u.B(list);
    }

    public int a() {
        return this.f26066a.f26056c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f26066a.equals(f0Var.f26066a) && this.f26067b.equals(f0Var.f26067b);
    }

    public int hashCode() {
        return this.f26066a.hashCode() + (this.f26067b.hashCode() * 31);
    }
}
