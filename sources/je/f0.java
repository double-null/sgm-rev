package je;

import java.util.Iterator;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends g2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final he.m f20898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wc.k f20899n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(final String name, final int i10) {
        super(name, null, i10, 2, null);
        kotlin.jvm.internal.t.f(name, "name");
        this.f20898m = he.m.b.f15863a;
        this.f20899n = wc.m.a(new id.a() { // from class: je.e0
            @Override // id.a
            public final Object invoke() {
                return f0.z(i10, name, this);
            }
        });
    }

    private final he.f[] A() {
        return (he.f[]) this.f20899n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f[] z(int i10, String str, f0 f0Var) {
        he.f[] fVarArr = new he.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fVarArr[i11] = he.l.e(str + '.' + f0Var.f(i11), he.n.d.f15867a, new he.f[0], null, 8, null);
        }
        return fVarArr;
    }

    @Override // je.g2, he.f
    public he.m d() {
        return this.f20898m;
    }

    @Override // je.g2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof he.f)) {
            return false;
        }
        he.f fVar = (he.f) obj;
        return fVar.d() == he.m.b.f15863a && kotlin.jvm.internal.t.a(i(), fVar.i()) && kotlin.jvm.internal.t.a(a2.a(this), a2.a(fVar));
    }

    @Override // je.g2, he.f
    public he.f h(int i10) {
        return A()[i10];
    }

    @Override // je.g2
    public int hashCode() {
        int iHashCode = i().hashCode();
        Iterator<String> it = he.j.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i10 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i10 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // je.g2
    public String toString() {
        return kotlin.collections.b0.V(he.j.b(this), ", ", i() + '(', ")", 0, null, null, 56, null);
    }
}
