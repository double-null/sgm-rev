package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l1 f2215f = new l1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f2217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f2218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2220e;

    private l1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f2217b;
        if (i10 > iArr.length) {
            int i11 = this.f2216a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f2217b = Arrays.copyOf(iArr, i10);
            this.f2218c = Arrays.copyOf(this.f2218c, i10);
        }
    }

    public static l1 c() {
        return f2215f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static l1 j(l1 l1Var, l1 l1Var2) {
        int i10 = l1Var.f2216a + l1Var2.f2216a;
        int[] iArrCopyOf = Arrays.copyOf(l1Var.f2217b, i10);
        System.arraycopy(l1Var2.f2217b, 0, iArrCopyOf, l1Var.f2216a, l1Var2.f2216a);
        Object[] objArrCopyOf = Arrays.copyOf(l1Var.f2218c, i10);
        System.arraycopy(l1Var2.f2218c, 0, objArrCopyOf, l1Var.f2216a, l1Var2.f2216a);
        return new l1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static l1 k() {
        return new l1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, q1 q1Var) throws IOException {
        int iA = p1.a(i10);
        int iB = p1.b(i10);
        if (iB == 0) {
            q1Var.writeInt64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            q1Var.writeFixed64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            q1Var.b(iA, (g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.g());
            }
            q1Var.writeFixed32(iA, ((Integer) obj).intValue());
        } else if (q1Var.fieldOrder() == q1.a.ASCENDING) {
            q1Var.writeStartGroup(iA);
            ((l1) obj).r(q1Var);
            q1Var.writeEndGroup(iA);
        } else {
            q1Var.writeEndGroup(iA);
            ((l1) obj).r(q1Var);
            q1Var.writeStartGroup(iA);
        }
    }

    void a() {
        if (!this.f2220e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iX;
        int i10 = this.f2219d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f2216a; i12++) {
            int i13 = this.f2217b[i12];
            int iA = p1.a(i13);
            int iB = p1.b(i13);
            if (iB == 0) {
                iX = CodedOutputStream.X(iA, ((Long) this.f2218c[i12]).longValue());
            } else if (iB == 1) {
                iX = CodedOutputStream.o(iA, ((Long) this.f2218c[i12]).longValue());
            } else if (iB == 2) {
                iX = CodedOutputStream.g(iA, (g) this.f2218c[i12]);
            } else if (iB == 3) {
                iX = (CodedOutputStream.U(iA) * 2) + ((l1) this.f2218c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.g());
                }
                iX = CodedOutputStream.m(iA, ((Integer) this.f2218c[i12]).intValue());
            }
            i11 += iX;
        }
        this.f2219d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f2219d;
        if (i10 != -1) {
            return i10;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < this.f2216a; i11++) {
            iJ += CodedOutputStream.J(p1.a(this.f2217b[i11]), (g) this.f2218c[i11]);
        }
        this.f2219d = iJ;
        return iJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        int i10 = this.f2216a;
        return i10 == l1Var.f2216a && o(this.f2217b, l1Var.f2217b, i10) && l(this.f2218c, l1Var.f2218c, this.f2216a);
    }

    public void h() {
        if (this.f2220e) {
            this.f2220e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f2216a;
        return ((((527 + i10) * 31) + f(this.f2217b, i10)) * 31) + g(this.f2218c, this.f2216a);
    }

    l1 i(l1 l1Var) {
        if (l1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f2216a + l1Var.f2216a;
        b(i10);
        System.arraycopy(l1Var.f2217b, 0, this.f2217b, this.f2216a, l1Var.f2216a);
        System.arraycopy(l1Var.f2218c, 0, this.f2218c, this.f2216a, l1Var.f2216a);
        this.f2216a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f2216a; i11++) {
            r0.d(sb2, i10, String.valueOf(p1.a(this.f2217b[i11])), this.f2218c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f2216a + 1);
        int[] iArr = this.f2217b;
        int i11 = this.f2216a;
        iArr[i11] = i10;
        this.f2218c[i11] = obj;
        this.f2216a = i11 + 1;
    }

    void p(q1 q1Var) throws IOException {
        if (q1Var.fieldOrder() == q1.a.DESCENDING) {
            for (int i10 = this.f2216a - 1; i10 >= 0; i10--) {
                q1Var.writeMessageSetItem(p1.a(this.f2217b[i10]), this.f2218c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f2216a; i11++) {
            q1Var.writeMessageSetItem(p1.a(this.f2217b[i11]), this.f2218c[i11]);
        }
    }

    public void r(q1 q1Var) throws IOException {
        if (this.f2216a == 0) {
            return;
        }
        if (q1Var.fieldOrder() == q1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f2216a; i10++) {
                q(this.f2217b[i10], this.f2218c[i10], q1Var);
            }
            return;
        }
        for (int i11 = this.f2216a - 1; i11 >= 0; i11--) {
            q(this.f2217b[i11], this.f2218c[i11], q1Var);
        }
    }

    private l1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f2219d = -1;
        this.f2216a = i10;
        this.f2217b = iArr;
        this.f2218c = objArr;
        this.f2220e = z10;
    }
}
