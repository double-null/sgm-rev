package u7;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: FlagSet.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f26210a;

    /* JADX INFO: compiled from: FlagSet.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f26211a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26212b;

        public b a(int i10) {
            x7.a.g(!this.f26212b);
            this.f26211a.append(i10, true);
            return this;
        }

        public b b(o oVar) {
            for (int i10 = 0; i10 < oVar.d(); i10++) {
                a(oVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public o e() {
            x7.a.g(!this.f26212b);
            this.f26212b = true;
            return new o(this.f26211a);
        }
    }

    public boolean a(int i10) {
        return this.f26210a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        x7.a.c(i10, 0, d());
        return this.f26210a.keyAt(i10);
    }

    public int d() {
        return this.f26210a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (x7.l0.f28136a >= 24) {
            return this.f26210a.equals(oVar.f26210a);
        }
        if (d() != oVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != oVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (x7.l0.f28136a >= 24) {
            return this.f26210a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }

    private o(SparseBooleanArray sparseBooleanArray) {
        this.f26210a = sparseBooleanArray;
    }
}
