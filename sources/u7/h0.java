package u7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Tracks.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f26166b = new h0(com.google.common.collect.u.H());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26167c = x7.l0.C0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.u<a> f26168a;

    /* JADX INFO: compiled from: Tracks.java */
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f26169f = x7.l0.C0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f26170g = x7.l0.C0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f26171h = x7.l0.C0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f26172i = x7.l0.C0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e0 f26174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f26175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f26176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f26177e;

        public a(e0 e0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = e0Var.f26054a;
            this.f26173a = i10;
            boolean z11 = false;
            x7.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f26174b = e0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f26175c = z11;
            this.f26176d = (int[]) iArr.clone();
            this.f26177e = (boolean[]) zArr.clone();
        }

        public e0 a() {
            return this.f26174b;
        }

        public q b(int i10) {
            return this.f26174b.a(i10);
        }

        public int c() {
            return this.f26174b.f26056c;
        }

        public boolean d() {
            return this.f26175c;
        }

        public boolean e() {
            return com.google.common.primitives.a.a(this.f26177e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26175c == aVar.f26175c && this.f26174b.equals(aVar.f26174b) && Arrays.equals(this.f26176d, aVar.f26176d) && Arrays.equals(this.f26177e, aVar.f26177e);
        }

        public boolean f(boolean z10) {
            for (int i10 = 0; i10 < this.f26176d.length; i10++) {
                if (i(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean g(int i10) {
            return this.f26177e[i10];
        }

        public boolean h(int i10) {
            return i(i10, false);
        }

        public int hashCode() {
            return (((((this.f26174b.hashCode() * 31) + (this.f26175c ? 1 : 0)) * 31) + Arrays.hashCode(this.f26176d)) * 31) + Arrays.hashCode(this.f26177e);
        }

        public boolean i(int i10, boolean z10) {
            int i11 = this.f26176d[i10];
            return i11 == 4 || (z10 && i11 == 3);
        }
    }

    public h0(List<a> list) {
        this.f26168a = com.google.common.collect.u.B(list);
    }

    public com.google.common.collect.u<a> a() {
        return this.f26168a;
    }

    public boolean b() {
        return this.f26168a.isEmpty();
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f26168a.size(); i11++) {
            a aVar = this.f26168a.get(i11);
            if (aVar.e() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        return e(i10, false);
    }

    public boolean e(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f26168a.size(); i11++) {
            if (this.f26168a.get(i11).c() == i10 && this.f26168a.get(i11).f(z10)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return this.f26168a.equals(((h0) obj).f26168a);
    }

    public int hashCode() {
        return this.f26168a.hashCode();
    }
}
