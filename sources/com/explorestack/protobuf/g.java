package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: ArrayDecoders.java */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: compiled from: ArrayDecoders.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10449a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10449a = iArr;
            try {
                iArr[c3.b.f10254c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10449a[c3.b.f10255d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10449a[c3.b.f10256e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10449a[c3.b.f10257f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10449a[c3.b.f10258g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10449a[c3.b.f10266o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10449a[c3.b.f10259h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10449a[c3.b.f10269r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10449a[c3.b.f10260i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10449a[c3.b.f10268q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10449a[c3.b.f10261j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10449a[c3.b.f10270s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10449a[c3.b.f10271t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10449a[c3.b.f10267p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10449a[c3.b.f10265n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10449a[c3.b.f10262k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10449a[c3.b.f10263l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10449a[c3.b.f10264m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: compiled from: ArrayDecoders.java */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f10451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y f10453d;

        b(y yVar) {
            yVar.getClass();
            this.f10453d = yVar;
        }
    }

    static int A(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        k0 k0Var = (k0) jVar;
        int I = I(bArr, i11, bVar);
        k0Var.addInt(n.b(bVar.f10450a));
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            I = I(bArr, I2, bVar);
            k0Var.addInt(n.b(bVar.f10450a));
        }
        return I;
    }

    static int B(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        u0 u0Var = (u0) jVar;
        int iL = L(bArr, i11, bVar);
        u0Var.addLong(n.c(bVar.f10451b));
        while (iL < i12) {
            int I = I(bArr, iL, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            iL = L(bArr, I, bVar);
            u0Var.addLong(n.c(bVar.f10451b));
        }
        return iL;
    }

    static int C(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            bVar.f10452c = "";
            return I;
        }
        bVar.f10452c = new String(bArr, I, i11, l0.f10621a);
        return I + i11;
    }

    static int D(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f10450a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i13 == 0) {
            jVar.add("");
        } else {
            jVar.add(new String(bArr, I, i13, l0.f10621a));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f10450a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i14 == 0) {
                jVar.add("");
            } else {
                jVar.add(new String(bArr, I, i14, l0.f10621a));
                I += i14;
            }
        }
        return I;
    }

    static int E(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f10450a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i13 == 0) {
            jVar.add("");
        } else {
            int i14 = I + i13;
            if (!a3.t(bArr, I, i14)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            jVar.add(new String(bArr, I, i13, l0.f10621a));
            I = i14;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i15 = bVar.f10450a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i15 == 0) {
                jVar.add("");
            } else {
                int i16 = I + i15;
                if (!a3.t(bArr, I, i16)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                jVar.add(new String(bArr, I, i15, l0.f10621a));
                I = i16;
            }
        }
        return I;
    }

    static int F(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            bVar.f10452c = "";
            return I;
        }
        bVar.f10452c = a3.h(bArr, I, i11);
        return I + i11;
    }

    static int G(int i10, byte[] bArr, int i11, int i12, v2 v2Var, b bVar) throws InvalidProtocolBufferException {
        if (c3.a(i10) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iB = c3.b(i10);
        if (iB == 0) {
            int iL = L(bArr, i11, bVar);
            v2Var.m(i10, Long.valueOf(bVar.f10451b));
            return iL;
        }
        if (iB == 1) {
            v2Var.m(i10, Long.valueOf(j(bArr, i11)));
            return i11 + 8;
        }
        if (iB == 2) {
            int I = I(bArr, i11, bVar);
            int i13 = bVar.f10450a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i13 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i13 == 0) {
                v2Var.m(i10, ByteString.EMPTY);
            } else {
                v2Var.m(i10, ByteString.copyFrom(bArr, I, i13));
            }
            return I + i13;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            v2Var.m(i10, Integer.valueOf(h(bArr, i11)));
            return i11 + 4;
        }
        v2 v2VarJ = v2.j();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            int I2 = I(bArr, i11, bVar);
            int i16 = bVar.f10450a;
            if (i16 == i14) {
                i15 = i16;
                i11 = I2;
                break;
            }
            i15 = i16;
            i11 = G(i16, bArr, I2, i12, v2VarJ, bVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        v2Var.m(i10, v2VarJ);
        return i11;
    }

    static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f10450a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f10450a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f10450a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f10450a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f10450a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return H(b10, bArr, i11, bVar);
        }
        bVar.f10450a = b10;
        return i11;
    }

    static int J(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        k0 k0Var = (k0) jVar;
        int I = I(bArr, i11, bVar);
        k0Var.addInt(bVar.f10450a);
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            I = I(bArr, I2, bVar);
            k0Var.addInt(bVar.f10450a);
        }
        return I;
    }

    static int K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & 127)) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f10451b = j11;
        return i11;
    }

    static int L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return K(j10, bArr, i11, bVar);
        }
        bVar.f10451b = j10;
        return i11;
    }

    static int M(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        u0 u0Var = (u0) jVar;
        int iL = L(bArr, i11, bVar);
        u0Var.addLong(bVar.f10451b);
        while (iL < i12) {
            int I = I(bArr, iL, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            iL = L(bArr, I, bVar);
            u0Var.addLong(bVar.f10451b);
        }
        return iL;
    }

    static int N(int i10, byte[] bArr, int i11, int i12, b bVar) throws InvalidProtocolBufferException {
        if (c3.a(i10) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iB = c3.b(i10);
        if (iB == 0) {
            return L(bArr, i11, bVar);
        }
        if (iB == 1) {
            return i11 + 8;
        }
        if (iB == 2) {
            return I(bArr, i11, bVar) + bVar.f10450a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i11 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = I(bArr, i11, bVar);
            i14 = bVar.f10450a;
            if (i14 == i13) {
                break;
            }
            i11 = N(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i11;
    }

    static int a(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        j jVar2 = (j) jVar;
        int iL = L(bArr, i11, bVar);
        jVar2.addBoolean(bVar.f10451b != 0);
        while (iL < i12) {
            int I = I(bArr, iL, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            iL = L(bArr, I, bVar);
            jVar2.addBoolean(bVar.f10451b != 0);
        }
        return iL;
    }

    static int b(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 > bArr.length - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i11 == 0) {
            bVar.f10452c = ByteString.EMPTY;
            return I;
        }
        bVar.f10452c = ByteString.copyFrom(bArr, I, i11);
        return I + i11;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f10450a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i13 > bArr.length - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i13 == 0) {
            jVar.add(ByteString.EMPTY);
        } else {
            jVar.add(ByteString.copyFrom(bArr, I, i13));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f10450a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i14 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i14 == 0) {
                jVar.add(ByteString.EMPTY);
            } else {
                jVar.add(ByteString.copyFrom(bArr, I, i14));
                I += i14;
            }
        }
        return I;
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        r rVar = (r) jVar;
        rVar.addDouble(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            rVar.addDouble(d(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int f(int i10, byte[] bArr, int i11, int i12, i0.b<?, ?> bVar, i0.d<?, ?> dVar, t2<v2, v2> t2Var, b bVar2) throws IOException {
        Object objT;
        e0<i0.c> e0Var = bVar.f10481d;
        int i13 = i10 >>> 3;
        Object objValueOf = null;
        if (dVar.f10488b.isRepeated() && dVar.f10488b.isPacked()) {
            switch (a.f10449a[dVar.b().ordinal()]) {
                case 1:
                    r rVar = new r();
                    int iS = s(bArr, i11, rVar, bVar2);
                    e0Var.N(dVar.f10488b, rVar);
                    return iS;
                case 2:
                    g0 g0Var = new g0();
                    int iV = v(bArr, i11, g0Var, bVar2);
                    e0Var.N(dVar.f10488b, g0Var);
                    return iV;
                case 3:
                case 4:
                    u0 u0Var = new u0();
                    int iZ = z(bArr, i11, u0Var, bVar2);
                    e0Var.N(dVar.f10488b, u0Var);
                    return iZ;
                case 5:
                case 6:
                    k0 k0Var = new k0();
                    int iY = y(bArr, i11, k0Var, bVar2);
                    e0Var.N(dVar.f10488b, k0Var);
                    return iY;
                case 7:
                case 8:
                    u0 u0Var2 = new u0();
                    int iU = u(bArr, i11, u0Var2, bVar2);
                    e0Var.N(dVar.f10488b, u0Var2);
                    return iU;
                case 9:
                case 10:
                    k0 k0Var2 = new k0();
                    int iT = t(bArr, i11, k0Var2, bVar2);
                    e0Var.N(dVar.f10488b, k0Var2);
                    return iT;
                case 11:
                    j jVar = new j();
                    int iR = r(bArr, i11, jVar, bVar2);
                    e0Var.N(dVar.f10488b, jVar);
                    return iR;
                case 12:
                    k0 k0Var3 = new k0();
                    int iW = w(bArr, i11, k0Var3, bVar2);
                    e0Var.N(dVar.f10488b, k0Var3);
                    return iW;
                case 13:
                    u0 u0Var3 = new u0();
                    int iX = x(bArr, i11, u0Var3, bVar2);
                    e0Var.N(dVar.f10488b, u0Var3);
                    return iX;
                case 14:
                    k0 k0Var4 = new k0();
                    int iY2 = y(bArr, i11, k0Var4, bVar2);
                    v2 v2Var = bVar.f10476a;
                    v2 v2Var2 = (v2) d2.z(i13, k0Var4, dVar.f10488b.b(), v2Var != v2.c() ? v2Var : null, t2Var);
                    if (v2Var2 != null) {
                        bVar.f10476a = v2Var2;
                    }
                    e0Var.N(dVar.f10488b, k0Var4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + dVar.f10488b.getLiteType());
            }
        }
        if (dVar.b() != c3.b.f10267p) {
            switch (a.f10449a[dVar.b().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(d(bArr, i11));
                    i11 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(l(bArr, i11));
                    i11 += 4;
                    break;
                case 3:
                case 4:
                    i11 = L(bArr, i11, bVar2);
                    objValueOf = Long.valueOf(bVar2.f10451b);
                    break;
                case 5:
                case 6:
                    i11 = I(bArr, i11, bVar2);
                    objValueOf = Integer.valueOf(bVar2.f10450a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(j(bArr, i11));
                    i11 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(h(bArr, i11));
                    i11 += 4;
                    break;
                case 11:
                    i11 = L(bArr, i11, bVar2);
                    objValueOf = Boolean.valueOf(bVar2.f10451b != 0);
                    break;
                case 12:
                    i11 = I(bArr, i11, bVar2);
                    objValueOf = Integer.valueOf(n.b(bVar2.f10450a));
                    break;
                case 13:
                    i11 = L(bArr, i11, bVar2);
                    objValueOf = Long.valueOf(n.c(bVar2.f10451b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = b(bArr, i11, bVar2);
                    objValueOf = bVar2.f10452c;
                    break;
                case 16:
                    i11 = C(bArr, i11, bVar2);
                    objValueOf = bVar2.f10452c;
                    break;
                case 17:
                    i11 = n(v1.a().d(dVar.c().getClass()), bArr, i11, i12, (i13 << 3) | 4, bVar2);
                    objValueOf = bVar2.f10452c;
                    break;
                case 18:
                    i11 = p(v1.a().d(dVar.c().getClass()), bArr, i11, i12, bVar2);
                    objValueOf = bVar2.f10452c;
                    break;
            }
        } else {
            i11 = I(bArr, i11, bVar2);
            if (dVar.f10488b.b().findValueByNumber(bVar2.f10450a) == null) {
                v2 v2VarJ = bVar.f10476a;
                if (v2VarJ == v2.c()) {
                    v2VarJ = v2.j();
                    bVar.f10476a = v2VarJ;
                }
                d2.M(i13, bVar2.f10450a, v2VarJ, t2Var);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar2.f10450a);
        }
        if (dVar.e()) {
            e0Var.g(dVar.f10488b, objValueOf);
        } else {
            int i14 = a.f10449a[dVar.b().ordinal()];
            if ((i14 == 17 || i14 == 18) && (objT = e0Var.t(dVar.f10488b)) != null) {
                objValueOf = l0.k(objT, objValueOf);
            }
            e0Var.N(dVar.f10488b, objValueOf);
        }
        return i11;
    }

    static int g(int i10, byte[] bArr, int i11, int i12, Object obj, MessageLite messageLite, t2<v2, v2> t2Var, b bVar) throws IOException {
        i0.d dVarA = bVar.f10453d.a(messageLite, i10 >>> 3);
        if (dVarA == null) {
            return G(i10, bArr, i11, i12, i1.p(obj), bVar);
        }
        i0.b bVar2 = (i0.b) obj;
        bVar2.s();
        return f(i10, bArr, i11, i12, bVar2, dVarA, t2Var, bVar);
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        k0 k0Var = (k0) jVar;
        k0Var.addInt(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            k0Var.addInt(h(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static long j(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static int k(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        u0 u0Var = (u0) jVar;
        u0Var.addLong(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            u0Var.addLong(j(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    static int m(int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) {
        g0 g0Var = (g0) jVar;
        g0Var.addFloat(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            g0Var.addFloat(l(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static int n(b2 b2Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        i1 i1Var = (i1) b2Var;
        Object objNewInstance = i1Var.newInstance();
        int iW = i1Var.W(objNewInstance, bArr, i10, i11, i12, bVar);
        i1Var.makeImmutable(objNewInstance);
        bVar.f10452c = objNewInstance;
        return iW;
    }

    static int o(b2 b2Var, int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int iN = n(b2Var, bArr, i11, i12, i13, bVar);
        jVar.add(bVar.f10452c);
        while (iN < i12) {
            int I = I(bArr, iN, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            iN = n(b2Var, bArr, I, i12, i13, bVar);
            jVar.add(bVar.f10452c);
        }
        return iN;
    }

    static int p(b2 b2Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        int iH = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iH = H(i12, bArr, iH, bVar);
            i12 = bVar.f10450a;
        }
        int i13 = iH;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objNewInstance = b2Var.newInstance();
        int i14 = i12 + i13;
        b2Var.b(objNewInstance, bArr, i13, i14, bVar);
        b2Var.makeImmutable(objNewInstance);
        bVar.f10452c = objNewInstance;
        return i14;
    }

    static int q(b2<?> b2Var, int i10, byte[] bArr, int i11, int i12, l0.j<?> jVar, b bVar) throws IOException {
        int iP = p(b2Var, bArr, i11, i12, bVar);
        jVar.add(bVar.f10452c);
        while (iP < i12) {
            int I = I(bArr, iP, bVar);
            if (i10 != bVar.f10450a) {
                break;
            }
            iP = p(b2Var, bArr, I, i12, bVar);
            jVar.add(bVar.f10452c);
        }
        return iP;
    }

    static int r(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        j jVar2 = (j) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            jVar2.addBoolean(bVar.f10451b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int s(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        r rVar = (r) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            rVar.addDouble(d(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int t(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        k0 k0Var = (k0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            k0Var.addInt(h(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int u(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        u0 u0Var = (u0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            u0Var.addLong(j(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int v(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        g0 g0Var = (g0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            g0Var.addFloat(l(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int w(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        k0 k0Var = (k0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            k0Var.addInt(n.b(bVar.f10450a));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int x(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        u0 u0Var = (u0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            u0Var.addLong(n.c(bVar.f10451b));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int y(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        k0 k0Var = (k0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            k0Var.addInt(bVar.f10450a);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int z(byte[] bArr, int i10, l0.j<?> jVar, b bVar) throws IOException {
        u0 u0Var = (u0) jVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f10450a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            u0Var.addLong(bVar.f10451b);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
