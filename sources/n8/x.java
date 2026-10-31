package n8;

import com.google.common.collect.b0;
import u7.e0;
import x7.l0;

/* JADX INFO: compiled from: TrackGroupArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f22835d = new x(new e0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f22836e = l0.C0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.collect.u<e0> f22838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22839c;

    public x(e0... e0VarArr) {
        this.f22838b = com.google.common.collect.u.D(e0VarArr);
        this.f22837a = e0VarArr.length;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer e(e0 e0Var) {
        return Integer.valueOf(e0Var.f26056c);
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f22838b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f22838b.size(); i12++) {
                if (this.f22838b.get(i10).equals(this.f22838b.get(i12))) {
                    x7.r.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public e0 b(int i10) {
        return this.f22838b.get(i10);
    }

    public com.google.common.collect.u<Integer> c() {
        return com.google.common.collect.u.B(b0.m(this.f22838b, new com.google.common.base.g() { // from class: n8.w
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return x.e((e0) obj);
            }
        }));
    }

    public int d(e0 e0Var) {
        int iIndexOf = this.f22838b.indexOf(e0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f22837a == xVar.f22837a && this.f22838b.equals(xVar.f22838b);
    }

    public int hashCode() {
        if (this.f22839c == 0) {
            this.f22839c = this.f22838b.hashCode();
        }
        return this.f22839c;
    }

    public String toString() {
        return this.f22838b.toString();
    }
}
