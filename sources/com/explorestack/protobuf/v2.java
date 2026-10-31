package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v2 f10834f = new v2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f10836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f10837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10839e;

    private v2() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10 = this.f10835a;
        int[] iArr = this.f10836b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f10836b = Arrays.copyOf(iArr, i11);
            this.f10837c = Arrays.copyOf(this.f10837c, i11);
        }
    }

    public static v2 c() {
        return f10834f;
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

    static v2 i(v2 v2Var, v2 v2Var2) {
        int i10 = v2Var.f10835a + v2Var2.f10835a;
        int[] iArrCopyOf = Arrays.copyOf(v2Var.f10836b, i10);
        System.arraycopy(v2Var2.f10836b, 0, iArrCopyOf, v2Var.f10835a, v2Var2.f10835a);
        Object[] objArrCopyOf = Arrays.copyOf(v2Var.f10837c, i10);
        System.arraycopy(v2Var2.f10837c, 0, objArrCopyOf, v2Var.f10835a, v2Var2.f10835a);
        return new v2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static v2 j() {
        return new v2();
    }

    private static boolean k(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void p(int i10, Object obj, e3 e3Var) throws IOException {
        int iA = c3.a(i10);
        int iB = c3.b(i10);
        if (iB == 0) {
            e3Var.writeInt64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            e3Var.writeFixed64(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            e3Var.c(iA, (ByteString) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            e3Var.writeFixed32(iA, ((Integer) obj).intValue());
        } else if (e3Var.fieldOrder() == e3.a.ASCENDING) {
            e3Var.writeStartGroup(iA);
            ((v2) obj).q(e3Var);
            e3Var.writeEndGroup(iA);
        } else {
            e3Var.writeEndGroup(iA);
            ((v2) obj).q(e3Var);
            e3Var.writeStartGroup(iA);
        }
    }

    void a() {
        if (!this.f10839e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iA0;
        int i10 = this.f10838d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f10835a; i12++) {
            int i13 = this.f10836b[i12];
            int iA = c3.a(i13);
            int iB = c3.b(i13);
            if (iB == 0) {
                iA0 = CodedOutputStream.a0(iA, ((Long) this.f10837c[i12]).longValue());
            } else if (iB == 1) {
                iA0 = CodedOutputStream.p(iA, ((Long) this.f10837c[i12]).longValue());
            } else if (iB == 2) {
                iA0 = CodedOutputStream.h(iA, (ByteString) this.f10837c[i12]);
            } else if (iB == 3) {
                iA0 = (CodedOutputStream.X(iA) * 2) + ((v2) this.f10837c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iA0 = CodedOutputStream.n(iA, ((Integer) this.f10837c[i12]).intValue());
            }
            i11 += iA0;
        }
        this.f10838d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f10838d;
        if (i10 != -1) {
            return i10;
        }
        int iL = 0;
        for (int i11 = 0; i11 < this.f10835a; i11++) {
            iL += CodedOutputStream.L(c3.a(this.f10836b[i11]), (ByteString) this.f10837c[i11]);
        }
        this.f10838d = iL;
        return iL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        int i10 = this.f10835a;
        return i10 == v2Var.f10835a && n(this.f10836b, v2Var.f10836b, i10) && k(this.f10837c, v2Var.f10837c, this.f10835a);
    }

    public void h() {
        this.f10839e = false;
    }

    public int hashCode() {
        int i10 = this.f10835a;
        return ((((527 + i10) * 31) + f(this.f10836b, i10)) * 31) + g(this.f10837c, this.f10835a);
    }

    final void l(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f10835a; i11++) {
            g1.c(sb2, i10, String.valueOf(c3.a(this.f10836b[i11])), this.f10837c[i11]);
        }
    }

    void m(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f10836b;
        int i11 = this.f10835a;
        iArr[i11] = i10;
        this.f10837c[i11] = obj;
        this.f10835a = i11 + 1;
    }

    void o(e3 e3Var) throws IOException {
        if (e3Var.fieldOrder() == e3.a.DESCENDING) {
            for (int i10 = this.f10835a - 1; i10 >= 0; i10--) {
                e3Var.writeMessageSetItem(c3.a(this.f10836b[i10]), this.f10837c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f10835a; i11++) {
            e3Var.writeMessageSetItem(c3.a(this.f10836b[i11]), this.f10837c[i11]);
        }
    }

    public void q(e3 e3Var) throws IOException {
        if (this.f10835a == 0) {
            return;
        }
        if (e3Var.fieldOrder() == e3.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f10835a; i10++) {
                p(this.f10836b[i10], this.f10837c[i10], e3Var);
            }
            return;
        }
        for (int i11 = this.f10835a - 1; i11 >= 0; i11--) {
            p(this.f10836b[i11], this.f10837c[i11], e3Var);
        }
    }

    private v2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f10838d = -1;
        this.f10835a = i10;
        this.f10836b = iArr;
        this.f10837c = objArr;
        this.f10839e = z10;
    }
}
