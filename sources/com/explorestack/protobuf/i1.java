package com.explorestack.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes.dex */
final class i1<T> implements b2<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f10500r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f10501s = z2.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f10502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f10503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MessageLite f10506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f10507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f10508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f10510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f10511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f10512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f10513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l1 f10514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s0 f10515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t2<?, ?> f10516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final z<?> f10517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final a1 f10518q;

    /* JADX INFO: compiled from: MessageSchema.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10519a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10519a = iArr;
            try {
                iArr[c3.b.f10261j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10519a[c3.b.f10265n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10519a[c3.b.f10254c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10519a[c3.b.f10260i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10519a[c3.b.f10268q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10519a[c3.b.f10259h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10519a[c3.b.f10269r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10519a[c3.b.f10255d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10519a[c3.b.f10267p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10519a[c3.b.f10258g.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10519a[c3.b.f10266o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10519a[c3.b.f10256e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10519a[c3.b.f10257f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10519a[c3.b.f10264m.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10519a[c3.b.f10270s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10519a[c3.b.f10271t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10519a[c3.b.f10262k.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i1(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, l1 l1Var, s0 s0Var, t2<?, ?> t2Var, z<?> zVar, a1 a1Var) {
        this.f10502a = iArr;
        this.f10503b = objArr;
        this.f10504c = i10;
        this.f10505d = i11;
        this.f10508g = messageLite instanceof i0;
        this.f10509h = z10;
        this.f10507f = zVar != null && zVar.e(messageLite);
        this.f10510i = z11;
        this.f10511j = iArr2;
        this.f10512k = i12;
        this.f10513l = i13;
        this.f10514m = l1Var;
        this.f10515n = s0Var;
        this.f10516o = t2Var;
        this.f10517p = zVar;
        this.f10506e = messageLite;
        this.f10518q = a1Var;
    }

    private boolean A(T t10, T t11, int i10) {
        long jB0 = b0(i10) & 1048575;
        return z2.C(t10, jB0) == z2.C(t11, jB0);
    }

    private boolean B(T t10, int i10, int i11) {
        return z2.C(t10, (long) (b0(i11) & 1048575)) == i10;
    }

    private static boolean C(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> D(Object obj, long j10) {
        return (List) z2.G(obj, j10);
    }

    private static <T> long E(T t10, long j10) {
        return z2.E(t10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends e0.c<ET>> void F(t2<UT, UB> t2Var, z<ET> zVar, T t10, y1 y1Var, y yVar) throws IOException {
        Object objJ = null;
        Object objD = null;
        while (true) {
            try {
                int fieldNumber = y1Var.getFieldNumber();
                int iZ = Z(fieldNumber);
                if (iZ >= 0) {
                    int iM0 = m0(iZ);
                    try {
                        switch (l0(iM0)) {
                            case 0:
                                z2.T(t10, O(iM0), y1Var.readDouble());
                                h0(t10, iZ);
                                break;
                            case 1:
                                z2.U(t10, O(iM0), y1Var.readFloat());
                                h0(t10, iZ);
                                break;
                            case 2:
                                z2.W(t10, O(iM0), y1Var.readInt64());
                                h0(t10, iZ);
                                break;
                            case 3:
                                z2.W(t10, O(iM0), y1Var.readUInt64());
                                h0(t10, iZ);
                                break;
                            case 4:
                                z2.V(t10, O(iM0), y1Var.readInt32());
                                h0(t10, iZ);
                                break;
                            case 5:
                                z2.W(t10, O(iM0), y1Var.readFixed64());
                                h0(t10, iZ);
                                break;
                            case 6:
                                z2.V(t10, O(iM0), y1Var.readFixed32());
                                h0(t10, iZ);
                                break;
                            case 7:
                                z2.N(t10, O(iM0), y1Var.readBool());
                                h0(t10, iZ);
                                break;
                            case 8:
                                e0(t10, iM0, y1Var);
                                h0(t10, iZ);
                                break;
                            case 9:
                                if (v(t10, iZ)) {
                                    z2.X(t10, O(iM0), l0.k(z2.G(t10, O(iM0)), y1Var.b(o(iZ), yVar)));
                                } else {
                                    z2.X(t10, O(iM0), y1Var.b(o(iZ), yVar));
                                    h0(t10, iZ);
                                }
                                break;
                            case 10:
                                z2.X(t10, O(iM0), y1Var.readBytes());
                                h0(t10, iZ);
                                break;
                            case 11:
                                z2.V(t10, O(iM0), y1Var.readUInt32());
                                h0(t10, iZ);
                                break;
                            case 12:
                                int i10 = y1Var.readEnum();
                                l0.e eVarM = m(iZ);
                                if (eVarM == null || eVarM.isInRange(i10)) {
                                    z2.V(t10, O(iM0), i10);
                                    h0(t10, iZ);
                                } else {
                                    objJ = d2.M(fieldNumber, i10, objJ, t2Var);
                                }
                                break;
                            case 13:
                                z2.V(t10, O(iM0), y1Var.readSFixed32());
                                h0(t10, iZ);
                                break;
                            case 14:
                                z2.W(t10, O(iM0), y1Var.readSFixed64());
                                h0(t10, iZ);
                                break;
                            case 15:
                                z2.V(t10, O(iM0), y1Var.readSInt32());
                                h0(t10, iZ);
                                break;
                            case 16:
                                z2.W(t10, O(iM0), y1Var.readSInt64());
                                h0(t10, iZ);
                                break;
                            case 17:
                                if (v(t10, iZ)) {
                                    z2.X(t10, O(iM0), l0.k(z2.G(t10, O(iM0)), y1Var.e(o(iZ), yVar)));
                                } else {
                                    z2.X(t10, O(iM0), y1Var.e(o(iZ), yVar));
                                    h0(t10, iZ);
                                }
                                break;
                            case 18:
                                y1Var.readDoubleList(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 19:
                                y1Var.readFloatList(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 20:
                                y1Var.readInt64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 21:
                                y1Var.readUInt64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 22:
                                y1Var.readInt32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 23:
                                y1Var.readFixed64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 24:
                                y1Var.readFixed32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 25:
                                y1Var.readBoolList(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 26:
                                f0(t10, iM0, y1Var);
                                break;
                            case 27:
                                d0(t10, iM0, y1Var, o(iZ), yVar);
                                break;
                            case 28:
                                y1Var.readBytesList(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 29:
                                y1Var.readUInt32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 30:
                                List<Integer> listE = this.f10515n.e(t10, O(iM0));
                                y1Var.readEnumList(listE);
                                objJ = d2.A(fieldNumber, listE, m(iZ), objJ, t2Var);
                                break;
                            case 31:
                                y1Var.readSFixed32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 32:
                                y1Var.readSFixed64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 33:
                                y1Var.readSInt32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 34:
                                y1Var.readSInt64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 35:
                                y1Var.readDoubleList(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 36:
                                y1Var.readFloatList(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 37:
                                y1Var.readInt64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 38:
                                y1Var.readUInt64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 39:
                                y1Var.readInt32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 40:
                                y1Var.readFixed64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 41:
                                y1Var.readFixed32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 42:
                                y1Var.readBoolList(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 43:
                                y1Var.readUInt32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 44:
                                List<Integer> listE2 = this.f10515n.e(t10, O(iM0));
                                y1Var.readEnumList(listE2);
                                objJ = d2.A(fieldNumber, listE2, m(iZ), objJ, t2Var);
                                break;
                            case 45:
                                y1Var.readSFixed32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 46:
                                y1Var.readSFixed64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 47:
                                y1Var.readSInt32List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 48:
                                y1Var.readSInt64List(this.f10515n.e(t10, O(iM0)));
                                break;
                            case 49:
                                c0(t10, O(iM0), y1Var, o(iZ), yVar);
                                break;
                            case 50:
                                G(t10, iZ, n(iZ), yVar, y1Var);
                                break;
                            case 51:
                                z2.X(t10, O(iM0), Double.valueOf(y1Var.readDouble()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 52:
                                z2.X(t10, O(iM0), Float.valueOf(y1Var.readFloat()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 53:
                                z2.X(t10, O(iM0), Long.valueOf(y1Var.readInt64()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 54:
                                z2.X(t10, O(iM0), Long.valueOf(y1Var.readUInt64()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 55:
                                z2.X(t10, O(iM0), Integer.valueOf(y1Var.readInt32()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 56:
                                z2.X(t10, O(iM0), Long.valueOf(y1Var.readFixed64()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 57:
                                z2.X(t10, O(iM0), Integer.valueOf(y1Var.readFixed32()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 58:
                                z2.X(t10, O(iM0), Boolean.valueOf(y1Var.readBool()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 59:
                                e0(t10, iM0, y1Var);
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 60:
                                if (B(t10, fieldNumber, iZ)) {
                                    z2.X(t10, O(iM0), l0.k(z2.G(t10, O(iM0)), y1Var.b(o(iZ), yVar)));
                                } else {
                                    z2.X(t10, O(iM0), y1Var.b(o(iZ), yVar));
                                    h0(t10, iZ);
                                }
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 61:
                                z2.X(t10, O(iM0), y1Var.readBytes());
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 62:
                                z2.X(t10, O(iM0), Integer.valueOf(y1Var.readUInt32()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 63:
                                int i11 = y1Var.readEnum();
                                l0.e eVarM2 = m(iZ);
                                if (eVarM2 == null || eVarM2.isInRange(i11)) {
                                    z2.X(t10, O(iM0), Integer.valueOf(i11));
                                    i0(t10, fieldNumber, iZ);
                                } else {
                                    objJ = d2.M(fieldNumber, i11, objJ, t2Var);
                                }
                                break;
                            case 64:
                                z2.X(t10, O(iM0), Integer.valueOf(y1Var.readSFixed32()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 65:
                                z2.X(t10, O(iM0), Long.valueOf(y1Var.readSFixed64()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 66:
                                z2.X(t10, O(iM0), Integer.valueOf(y1Var.readSInt32()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 67:
                                z2.X(t10, O(iM0), Long.valueOf(y1Var.readSInt64()));
                                i0(t10, fieldNumber, iZ);
                                break;
                            case 68:
                                z2.X(t10, O(iM0), y1Var.e(o(iZ), yVar));
                                i0(t10, fieldNumber, iZ);
                                break;
                            default:
                                if (objJ == null) {
                                    objJ = t2Var.n();
                                }
                                if (!t2Var.m(objJ, y1Var)) {
                                    for (int i12 = this.f10512k; i12 < this.f10513l; i12++) {
                                        objJ = j(t10, this.f10511j[i12], objJ, t2Var);
                                    }
                                    if (objJ != null) {
                                        t2Var.o(t10, objJ);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!t2Var.q(y1Var)) {
                            if (objJ == null) {
                                objJ = t2Var.f(t10);
                            }
                            if (!t2Var.m(objJ, y1Var)) {
                                for (int i13 = this.f10512k; i13 < this.f10513l; i13++) {
                                    objJ = j(t10, this.f10511j[i13], objJ, t2Var);
                                }
                                if (objJ != null) {
                                    t2Var.o(t10, objJ);
                                    return;
                                }
                                return;
                            }
                        } else if (!y1Var.skipField()) {
                            for (int i14 = this.f10512k; i14 < this.f10513l; i14++) {
                                objJ = j(t10, this.f10511j[i14], objJ, t2Var);
                            }
                            if (objJ != null) {
                                t2Var.o(t10, objJ);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        for (int i15 = this.f10512k; i15 < this.f10513l; i15++) {
                            objJ = j(t10, this.f10511j[i15], objJ, t2Var);
                        }
                        if (objJ != null) {
                            t2Var.o(t10, objJ);
                            return;
                        }
                        return;
                    }
                    Object objB = !this.f10507f ? null : zVar.b(yVar, this.f10506e, fieldNumber);
                    if (objB != null) {
                        if (objD == null) {
                            objD = zVar.d(t10);
                        }
                        objJ = zVar.g(y1Var, objB, yVar, objD, objJ, t2Var);
                    } else if (!t2Var.q(y1Var)) {
                        if (objJ == null) {
                            objJ = t2Var.f(t10);
                        }
                        if (t2Var.m(objJ, y1Var)) {
                        }
                    } else if (y1Var.skipField()) {
                    }
                }
            } catch (Throwable th) {
                for (int i16 = this.f10512k; i16 < this.f10513l; i16++) {
                    objJ = j(t10, this.f10511j[i16], objJ, t2Var);
                }
                if (objJ != null) {
                    t2Var.o(t10, objJ);
                }
                throw th;
            }
        }
        for (int i17 = this.f10512k; i17 < this.f10513l; i17++) {
            objJ = j(t10, this.f10511j[i17], objJ, t2Var);
        }
        if (objJ != null) {
            t2Var.o(t10, objJ);
        }
    }

    private final <K, V> void G(Object obj, int i10, Object obj2, y yVar, y1 y1Var) throws IOException {
        long jO = O(m0(i10));
        Object objG = z2.G(obj, jO);
        if (objG == null) {
            objG = this.f10518q.newMapField(obj2);
            z2.X(obj, jO, objG);
        } else if (this.f10518q.isImmutable(objG)) {
            Object objNewMapField = this.f10518q.newMapField(obj2);
            this.f10518q.mergeFrom(objNewMapField, objG);
            z2.X(obj, jO, objNewMapField);
            objG = objNewMapField;
        }
        y1Var.a(this.f10518q.forMutableMapData(objG), this.f10518q.forMapMetadata(obj2), yVar);
    }

    private void H(T t10, T t11, int i10) {
        long jO = O(m0(i10));
        if (v(t11, i10)) {
            Object objG = z2.G(t10, jO);
            Object objG2 = z2.G(t11, jO);
            if (objG != null && objG2 != null) {
                z2.X(t10, jO, l0.k(objG, objG2));
                h0(t10, i10);
            } else if (objG2 != null) {
                z2.X(t10, jO, objG2);
                h0(t10, i10);
            }
        }
    }

    private void I(T t10, T t11, int i10) {
        int iM0 = m0(i10);
        int iN = N(i10);
        long jO = O(iM0);
        if (B(t11, iN, i10)) {
            Object objG = B(t10, iN, i10) ? z2.G(t10, jO) : null;
            Object objG2 = z2.G(t11, jO);
            if (objG != null && objG2 != null) {
                z2.X(t10, jO, l0.k(objG, objG2));
                i0(t10, iN, i10);
            } else if (objG2 != null) {
                z2.X(t10, jO, objG2);
                i0(t10, iN, i10);
            }
        }
    }

    private void J(T t10, T t11, int i10) {
        int iM0 = m0(i10);
        long jO = O(iM0);
        int iN = N(i10);
        switch (l0(iM0)) {
            case 0:
                if (v(t11, i10)) {
                    z2.T(t10, jO, z2.A(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 1:
                if (v(t11, i10)) {
                    z2.U(t10, jO, z2.B(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 2:
                if (v(t11, i10)) {
                    z2.W(t10, jO, z2.E(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 3:
                if (v(t11, i10)) {
                    z2.W(t10, jO, z2.E(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 4:
                if (v(t11, i10)) {
                    z2.V(t10, jO, z2.C(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 5:
                if (v(t11, i10)) {
                    z2.W(t10, jO, z2.E(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 6:
                if (v(t11, i10)) {
                    z2.V(t10, jO, z2.C(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 7:
                if (v(t11, i10)) {
                    z2.N(t10, jO, z2.t(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 8:
                if (v(t11, i10)) {
                    z2.X(t10, jO, z2.G(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 9:
                H(t10, t11, i10);
                break;
            case 10:
                if (v(t11, i10)) {
                    z2.X(t10, jO, z2.G(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 11:
                if (v(t11, i10)) {
                    z2.V(t10, jO, z2.C(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 12:
                if (v(t11, i10)) {
                    z2.V(t10, jO, z2.C(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 13:
                if (v(t11, i10)) {
                    z2.V(t10, jO, z2.C(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 14:
                if (v(t11, i10)) {
                    z2.W(t10, jO, z2.E(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 15:
                if (v(t11, i10)) {
                    z2.V(t10, jO, z2.C(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 16:
                if (v(t11, i10)) {
                    z2.W(t10, jO, z2.E(t11, jO));
                    h0(t10, i10);
                }
                break;
            case 17:
                H(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f10515n.d(t10, t11, jO);
                break;
            case 50:
                d2.G(this.f10518q, t10, t11, jO);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (B(t11, iN, i10)) {
                    z2.X(t10, jO, z2.G(t11, jO));
                    i0(t10, iN, i10);
                }
                break;
            case 60:
                I(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (B(t11, iN, i10)) {
                    z2.X(t10, jO, z2.G(t11, jO));
                    i0(t10, iN, i10);
                }
                break;
            case 68:
                I(t10, t11, i10);
                break;
        }
    }

    static <T> i1<T> K(Class<T> cls, e1 e1Var, l1 l1Var, s0 s0Var, t2<?, ?> t2Var, z<?> zVar, a1 a1Var) {
        return e1Var instanceof x1 ? M((x1) e1Var, l1Var, s0Var, t2Var, zVar, a1Var) : L((k2) e1Var, l1Var, s0Var, t2Var, zVar, a1Var);
    }

    static <T> i1<T> L(k2 k2Var, l1 l1Var, s0 s0Var, t2<?, ?> t2Var, z<?> zVar, a1 a1Var) {
        int iP;
        int iP2;
        boolean z10 = k2Var.getSyntax() == u1.PROTO3;
        d0[] d0VarArrB = k2Var.b();
        if (d0VarArrB.length == 0) {
            iP = 0;
            iP2 = 0;
        } else {
            iP = d0VarArrB[0].p();
            iP2 = d0VarArrB[d0VarArrB.length - 1].p();
        }
        int length = d0VarArrB.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (d0 d0Var : d0VarArrB) {
            if (d0Var.v() == f0.f10390d0) {
                i10++;
            } else if (d0Var.v().c() >= 18 && d0Var.v().c() <= 49) {
                i11++;
            }
        }
        int[] iArr2 = i10 > 0 ? new int[i10] : null;
        int[] iArr3 = i11 > 0 ? new int[i11] : null;
        int[] iArrA = k2Var.a();
        if (iArrA == null) {
            iArrA = f10500r;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < d0VarArrB.length) {
            d0 d0Var2 = d0VarArrB[i12];
            int iP3 = d0Var2.p();
            k0(d0Var2, iArr, i13, objArr);
            if (i14 < iArrA.length && iArrA[i14] == iP3) {
                iArrA[i14] = i13;
                i14++;
            }
            if (d0Var2.v() == f0.f10390d0) {
                iArr2[i15] = i13;
                i15++;
            } else {
                if (d0Var2.v().c() >= 18 && d0Var2.v().c() <= 49) {
                    iArr3[i16] = (int) z2.M(d0Var2.o());
                    i16++;
                }
                i12++;
                i13 += 3;
            }
            i12++;
            i13 += 3;
        }
        if (iArr2 == null) {
            iArr2 = f10500r;
        }
        if (iArr3 == null) {
            iArr3 = f10500r;
        }
        int[] iArr4 = new int[iArrA.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrA, 0, iArr4, 0, iArrA.length);
        System.arraycopy(iArr2, 0, iArr4, iArrA.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrA.length + iArr2.length, iArr3.length);
        return new i1<>(iArr, objArr, iP, iP2, k2Var.getDefaultInstance(), z10, true, iArr4, iArrA.length, iArrA.length + iArr2.length, l1Var, s0Var, t2Var, zVar, a1Var);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0251  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    /* JADX WARN: Code duplicated, block: B:161:0x031a  */
    /* JADX WARN: Code duplicated, block: B:162:0x031d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0320  */
    /* JADX WARN: Code duplicated, block: B:179:0x036d  */
    /* JADX WARN: Code duplicated, block: B:182:0x037a  */
    static <T> i1<T> M(x1 x1Var, l1 l1Var, s0 s0Var, t2<?, ?> t2Var, z<?> zVar, a1 a1Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        boolean z10;
        int i24;
        int iObjectFieldOffset;
        boolean z11;
        int iObjectFieldOffset2;
        int i25;
        int i26;
        java.lang.reflect.Field fieldG0;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        Object obj;
        java.lang.reflect.Field fieldG1;
        int i30;
        Object obj2;
        java.lang.reflect.Field fieldG2;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        boolean z12 = x1Var.getSyntax() == u1.PROTO3;
        String strB = x1Var.b();
        int length = strB.length();
        char c10 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i10 = i35 + 1;
                if (strB.charAt(i35) < 55296) {
                    break;
                }
                i35 = i10;
            }
        } else {
            i10 = 1;
        }
        int i36 = i10 + 1;
        int iCharAt6 = strB.charAt(i10);
        if (iCharAt6 >= 55296) {
            int i37 = iCharAt6 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                cCharAt13 = strB.charAt(i36);
                if (cCharAt13 < 55296) {
                    break;
                }
                i37 |= (cCharAt13 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            iCharAt6 = i37 | (cCharAt13 << i38);
            i36 = i34;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i11 = 0;
            iArr = f10500r;
            i12 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt7 = strB.charAt(i36);
            if (iCharAt7 >= 55296) {
                int i40 = iCharAt7 & 8191;
                int i41 = 13;
                while (true) {
                    i20 = i39 + 1;
                    cCharAt8 = strB.charAt(i39);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i20;
                }
                iCharAt7 = i40 | (cCharAt8 << i41);
                i39 = i20;
            }
            int i42 = i39 + 1;
            int iCharAt8 = strB.charAt(i39);
            if (iCharAt8 >= 55296) {
                int i43 = iCharAt8 & 8191;
                int i44 = 13;
                while (true) {
                    i19 = i42 + 1;
                    cCharAt7 = strB.charAt(i42);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i19;
                }
                iCharAt8 = i43 | (cCharAt7 << i44);
                i42 = i19;
            }
            int i45 = i42 + 1;
            iCharAt = strB.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i18 = i45 + 1;
                    cCharAt6 = strB.charAt(i45);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i18;
                }
                iCharAt = i46 | (cCharAt6 << i47);
                i45 = i18;
            }
            int i48 = i45 + 1;
            iCharAt2 = strB.charAt(i45);
            if (iCharAt2 >= 55296) {
                int i49 = iCharAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i17 = i48 + 1;
                    cCharAt5 = strB.charAt(i48);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i17;
                }
                iCharAt2 = i49 | (cCharAt5 << i50);
                i48 = i17;
            }
            int i51 = i48 + 1;
            iCharAt3 = strB.charAt(i48);
            if (iCharAt3 >= 55296) {
                int i52 = iCharAt3 & 8191;
                int i53 = 13;
                while (true) {
                    i16 = i51 + 1;
                    cCharAt4 = strB.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i16;
                }
                iCharAt3 = i52 | (cCharAt4 << i53);
                i51 = i16;
            }
            int i54 = i51 + 1;
            iCharAt4 = strB.charAt(i51);
            if (iCharAt4 >= 55296) {
                int i55 = iCharAt4 & 8191;
                int i56 = 13;
                while (true) {
                    i15 = i54 + 1;
                    cCharAt3 = strB.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i15;
                }
                iCharAt4 = i55 | (cCharAt3 << i56);
                i54 = i15;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strB.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i14 = i57 + 1;
                    cCharAt2 = strB.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i14;
                }
                iCharAt9 = i58 | (cCharAt2 << i59);
                i57 = i14;
            }
            int i60 = i57 + 1;
            iCharAt5 = strB.charAt(i57);
            if (iCharAt5 >= 55296) {
                int i61 = iCharAt5 & 8191;
                int i62 = 13;
                while (true) {
                    i13 = i60 + 1;
                    cCharAt = strB.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i60 = i13;
                }
                iCharAt5 = i61 | (cCharAt << i62);
                i60 = i13;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i11 = (iCharAt7 * 2) + iCharAt8;
            i12 = iCharAt7;
            i36 = i60;
        }
        Unsafe unsafe = f10501s;
        Object[] objArrA = x1Var.a();
        Class<?> cls = x1Var.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i63 = iCharAt5 + iCharAt4;
        int i64 = iCharAt5;
        int i65 = i63;
        int i66 = 0;
        int i67 = 0;
        while (i36 < length) {
            int i68 = i36 + 1;
            int iCharAt10 = strB.charAt(i36);
            if (iCharAt10 >= c10) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i33 = i70 + 1;
                    cCharAt12 = strB.charAt(i70);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i33;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i21 = i33;
            } else {
                i21 = i68;
            }
            int i72 = i21 + 1;
            int iCharAt11 = strB.charAt(i21);
            if (iCharAt11 >= c10) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i32 = i74 + 1;
                    cCharAt11 = strB.charAt(i74);
                    i22 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i32;
                    length = i22;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i23 = i32;
            } else {
                i22 = length;
                i23 = i72;
            }
            int i76 = iCharAt11 & 255;
            int i77 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i78 = i66;
            if (i76 >= 51) {
                int i79 = i23 + 1;
                int iCharAt12 = strB.charAt(i23);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i80 = iCharAt12 & 8191;
                    int i81 = 13;
                    while (true) {
                        i31 = i79 + 1;
                        cCharAt10 = strB.charAt(i79);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i79 = i31;
                        c11 = 55296;
                    }
                    iCharAt12 = i80 | (cCharAt10 << i81);
                    i79 = i31;
                }
                int i82 = i76 - 51;
                int i83 = i79;
                if (i82 == 9 || i82 == 17) {
                    i28 = i11 + 1;
                    objArr[((i67 / 3) * 2) + 1] = objArrA[i11];
                } else {
                    if (i82 == 12 && !z12) {
                        i28 = i11 + 1;
                        objArr[((i67 / 3) * 2) + 1] = objArrA[i11];
                    }
                    i29 = iCharAt12 * 2;
                    obj = objArrA[i29];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldG1 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldG1 = g0(cls, (String) obj);
                        objArrA[i29] = fieldG1;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG1);
                    i30 = i29 + 1;
                    obj2 = objArrA[i30];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldG2 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldG2 = g0(cls, (String) obj2);
                        objArrA[i30] = fieldG2;
                    }
                    strB = strB;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG2);
                    z12 = z12;
                    i25 = i83;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i26 = 0;
                }
                i11 = i28;
                i29 = iCharAt12 * 2;
                obj = objArrA[i29];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldG1 = (java.lang.reflect.Field) obj;
                } else {
                    fieldG1 = g0(cls, (String) obj);
                    objArrA[i29] = fieldG1;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG1);
                i30 = i29 + 1;
                obj2 = objArrA[i30];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldG2 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldG2 = g0(cls, (String) obj2);
                    objArrA[i30] = fieldG2;
                }
                strB = strB;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG2);
                z12 = z12;
                i25 = i83;
                iObjectFieldOffset = iObjectFieldOffset4;
                i26 = 0;
            } else {
                int i84 = i11 + 1;
                java.lang.reflect.Field fieldG3 = g0(cls, (String) objArrA[i11]);
                if (i76 == 9 || i76 == 17) {
                    z10 = true;
                    objArr[((i67 / 3) * 2) + 1] = fieldG3.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        z10 = true;
                        i27 = i84 + 1;
                        objArr[((i67 / 3) * 2) + 1] = objArrA[i84];
                    } else {
                        if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (!z12) {
                                z10 = true;
                                i27 = i84 + 1;
                                objArr[((i67 / 3) * 2) + 1] = objArrA[i84];
                            }
                        } else if (i76 == 50) {
                            int i85 = i64 + 1;
                            iArr[i64] = i67;
                            int i86 = (i67 / 3) * 2;
                            int i87 = i84 + 1;
                            objArr[i86] = objArrA[i84];
                            if ((iCharAt11 & 2048) != 0) {
                                i84 = i87 + 1;
                                objArr[i86 + 1] = objArrA[i87];
                                i64 = i85;
                            } else {
                                i64 = i85;
                                i24 = i87;
                                z10 = true;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG3);
                            int i88 = i24;
                            if ((iCharAt11 & 4096) == 4096) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (z11 || i76 > 17) {
                                iObjectFieldOffset2 = 1048575;
                                i25 = i23;
                                i26 = 0;
                            } else {
                                int i89 = i23 + 1;
                                int iCharAt13 = strB.charAt(i23);
                                if (iCharAt13 >= 55296) {
                                    int i90 = iCharAt13 & 8191;
                                    int i91 = 13;
                                    while (true) {
                                        i25 = i89 + 1;
                                        cCharAt9 = strB.charAt(i89);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i90 |= (cCharAt9 & 8191) << i91;
                                        i91 += 13;
                                        i89 = i25;
                                    }
                                    iCharAt13 = i90 | (cCharAt9 << i91);
                                } else {
                                    i25 = i89;
                                }
                                int i92 = (i12 * 2) + (iCharAt13 / 32);
                                Object obj3 = objArrA[i92];
                                if (obj3 instanceof java.lang.reflect.Field) {
                                    fieldG0 = (java.lang.reflect.Field) obj3;
                                } else {
                                    fieldG0 = g0(cls, (String) obj3);
                                    objArrA[i92] = fieldG0;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG0);
                                i26 = iCharAt13 % 32;
                            }
                            if (i76 >= 18 && i76 <= 49) {
                                iArr[i65] = iObjectFieldOffset;
                                i65++;
                            }
                            i11 = i88;
                        }
                        z10 = true;
                    }
                    i24 = i27;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG3);
                    int i810 = i24;
                    if ((iCharAt11 & 4096) == 4096) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        iObjectFieldOffset2 = 1048575;
                        i25 = i23;
                        i26 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i25 = i23;
                        i26 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i65] = iObjectFieldOffset;
                        i65++;
                    }
                    i11 = i810;
                }
                i24 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG3);
                int i811 = i24;
                if ((iCharAt11 & 4096) == 4096) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                if (z11) {
                    iObjectFieldOffset2 = 1048575;
                    i25 = i23;
                    i26 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i25 = i23;
                    i26 = 0;
                }
                if (i76 >= 18) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
                i11 = i811;
            }
            int i93 = i67 + 1;
            iArr2[i67] = iCharAt10;
            int i94 = i93 + 1;
            iArr2[i93] = ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i76 << 20) | iObjectFieldOffset;
            i67 = i94 + 1;
            iArr2[i94] = (i26 << 20) | iObjectFieldOffset2;
            z12 = z12;
            iCharAt = iCharAt;
            iCharAt5 = i77;
            length = i22;
            i36 = i25;
            i66 = i78;
            strB = strB;
            iCharAt2 = iCharAt2;
            c10 = 55296;
        }
        return new i1<>(iArr2, objArr, iCharAt, iCharAt2, x1Var.getDefaultInstance(), z12, false, iArr, iCharAt5, i63, l1Var, s0Var, t2Var, zVar, a1Var);
    }

    private int N(int i10) {
        return this.f10502a[i10];
    }

    private static long O(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean P(T t10, long j10) {
        return ((Boolean) z2.G(t10, j10)).booleanValue();
    }

    private static <T> double Q(T t10, long j10) {
        return ((Double) z2.G(t10, j10)).doubleValue();
    }

    private static <T> float R(T t10, long j10) {
        return ((Float) z2.G(t10, j10)).floatValue();
    }

    private static <T> int S(T t10, long j10) {
        return ((Integer) z2.G(t10, j10)).intValue();
    }

    private static <T> long T(T t10, long j10) {
        return ((Long) z2.G(t10, j10)).longValue();
    }

    private <K, V> int U(T t10, byte[] bArr, int i10, int i11, int i12, long j10, g.b bVar) throws IOException {
        Unsafe unsafe = f10501s;
        Object objN = n(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f10518q.isImmutable(object)) {
            Object objNewMapField = this.f10518q.newMapField(objN);
            this.f10518q.mergeFrom(objNewMapField, object);
            unsafe.putObject(t10, j10, objNewMapField);
            object = objNewMapField;
        }
        return f(bArr, i10, i11, this.f10518q.forMapMetadata(objN), this.f10518q.forMutableMapData(object), bVar);
    }

    private int V(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, g.b bVar) throws IOException {
        Unsafe unsafe = f10501s;
        long j11 = this.f10502a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(g.d(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(g.l(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iL = g.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.f10451b));
                unsafe.putInt(t10, j11, i13);
                return iL;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int I = g.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.f10450a));
                unsafe.putInt(t10, j11, i13);
                return I;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(g.j(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(g.h(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iL2 = g.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f10451b != 0));
                unsafe.putInt(t10, j11, i13);
                return iL2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int I2 = g.I(bArr, i10, bVar);
                int i22 = bVar.f10450a;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !a3.t(bArr, I2, I2 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, I2, i22, l0.f10621a));
                    I2 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return I2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iP = g.p(o(i17), bArr, i10, i11, bVar);
                Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object == null) {
                    unsafe.putObject(t10, j10, bVar.f10452c);
                } else {
                    unsafe.putObject(t10, j10, l0.k(object, bVar.f10452c));
                }
                unsafe.putInt(t10, j11, i13);
                return iP;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iB = g.b(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.f10452c);
                unsafe.putInt(t10, j11, i13);
                return iB;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int I3 = g.I(bArr, i10, bVar);
                int i23 = bVar.f10450a;
                l0.e eVarM = m(i17);
                if (eVarM == null || eVarM.isInRange(i23)) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i23));
                    unsafe.putInt(t10, j11, i13);
                } else {
                    p(t10).m(i12, Long.valueOf(i23));
                }
                return I3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int I4 = g.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(n.b(bVar.f10450a)));
                unsafe.putInt(t10, j11, i13);
                return I4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iL3 = g.L(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(n.c(bVar.f10451b)));
                unsafe.putInt(t10, j11, i13);
                return iL3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iN = g.n(o(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(t10, j10, bVar.f10452c);
                } else {
                    unsafe.putObject(t10, j10, l0.k(object2, bVar.f10452c));
                }
                unsafe.putInt(t10, j11, i13);
                return iN;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029c A[PHI: r0 r19 r23 r26 r27 r28
      0x029c: PHI (r0v53 int) = (r0v48 int), (r0v51 int), (r0v55 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r19v5 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r23v3 int) = (r23v1 int), (r23v1 int), (r23v4 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r26v2 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r27v6 int) = (r27v4 int), (r27v4 int), (r27v7 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0305 A[PHI: r0 r19 r23 r26 r27 r28
      0x0305: PHI (r0v52 int) = (r0v48 int), (r0v51 int), (r0v55 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r19v4 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r23v2 int) = (r23v1 int), (r23v1 int), (r23v4 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r26v1 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r27v5 int) = (r27v4 int), (r27v4 int), (r27v7 int) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:112:0x0302, B:107:0x02df, B:100:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0085. Please report as an issue. */
    private int X(T t10, byte[] bArr, int i10, int i11, g.b bVar) throws IOException {
        int i12;
        int iH;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int iL;
        int iP;
        int i19;
        int i20;
        int i21;
        this = this;
        t10 = t10;
        bArr = bArr;
        i11 = i11;
        bVar = bVar;
        Unsafe unsafe2 = f10501s;
        int i22 = -1;
        int iG = i10;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1048575;
        while (iG < i11) {
            int i27 = iG + 1;
            byte b10 = bArr[iG];
            if (b10 < 0) {
                iH = g.H(b10, bArr, i27, bVar);
                i12 = bVar.f10450a;
            } else {
                i12 = b10;
                iH = i27;
            }
            int i28 = i12 >>> 3;
            int i29 = i12 & 7;
            int iA0 = i28 > i23 ? this.a0(i28, i24 / 3) : this.Z(i28);
            if (iA0 == i22) {
                i13 = iH;
                i14 = i28;
                i15 = i22;
                unsafe = unsafe2;
                i16 = 0;
            } else {
                int i30 = this.f10502a[iA0 + 1];
                int iL0 = l0(i30);
                long jO = O(i30);
                if (iL0 <= 17) {
                    int i31 = this.f10502a[iA0 + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = 1048575;
                    int i34 = i31 & 1048575;
                    if (i34 != i26) {
                        if (i26 != 1048575) {
                            unsafe2.putInt(t10, i26, i25);
                            i33 = 1048575;
                        }
                        if (i34 != i33) {
                            i25 = unsafe2.getInt(t10, i34);
                        }
                        i26 = i34;
                    }
                    switch (iL0) {
                        case 0:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            i18 = i25;
                            if (i29 != 1) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                z2.T(t10, jO, g.d(bArr, iH));
                                iG = iH + 8;
                                i25 = i18 | i32;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 1:
                            i14 = i28;
                            i18 = i25;
                            i17 = iA0;
                            if (i29 != 5) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                z2.U(t10, jO, g.l(bArr, iH));
                                iG = iH + 4;
                                i25 = i18 | i32;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            i18 = i25;
                            if (i29 != 0) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                iL = g.L(bArr, iH, bVar);
                                unsafe2.putLong(t10, jO, bVar.f10451b);
                                i25 = i18 | i32;
                                i24 = i17;
                                iG = iL;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            i18 = i25;
                            if (i29 != 0) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                iG = g.I(bArr, iH, bVar);
                                unsafe2.putInt(t10, jO, bVar.f10450a);
                                i25 = i18 | i32;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            i18 = i25;
                            if (i29 != 1) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                unsafe2.putLong(t10, jO, g.j(bArr, iH));
                                iG = iH + 8;
                                i25 = i18 | i32;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i14 = i28;
                            i18 = i25;
                            i17 = iA0;
                            if (i29 != 5) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                unsafe2.putInt(t10, jO, g.h(bArr, iH));
                                iG = iH + 4;
                                i25 = i18 | i32;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 7:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            i18 = i25;
                            if (i29 != 0) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                int iL2 = g.L(bArr, iH, bVar);
                                z2.N(t10, jO, bVar.f10451b != 0);
                                i25 = i18 | i32;
                                iG = iL2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 8:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            i18 = i25;
                            if (i29 != 2) {
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                iG = (536870912 & i30) == 0 ? g.C(bArr, iH, bVar) : g.F(bArr, iH, bVar);
                                unsafe2.putObject(t10, jO, bVar.f10452c);
                                i25 = i18 | i32;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 9:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            if (i29 != 2) {
                                i18 = i25;
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                iP = g.p(this.o(i17), bArr, iH, i11, bVar);
                                Object object = unsafe2.getObject(t10, jO);
                                if (object == null) {
                                    unsafe2.putObject(t10, jO, bVar.f10452c);
                                } else {
                                    unsafe2.putObject(t10, jO, l0.k(object, bVar.f10452c));
                                }
                                i25 |= i32;
                                iG = iP;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 10:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            if (i29 != 2) {
                                i18 = i25;
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                iP = g.b(bArr, iH, bVar);
                                unsafe2.putObject(t10, jO, bVar.f10452c);
                                i25 |= i32;
                                iG = iP;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 12:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            if (i29 != 0) {
                                i18 = i25;
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                iP = g.I(bArr, iH, bVar);
                                unsafe2.putInt(t10, jO, bVar.f10450a);
                                i25 |= i32;
                                iG = iP;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 15:
                            i14 = i28;
                            bVar = bVar;
                            i17 = iA0;
                            if (i29 != 0) {
                                i18 = i25;
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                iG = g.I(bArr, iH, bVar);
                                unsafe2.putInt(t10, jO, n.b(bVar.f10450a));
                                i25 |= i32;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        case 16:
                            if (i29 != 0) {
                                i14 = i28;
                                i17 = iA0;
                                i18 = i25;
                                i25 = i18;
                                i13 = iH;
                                i16 = i17;
                                unsafe = unsafe2;
                                i15 = -1;
                            } else {
                                bVar = bVar;
                                iL = g.L(bArr, iH, bVar);
                                i17 = iA0;
                                i14 = i28;
                                unsafe2.putLong(t10, jO, n.c(bVar.f10451b));
                                i25 |= i32;
                                i24 = i17;
                                iG = iL;
                                i23 = i14;
                                i22 = -1;
                            }
                            break;
                        default:
                            i14 = i28;
                            i17 = iA0;
                            i18 = i25;
                            i25 = i18;
                            i13 = iH;
                            i16 = i17;
                            unsafe = unsafe2;
                            i15 = -1;
                            break;
                    }
                } else {
                    i14 = i28;
                    int i35 = i25;
                    bVar = bVar;
                    if (iL0 != 27) {
                        if (iL0 <= 49) {
                            i20 = i35;
                            int i36 = iH;
                            i19 = i26;
                            i16 = iA0;
                            i15 = -1;
                            unsafe = unsafe2;
                            iG = Y(t10, bArr, iH, i11, i12, i14, i29, iA0, i30, iL0, jO, bVar);
                            if (iG != i36) {
                                i23 = i14;
                                i24 = i16;
                                i25 = i20;
                                i26 = i19;
                            } else {
                                i13 = iG;
                                i25 = i20;
                                i26 = i19;
                            }
                        } else {
                            i19 = i26;
                            i16 = iA0;
                            unsafe = unsafe2;
                            i20 = i35;
                            i15 = -1;
                            i21 = iH;
                            if (iL0 == 50) {
                                if (i29 == 2) {
                                    iG = U(t10, bArr, i21, i11, i16, jO, bVar);
                                    if (iG != i21) {
                                        i23 = i14;
                                        i24 = i16;
                                        i25 = i20;
                                        i26 = i19;
                                    } else {
                                        i13 = iG;
                                    }
                                }
                                i25 = i20;
                                i26 = i19;
                            } else {
                                iG = V(t10, bArr, i21, i11, i12, i14, i29, i30, iL0, jO, i16, bVar);
                                if (iG != i21) {
                                    i23 = i14;
                                    i24 = i16;
                                    i25 = i20;
                                    i26 = i19;
                                } else {
                                    i13 = iG;
                                    i25 = i20;
                                    i26 = i19;
                                }
                            }
                        }
                        i22 = i15;
                        unsafe2 = unsafe;
                    } else if (i29 == 2) {
                        l0.j jVarMutableCopyWithCapacity2 = (l0.j) unsafe2.getObject(t10, jO);
                        if (!jVarMutableCopyWithCapacity2.isModifiable()) {
                            int size = jVarMutableCopyWithCapacity2.size();
                            jVarMutableCopyWithCapacity2 = jVarMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(t10, jO, jVarMutableCopyWithCapacity2);
                        }
                        iG = g.q(this.o(iA0), i12, bArr, iH, i11, jVarMutableCopyWithCapacity2, bVar);
                        i24 = iA0;
                        i25 = i35;
                        i23 = i14;
                        i22 = -1;
                        this = this;
                    } else {
                        i21 = iH;
                        i19 = i26;
                        i16 = iA0;
                        unsafe = unsafe2;
                        i20 = i35;
                        i15 = -1;
                    }
                    i13 = i21;
                    i25 = i20;
                    i26 = i19;
                }
            }
            iG = g.G(i12, bArr, i13, i11, p(t10), bVar);
            i23 = i14;
            i24 = i16;
            i22 = i15;
            unsafe2 = unsafe;
        }
        int i37 = i25;
        Unsafe unsafe3 = unsafe2;
        if (i26 != 1048575) {
            unsafe3.putInt(t10, i26, i37);
        }
        if (iG == i11) {
            return iG;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int Y(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, g.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = f10501s;
        l0.j jVarMutableCopyWithCapacity2 = (l0.j) unsafe.getObject(t10, j11);
        if (!jVarMutableCopyWithCapacity2.isModifiable()) {
            int size = jVarMutableCopyWithCapacity2.size();
            jVarMutableCopyWithCapacity2 = jVarMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, jVarMutableCopyWithCapacity2);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return g.s(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? g.e(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return g.v(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? g.m(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return g.z(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? g.M(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return g.y(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? g.J(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return g.u(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? g.k(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return g.t(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? g.i(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return g.r(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? g.a(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? g.D(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : g.E(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar);
                }
                return i10;
            case 27:
                return i14 == 2 ? g.q(o(i15), i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 28:
                return i14 == 2 ? g.c(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 30:
            case 44:
                if (i14 == 2) {
                    iJ = g.y(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iJ = g.J(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar);
                }
                i0 i0Var = (i0) t10;
                v2 v2Var = i0Var.f10476a;
                if (v2Var == v2.c()) {
                    v2Var = null;
                }
                v2 v2Var2 = (v2) d2.A(i13, jVarMutableCopyWithCapacity2, m(i15), v2Var, this.f10516o);
                if (v2Var2 != null) {
                    i0Var.f10476a = v2Var2;
                }
                return iJ;
            case 33:
            case 47:
                if (i14 == 2) {
                    return g.w(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? g.A(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return g.x(bArr, i10, jVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? g.B(i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            case 49:
                return i14 == 3 ? g.o(o(i15), i12, bArr, i10, i11, jVarMutableCopyWithCapacity2, bVar) : i10;
            default:
                return i10;
        }
    }

    private int Z(int i10) {
        if (i10 < this.f10504c || i10 > this.f10505d) {
            return -1;
        }
        return j0(i10, 0);
    }

    private int a0(int i10, int i11) {
        if (i10 < this.f10504c || i10 > this.f10505d) {
            return -1;
        }
        return j0(i10, i11);
    }

    private int b0(int i10) {
        return this.f10502a[i10 + 2];
    }

    private <E> void c0(Object obj, long j10, y1 y1Var, b2<E> b2Var, y yVar) throws IOException {
        y1Var.d(this.f10515n.e(obj, j10), b2Var, yVar);
    }

    private boolean d(T t10, T t11, int i10) {
        return v(t10, i10) == v(t11, i10);
    }

    private <E> void d0(Object obj, int i10, y1 y1Var, b2<E> b2Var, y yVar) throws IOException {
        y1Var.f(this.f10515n.e(obj, O(i10)), b2Var, yVar);
    }

    private static <T> boolean e(T t10, long j10) {
        return z2.t(t10, j10);
    }

    private void e0(Object obj, int i10, y1 y1Var) throws IOException {
        if (u(i10)) {
            z2.X(obj, O(i10), y1Var.readStringRequireUtf8());
        } else if (this.f10508g) {
            z2.X(obj, O(i10), y1Var.readString());
        } else {
            z2.X(obj, O(i10), y1Var.readBytes());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int f(byte[] bArr, int i10, int i11, x0.b<K, V> bVar, Map<K, V> map, g.b bVar2) throws IOException {
        int iH;
        int I = g.I(bArr, i10, bVar2);
        int i12 = bVar2.f10450a;
        if (i12 < 0 || i12 > i11 - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = I + i12;
        Object obj = bVar.f10865b;
        Object obj2 = bVar.f10867d;
        while (I < i13) {
            int i14 = I + 1;
            int i15 = bArr[I];
            if (i15 < 0) {
                iH = g.H(i15, bArr, i14, bVar2);
                i15 = bVar2.f10450a;
            } else {
                iH = i14;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.f10866c.c()) {
                    I = g(bArr, iH, i11, bVar.f10866c, bVar.f10867d.getClass(), bVar2);
                    obj2 = bVar2.f10452c;
                } else {
                    I = g.N(i15, bArr, iH, i11, bVar2);
                }
            } else if (i17 == bVar.f10864a.c()) {
                I = g(bArr, iH, i11, bVar.f10864a, null, bVar2);
                obj = bVar2.f10452c;
            } else {
                I = g.N(i15, bArr, iH, i11, bVar2);
            }
        }
        if (I != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private void f0(Object obj, int i10, y1 y1Var) throws IOException {
        if (u(i10)) {
            y1Var.readStringListRequireUtf8(this.f10515n.e(obj, O(i10)));
        } else {
            y1Var.readStringList(this.f10515n.e(obj, O(i10)));
        }
    }

    private int g(byte[] bArr, int i10, int i11, c3.b bVar, Class<?> cls, g.b bVar2) throws IOException {
        switch (a.f10519a[bVar.ordinal()]) {
            case 1:
                int iL = g.L(bArr, i10, bVar2);
                bVar2.f10452c = Boolean.valueOf(bVar2.f10451b != 0);
                return iL;
            case 2:
                return g.b(bArr, i10, bVar2);
            case 3:
                bVar2.f10452c = Double.valueOf(g.d(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar2.f10452c = Integer.valueOf(g.h(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar2.f10452c = Long.valueOf(g.j(bArr, i10));
                return i10 + 8;
            case 8:
                bVar2.f10452c = Float.valueOf(g.l(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int I = g.I(bArr, i10, bVar2);
                bVar2.f10452c = Integer.valueOf(bVar2.f10450a);
                return I;
            case 12:
            case 13:
                int iL2 = g.L(bArr, i10, bVar2);
                bVar2.f10452c = Long.valueOf(bVar2.f10451b);
                return iL2;
            case 14:
                return g.p(v1.a().d(cls), bArr, i10, i11, bVar2);
            case 15:
                int I2 = g.I(bArr, i10, bVar2);
                bVar2.f10452c = Integer.valueOf(n.b(bVar2.f10450a));
                return I2;
            case 16:
                int iL3 = g.L(bArr, i10, bVar2);
                bVar2.f10452c = Long.valueOf(n.c(bVar2.f10451b));
                return iL3;
            case 17:
                return g.F(bArr, i10, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static java.lang.reflect.Field g0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double h(T t10, long j10) {
        return z2.A(t10, j10);
    }

    private void h0(T t10, int i10) {
        int iB0 = b0(i10);
        long j10 = 1048575 & iB0;
        if (j10 == 1048575) {
            return;
        }
        z2.V(t10, j10, (1 << (iB0 >>> 20)) | z2.C(t10, j10));
    }

    private boolean i(T t10, T t11, int i10) {
        int iM0 = m0(i10);
        long jO = O(iM0);
        switch (l0(iM0)) {
            case 0:
                return d(t10, t11, i10) && Double.doubleToLongBits(z2.A(t10, jO)) == Double.doubleToLongBits(z2.A(t11, jO));
            case 1:
                return d(t10, t11, i10) && Float.floatToIntBits(z2.B(t10, jO)) == Float.floatToIntBits(z2.B(t11, jO));
            case 2:
                return d(t10, t11, i10) && z2.E(t10, jO) == z2.E(t11, jO);
            case 3:
                return d(t10, t11, i10) && z2.E(t10, jO) == z2.E(t11, jO);
            case 4:
                return d(t10, t11, i10) && z2.C(t10, jO) == z2.C(t11, jO);
            case 5:
                return d(t10, t11, i10) && z2.E(t10, jO) == z2.E(t11, jO);
            case 6:
                return d(t10, t11, i10) && z2.C(t10, jO) == z2.C(t11, jO);
            case 7:
                return d(t10, t11, i10) && z2.t(t10, jO) == z2.t(t11, jO);
            case 8:
                return d(t10, t11, i10) && d2.L(z2.G(t10, jO), z2.G(t11, jO));
            case 9:
                return d(t10, t11, i10) && d2.L(z2.G(t10, jO), z2.G(t11, jO));
            case 10:
                return d(t10, t11, i10) && d2.L(z2.G(t10, jO), z2.G(t11, jO));
            case 11:
                return d(t10, t11, i10) && z2.C(t10, jO) == z2.C(t11, jO);
            case 12:
                return d(t10, t11, i10) && z2.C(t10, jO) == z2.C(t11, jO);
            case 13:
                return d(t10, t11, i10) && z2.C(t10, jO) == z2.C(t11, jO);
            case 14:
                return d(t10, t11, i10) && z2.E(t10, jO) == z2.E(t11, jO);
            case 15:
                return d(t10, t11, i10) && z2.C(t10, jO) == z2.C(t11, jO);
            case 16:
                return d(t10, t11, i10) && z2.E(t10, jO) == z2.E(t11, jO);
            case 17:
                return d(t10, t11, i10) && d2.L(z2.G(t10, jO), z2.G(t11, jO));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return d2.L(z2.G(t10, jO), z2.G(t11, jO));
            case 50:
                return d2.L(z2.G(t10, jO), z2.G(t11, jO));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return A(t10, t11, i10) && d2.L(z2.G(t10, jO), z2.G(t11, jO));
            default:
                return true;
        }
    }

    private void i0(T t10, int i10, int i11) {
        z2.V(t10, b0(i11) & 1048575, i10);
    }

    private final <UT, UB> UB j(Object obj, int i10, UB ub2, t2<UT, UB> t2Var) {
        l0.e eVarM;
        int iN = N(i10);
        Object objG = z2.G(obj, O(m0(i10)));
        return (objG == null || (eVarM = m(i10)) == null) ? ub2 : (UB) k(i10, iN, this.f10518q.forMutableMapData(objG), eVarM, ub2, t2Var);
    }

    private int j0(int i10, int i11) {
        int length = (this.f10502a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iN = N(i13);
            if (i10 == iN) {
                return i13;
            }
            if (i10 < iN) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB k(int i10, int i11, Map<K, V> map, l0.e eVar, UB ub2, t2<UT, UB> t2Var) {
        x0.b<?, ?> bVarForMapMetadata = this.f10518q.forMapMetadata(n(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = t2Var.n();
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(x0.b(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    x0.f(codedBuilderNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, next.getKey(), next.getValue());
                    t2Var.d(ub2, i11, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void k0(d0 d0Var, int[] iArr, int i10, Object[] objArr) {
        int iM;
        int iC;
        long jM;
        int iM2;
        int iNumberOfTrailingZeros;
        int i11;
        Class<?> clsR;
        int i12;
        q1 q1VarS = d0Var.s();
        if (q1VarS == null) {
            f0 f0VarV = d0Var.v();
            iM = (int) z2.M(d0Var.o());
            iC = f0VarV.c();
            if (!f0VarV.e() && !f0VarV.g()) {
                java.lang.reflect.Field fieldT = d0Var.t();
                iM2 = fieldT == null ? 1048575 : (int) z2.M(fieldT);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(d0Var.u());
            } else if (d0Var.m() == null) {
                iM2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jM = z2.M(d0Var.m());
            }
            iArr[i10] = d0Var.p();
            int i13 = i10 + 1;
            if (d0Var.w()) {
                i11 = 536870912;
            } else {
                i11 = 0;
            }
            iArr[i13] = (d0Var.y() ? 268435456 : 0) | i11 | (iC << 20) | iM;
            iArr[i10 + 2] = iM2 | (iNumberOfTrailingZeros << 20);
            clsR = d0Var.r();
            if (d0Var.q() != null) {
                if (clsR != null) {
                    objArr[((i10 / 3) * 2) + 1] = clsR;
                    return;
                } else {
                    if (d0Var.n() != null) {
                        objArr[((i10 / 3) * 2) + 1] = d0Var.n();
                        return;
                    }
                    return;
                }
            }
            i12 = (i10 / 3) * 2;
            objArr[i12] = d0Var.q();
            if (clsR != null) {
                objArr[i12 + 1] = clsR;
            } else if (d0Var.n() != null) {
                objArr[i12 + 1] = d0Var.n();
            }
        }
        iC = d0Var.v().c() + 51;
        iM = (int) z2.M(q1VarS.b());
        jM = z2.M(q1VarS.a());
        iM2 = (int) jM;
        iNumberOfTrailingZeros = 0;
        iArr[i10] = d0Var.p();
        int i14 = i10 + 1;
        if (d0Var.w()) {
            i11 = 536870912;
        } else {
            i11 = 0;
        }
        iArr[i14] = (d0Var.y() ? 268435456 : 0) | i11 | (iC << 20) | iM;
        iArr[i10 + 2] = iM2 | (iNumberOfTrailingZeros << 20);
        clsR = d0Var.r();
        if (d0Var.q() != null) {
            if (clsR != null) {
                objArr[((i10 / 3) * 2) + 1] = clsR;
                return;
            } else {
                if (d0Var.n() != null) {
                    objArr[((i10 / 3) * 2) + 1] = d0Var.n();
                    return;
                }
                return;
            }
        }
        i12 = (i10 / 3) * 2;
        objArr[i12] = d0Var.q();
        if (clsR != null) {
            objArr[i12 + 1] = clsR;
        } else if (d0Var.n() != null) {
            objArr[i12 + 1] = d0Var.n();
        }
    }

    private static <T> float l(T t10, long j10) {
        return z2.B(t10, j10);
    }

    private static int l0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private l0.e m(int i10) {
        return (l0.e) this.f10503b[((i10 / 3) * 2) + 1];
    }

    private int m0(int i10) {
        return this.f10502a[i10 + 1];
    }

    private Object n(int i10) {
        return this.f10503b[(i10 / 3) * 2];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void n0(T t10, e3 e3Var) throws IOException {
        Iterator itG;
        Map.Entry<?, ?> entry;
        int i10;
        if (this.f10507f) {
            e0<T> e0VarC = this.f10517p.c(t10);
            if (e0VarC.B()) {
                itG = null;
                entry = null;
            } else {
                itG = e0VarC.G();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        int length = this.f10502a.length;
        Unsafe unsafe = f10501s;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iM0 = m0(i13);
            int iN = N(i13);
            int iL0 = l0(iM0);
            if (iL0 <= 17) {
                int i15 = this.f10502a[i13 + 2];
                int i16 = i15 & i11;
                if (i16 != i12) {
                    i14 = unsafe.getInt(t10, i16);
                    i12 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i10 = 0;
            }
            while (entry != null && this.f10517p.a(entry) <= iN) {
                this.f10517p.j(e3Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            long jO = O(iM0);
            switch (iL0) {
                case 0:
                    if ((i10 & i14) != 0) {
                        e3Var.writeDouble(iN, h(t10, jO));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if ((i10 & i14) != 0) {
                        e3Var.writeFloat(iN, l(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if ((i10 & i14) != 0) {
                        e3Var.writeInt64(iN, unsafe.getLong(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if ((i10 & i14) != 0) {
                        e3Var.writeUInt64(iN, unsafe.getLong(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if ((i10 & i14) != 0) {
                        e3Var.writeInt32(iN, unsafe.getInt(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if ((i10 & i14) != 0) {
                        e3Var.writeFixed64(iN, unsafe.getLong(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if ((i10 & i14) != 0) {
                        e3Var.writeFixed32(iN, unsafe.getInt(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if ((i10 & i14) != 0) {
                        e3Var.writeBool(iN, e(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if ((i10 & i14) != 0) {
                        r0(iN, unsafe.getObject(t10, jO), e3Var);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if ((i10 & i14) != 0) {
                        e3Var.f(iN, unsafe.getObject(t10, jO), o(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if ((i10 & i14) != 0) {
                        e3Var.c(iN, (ByteString) unsafe.getObject(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if ((i10 & i14) != 0) {
                        e3Var.writeUInt32(iN, unsafe.getInt(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if ((i10 & i14) != 0) {
                        e3Var.writeEnum(iN, unsafe.getInt(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if ((i10 & i14) != 0) {
                        e3Var.writeSFixed32(iN, unsafe.getInt(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 14:
                    if ((i10 & i14) != 0) {
                        e3Var.writeSFixed64(iN, unsafe.getLong(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if ((i10 & i14) != 0) {
                        e3Var.writeSInt32(iN, unsafe.getInt(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        e3Var.writeSInt64(iN, unsafe.getLong(t10, jO));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 17:
                    if ((i10 & i14) != 0) {
                        e3Var.a(iN, unsafe.getObject(t10, jO), o(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 18:
                    d2.R(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 19:
                    d2.V(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 20:
                    d2.Z(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 21:
                    d2.i0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 22:
                    d2.Y(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    d2.U(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    d2.T(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 25:
                    d2.P(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 26:
                    d2.g0(N(i13), (List) unsafe.getObject(t10, jO), e3Var);
                    break;
                case 27:
                    d2.b0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, o(i13));
                    break;
                case 28:
                    d2.Q(N(i13), (List) unsafe.getObject(t10, jO), e3Var);
                    break;
                case 29:
                    d2.h0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 30:
                    d2.S(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    d2.c0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 32:
                    d2.d0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    d2.e0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    d2.f0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 35:
                    d2.R(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 36:
                    d2.V(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 37:
                    d2.Z(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 38:
                    d2.i0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 39:
                    d2.Y(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 40:
                    d2.U(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 41:
                    d2.T(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 42:
                    d2.P(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 43:
                    d2.h0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 44:
                    d2.S(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 45:
                    d2.c0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 46:
                    d2.d0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 47:
                    d2.e0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 48:
                    d2.f0(N(i13), (List) unsafe.getObject(t10, jO), e3Var, true);
                    break;
                case 49:
                    d2.X(N(i13), (List) unsafe.getObject(t10, jO), e3Var, o(i13));
                    break;
                case 50:
                    q0(e3Var, iN, unsafe.getObject(t10, jO), i13);
                    break;
                case 51:
                    if (B(t10, iN, i13)) {
                        e3Var.writeDouble(iN, Q(t10, jO));
                    }
                    break;
                case 52:
                    if (B(t10, iN, i13)) {
                        e3Var.writeFloat(iN, R(t10, jO));
                    }
                    break;
                case 53:
                    if (B(t10, iN, i13)) {
                        e3Var.writeInt64(iN, T(t10, jO));
                    }
                    break;
                case 54:
                    if (B(t10, iN, i13)) {
                        e3Var.writeUInt64(iN, T(t10, jO));
                    }
                    break;
                case 55:
                    if (B(t10, iN, i13)) {
                        e3Var.writeInt32(iN, S(t10, jO));
                    }
                    break;
                case 56:
                    if (B(t10, iN, i13)) {
                        e3Var.writeFixed64(iN, T(t10, jO));
                    }
                    break;
                case 57:
                    if (B(t10, iN, i13)) {
                        e3Var.writeFixed32(iN, S(t10, jO));
                    }
                    break;
                case 58:
                    if (B(t10, iN, i13)) {
                        e3Var.writeBool(iN, P(t10, jO));
                    }
                    break;
                case 59:
                    if (B(t10, iN, i13)) {
                        r0(iN, unsafe.getObject(t10, jO), e3Var);
                    }
                    break;
                case 60:
                    if (B(t10, iN, i13)) {
                        e3Var.f(iN, unsafe.getObject(t10, jO), o(i13));
                    }
                    break;
                case 61:
                    if (B(t10, iN, i13)) {
                        e3Var.c(iN, (ByteString) unsafe.getObject(t10, jO));
                    }
                    break;
                case 62:
                    if (B(t10, iN, i13)) {
                        e3Var.writeUInt32(iN, S(t10, jO));
                    }
                    break;
                case 63:
                    if (B(t10, iN, i13)) {
                        e3Var.writeEnum(iN, S(t10, jO));
                    }
                    break;
                case 64:
                    if (B(t10, iN, i13)) {
                        e3Var.writeSFixed32(iN, S(t10, jO));
                    }
                    break;
                case 65:
                    if (B(t10, iN, i13)) {
                        e3Var.writeSFixed64(iN, T(t10, jO));
                    }
                    break;
                case 66:
                    if (B(t10, iN, i13)) {
                        e3Var.writeSInt32(iN, S(t10, jO));
                    }
                    break;
                case 67:
                    if (B(t10, iN, i13)) {
                        e3Var.writeSInt64(iN, T(t10, jO));
                    }
                    break;
                case 68:
                    if (B(t10, iN, i13)) {
                        e3Var.a(iN, unsafe.getObject(t10, jO), o(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        while (entry != null) {
            this.f10517p.j(e3Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
        s0(this.f10516o, t10, e3Var);
    }

    private b2 o(int i10) {
        int i11 = (i10 / 3) * 2;
        b2 b2Var = (b2) this.f10503b[i11];
        if (b2Var != null) {
            return b2Var;
        }
        b2<T> b2VarD = v1.a().d((Class) this.f10503b[i11 + 1]);
        this.f10503b[i11] = b2VarD;
        return b2VarD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void o0(T t10, e3 e3Var) throws IOException {
        Iterator itG;
        Map.Entry<?, ?> entry;
        if (this.f10507f) {
            e0<T> e0VarC = this.f10517p.c(t10);
            if (e0VarC.B()) {
                itG = null;
                entry = null;
            } else {
                itG = e0VarC.G();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        int length = this.f10502a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iM0 = m0(i10);
            int iN = N(i10);
            while (entry != null && this.f10517p.a(entry) <= iN) {
                this.f10517p.j(e3Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (l0(iM0)) {
                case 0:
                    if (v(t10, i10)) {
                        e3Var.writeDouble(iN, h(t10, O(iM0)));
                    }
                    break;
                case 1:
                    if (v(t10, i10)) {
                        e3Var.writeFloat(iN, l(t10, O(iM0)));
                    }
                    break;
                case 2:
                    if (v(t10, i10)) {
                        e3Var.writeInt64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 3:
                    if (v(t10, i10)) {
                        e3Var.writeUInt64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 4:
                    if (v(t10, i10)) {
                        e3Var.writeInt32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 5:
                    if (v(t10, i10)) {
                        e3Var.writeFixed64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 6:
                    if (v(t10, i10)) {
                        e3Var.writeFixed32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 7:
                    if (v(t10, i10)) {
                        e3Var.writeBool(iN, e(t10, O(iM0)));
                    }
                    break;
                case 8:
                    if (v(t10, i10)) {
                        r0(iN, z2.G(t10, O(iM0)), e3Var);
                    }
                    break;
                case 9:
                    if (v(t10, i10)) {
                        e3Var.f(iN, z2.G(t10, O(iM0)), o(i10));
                    }
                    break;
                case 10:
                    if (v(t10, i10)) {
                        e3Var.c(iN, (ByteString) z2.G(t10, O(iM0)));
                    }
                    break;
                case 11:
                    if (v(t10, i10)) {
                        e3Var.writeUInt32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 12:
                    if (v(t10, i10)) {
                        e3Var.writeEnum(iN, t(t10, O(iM0)));
                    }
                    break;
                case 13:
                    if (v(t10, i10)) {
                        e3Var.writeSFixed32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 14:
                    if (v(t10, i10)) {
                        e3Var.writeSFixed64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 15:
                    if (v(t10, i10)) {
                        e3Var.writeSInt32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 16:
                    if (v(t10, i10)) {
                        e3Var.writeSInt64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 17:
                    if (v(t10, i10)) {
                        e3Var.a(iN, z2.G(t10, O(iM0)), o(i10));
                    }
                    break;
                case 18:
                    d2.R(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 19:
                    d2.V(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 20:
                    d2.Z(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 21:
                    d2.i0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 22:
                    d2.Y(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 23:
                    d2.U(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 24:
                    d2.T(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 25:
                    d2.P(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 26:
                    d2.g0(N(i10), (List) z2.G(t10, O(iM0)), e3Var);
                    break;
                case 27:
                    d2.b0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, o(i10));
                    break;
                case 28:
                    d2.Q(N(i10), (List) z2.G(t10, O(iM0)), e3Var);
                    break;
                case 29:
                    d2.h0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 30:
                    d2.S(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 31:
                    d2.c0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 32:
                    d2.d0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 33:
                    d2.e0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 34:
                    d2.f0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 35:
                    d2.R(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 36:
                    d2.V(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 37:
                    d2.Z(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 38:
                    d2.i0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 39:
                    d2.Y(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 40:
                    d2.U(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 41:
                    d2.T(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 42:
                    d2.P(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 43:
                    d2.h0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 44:
                    d2.S(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 45:
                    d2.c0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 46:
                    d2.d0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 47:
                    d2.e0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 48:
                    d2.f0(N(i10), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 49:
                    d2.X(N(i10), (List) z2.G(t10, O(iM0)), e3Var, o(i10));
                    break;
                case 50:
                    q0(e3Var, iN, z2.G(t10, O(iM0)), i10);
                    break;
                case 51:
                    if (B(t10, iN, i10)) {
                        e3Var.writeDouble(iN, Q(t10, O(iM0)));
                    }
                    break;
                case 52:
                    if (B(t10, iN, i10)) {
                        e3Var.writeFloat(iN, R(t10, O(iM0)));
                    }
                    break;
                case 53:
                    if (B(t10, iN, i10)) {
                        e3Var.writeInt64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 54:
                    if (B(t10, iN, i10)) {
                        e3Var.writeUInt64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 55:
                    if (B(t10, iN, i10)) {
                        e3Var.writeInt32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 56:
                    if (B(t10, iN, i10)) {
                        e3Var.writeFixed64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 57:
                    if (B(t10, iN, i10)) {
                        e3Var.writeFixed32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 58:
                    if (B(t10, iN, i10)) {
                        e3Var.writeBool(iN, P(t10, O(iM0)));
                    }
                    break;
                case 59:
                    if (B(t10, iN, i10)) {
                        r0(iN, z2.G(t10, O(iM0)), e3Var);
                    }
                    break;
                case 60:
                    if (B(t10, iN, i10)) {
                        e3Var.f(iN, z2.G(t10, O(iM0)), o(i10));
                    }
                    break;
                case 61:
                    if (B(t10, iN, i10)) {
                        e3Var.c(iN, (ByteString) z2.G(t10, O(iM0)));
                    }
                    break;
                case 62:
                    if (B(t10, iN, i10)) {
                        e3Var.writeUInt32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 63:
                    if (B(t10, iN, i10)) {
                        e3Var.writeEnum(iN, S(t10, O(iM0)));
                    }
                    break;
                case 64:
                    if (B(t10, iN, i10)) {
                        e3Var.writeSFixed32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 65:
                    if (B(t10, iN, i10)) {
                        e3Var.writeSFixed64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 66:
                    if (B(t10, iN, i10)) {
                        e3Var.writeSInt32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 67:
                    if (B(t10, iN, i10)) {
                        e3Var.writeSInt64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 68:
                    if (B(t10, iN, i10)) {
                        e3Var.a(iN, z2.G(t10, O(iM0)), o(i10));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f10517p.j(e3Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
        s0(this.f10516o, t10, e3Var);
    }

    static v2 p(Object obj) {
        i0 i0Var = (i0) obj;
        v2 v2Var = i0Var.f10476a;
        if (v2Var != v2.c()) {
            return v2Var;
        }
        v2 v2VarJ = v2.j();
        i0Var.f10476a = v2VarJ;
        return v2VarJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void p0(T t10, e3 e3Var) throws IOException {
        Iterator itQ;
        Map.Entry<?, ?> entry;
        s0(this.f10516o, t10, e3Var);
        if (this.f10507f) {
            e0<T> e0VarC = this.f10517p.c(t10);
            if (e0VarC.B()) {
                itQ = null;
                entry = null;
            } else {
                itQ = e0VarC.q();
                entry = (Map.Entry) itQ.next();
            }
        } else {
            itQ = null;
            entry = null;
        }
        for (int length = this.f10502a.length - 3; length >= 0; length -= 3) {
            int iM0 = m0(length);
            int iN = N(length);
            while (entry != null && this.f10517p.a(entry) > iN) {
                this.f10517p.j(e3Var, entry);
                entry = itQ.hasNext() ? (Map.Entry) itQ.next() : null;
            }
            switch (l0(iM0)) {
                case 0:
                    if (v(t10, length)) {
                        e3Var.writeDouble(iN, h(t10, O(iM0)));
                    }
                    break;
                case 1:
                    if (v(t10, length)) {
                        e3Var.writeFloat(iN, l(t10, O(iM0)));
                    }
                    break;
                case 2:
                    if (v(t10, length)) {
                        e3Var.writeInt64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 3:
                    if (v(t10, length)) {
                        e3Var.writeUInt64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 4:
                    if (v(t10, length)) {
                        e3Var.writeInt32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 5:
                    if (v(t10, length)) {
                        e3Var.writeFixed64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 6:
                    if (v(t10, length)) {
                        e3Var.writeFixed32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 7:
                    if (v(t10, length)) {
                        e3Var.writeBool(iN, e(t10, O(iM0)));
                    }
                    break;
                case 8:
                    if (v(t10, length)) {
                        r0(iN, z2.G(t10, O(iM0)), e3Var);
                    }
                    break;
                case 9:
                    if (v(t10, length)) {
                        e3Var.f(iN, z2.G(t10, O(iM0)), o(length));
                    }
                    break;
                case 10:
                    if (v(t10, length)) {
                        e3Var.c(iN, (ByteString) z2.G(t10, O(iM0)));
                    }
                    break;
                case 11:
                    if (v(t10, length)) {
                        e3Var.writeUInt32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 12:
                    if (v(t10, length)) {
                        e3Var.writeEnum(iN, t(t10, O(iM0)));
                    }
                    break;
                case 13:
                    if (v(t10, length)) {
                        e3Var.writeSFixed32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 14:
                    if (v(t10, length)) {
                        e3Var.writeSFixed64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 15:
                    if (v(t10, length)) {
                        e3Var.writeSInt32(iN, t(t10, O(iM0)));
                    }
                    break;
                case 16:
                    if (v(t10, length)) {
                        e3Var.writeSInt64(iN, E(t10, O(iM0)));
                    }
                    break;
                case 17:
                    if (v(t10, length)) {
                        e3Var.a(iN, z2.G(t10, O(iM0)), o(length));
                    }
                    break;
                case 18:
                    d2.R(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 19:
                    d2.V(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 20:
                    d2.Z(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 21:
                    d2.i0(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 22:
                    d2.Y(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 23:
                    d2.U(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 24:
                    d2.T(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 25:
                    d2.P(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 26:
                    d2.g0(N(length), (List) z2.G(t10, O(iM0)), e3Var);
                    break;
                case 27:
                    d2.b0(N(length), (List) z2.G(t10, O(iM0)), e3Var, o(length));
                    break;
                case 28:
                    d2.Q(N(length), (List) z2.G(t10, O(iM0)), e3Var);
                    break;
                case 29:
                    d2.h0(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 30:
                    d2.S(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 31:
                    d2.c0(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 32:
                    d2.d0(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 33:
                    d2.e0(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 34:
                    d2.f0(N(length), (List) z2.G(t10, O(iM0)), e3Var, false);
                    break;
                case 35:
                    d2.R(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 36:
                    d2.V(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 37:
                    d2.Z(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 38:
                    d2.i0(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 39:
                    d2.Y(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 40:
                    d2.U(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 41:
                    d2.T(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 42:
                    d2.P(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 43:
                    d2.h0(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 44:
                    d2.S(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 45:
                    d2.c0(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 46:
                    d2.d0(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 47:
                    d2.e0(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 48:
                    d2.f0(N(length), (List) z2.G(t10, O(iM0)), e3Var, true);
                    break;
                case 49:
                    d2.X(N(length), (List) z2.G(t10, O(iM0)), e3Var, o(length));
                    break;
                case 50:
                    q0(e3Var, iN, z2.G(t10, O(iM0)), length);
                    break;
                case 51:
                    if (B(t10, iN, length)) {
                        e3Var.writeDouble(iN, Q(t10, O(iM0)));
                    }
                    break;
                case 52:
                    if (B(t10, iN, length)) {
                        e3Var.writeFloat(iN, R(t10, O(iM0)));
                    }
                    break;
                case 53:
                    if (B(t10, iN, length)) {
                        e3Var.writeInt64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 54:
                    if (B(t10, iN, length)) {
                        e3Var.writeUInt64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 55:
                    if (B(t10, iN, length)) {
                        e3Var.writeInt32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 56:
                    if (B(t10, iN, length)) {
                        e3Var.writeFixed64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 57:
                    if (B(t10, iN, length)) {
                        e3Var.writeFixed32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 58:
                    if (B(t10, iN, length)) {
                        e3Var.writeBool(iN, P(t10, O(iM0)));
                    }
                    break;
                case 59:
                    if (B(t10, iN, length)) {
                        r0(iN, z2.G(t10, O(iM0)), e3Var);
                    }
                    break;
                case 60:
                    if (B(t10, iN, length)) {
                        e3Var.f(iN, z2.G(t10, O(iM0)), o(length));
                    }
                    break;
                case 61:
                    if (B(t10, iN, length)) {
                        e3Var.c(iN, (ByteString) z2.G(t10, O(iM0)));
                    }
                    break;
                case 62:
                    if (B(t10, iN, length)) {
                        e3Var.writeUInt32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 63:
                    if (B(t10, iN, length)) {
                        e3Var.writeEnum(iN, S(t10, O(iM0)));
                    }
                    break;
                case 64:
                    if (B(t10, iN, length)) {
                        e3Var.writeSFixed32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 65:
                    if (B(t10, iN, length)) {
                        e3Var.writeSFixed64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 66:
                    if (B(t10, iN, length)) {
                        e3Var.writeSInt32(iN, S(t10, O(iM0)));
                    }
                    break;
                case 67:
                    if (B(t10, iN, length)) {
                        e3Var.writeSInt64(iN, T(t10, O(iM0)));
                    }
                    break;
                case 68:
                    if (B(t10, iN, length)) {
                        e3Var.a(iN, z2.G(t10, O(iM0)), o(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f10517p.j(e3Var, entry);
            entry = itQ.hasNext() ? (Map.Entry) itQ.next() : null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:185:0x0420 A[PHI: r6
      0x0420: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v8 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v9 int)
      (r6v1 int)
     binds: [B:20:0x005d, B:224:0x04c7, B:221:0x04bc, B:215:0x04a0, B:212:0x048f, B:209:0x0480, B:206:0x0473, B:203:0x0466, B:199:0x045b, B:196:0x0452, B:193:0x0445, B:190:0x0438, B:187:0x0425, B:160:0x0332, B:154:0x0315, B:148:0x02f8, B:142:0x02db, B:136:0x02bd, B:130:0x029f, B:124:0x0281, B:118:0x0263, B:112:0x0245, B:106:0x0227, B:100:0x0209, B:94:0x01eb, B:88:0x01cd, B:82:0x01af, B:77:0x017b, B:74:0x016f, B:71:0x015f, B:68:0x014f, B:65:0x013f, B:62:0x0133, B:59:0x0126, B:56:0x0119, B:50:0x00fb, B:47:0x00e7, B:44:0x00d5, B:41:0x00c5, B:38:0x00b5, B:201:0x0462, B:35:0x00a8, B:32:0x009c, B:29:0x008c, B:26:0x007c, B:184:0x041f, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private int q(T t10) {
        int i10;
        int i11;
        int iJ;
        int iE;
        int iN;
        boolean z10;
        int iF;
        int i12;
        int iX;
        int iZ;
        Unsafe unsafe = f10501s;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.f10502a.length) {
            int iM0 = m0(i15);
            int iN2 = N(i15);
            int iL0 = l0(iM0);
            if (iL0 <= 17) {
                i10 = this.f10502a[i15 + 2];
                int i18 = i10 & i13;
                i11 = 1 << (i10 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(t10, i18);
                    i14 = i18;
                }
            } else {
                i10 = (!this.f10510i || iL0 < f0.O.c() || iL0 > f0.f10388b0.c()) ? 0 : this.f10502a[i15 + 2] & i13;
                i11 = 0;
            }
            long jO = O(iM0);
            switch (iL0) {
                case 0:
                    if ((i17 & i11) != 0) {
                        iJ = CodedOutputStream.j(iN2, 0.0d);
                        i16 += iJ;
                    }
                    break;
                case 1:
                    if ((i17 & i11) != 0) {
                        iJ = CodedOutputStream.r(iN2, 0.0f);
                        i16 += iJ;
                    }
                    break;
                case 2:
                    if ((i17 & i11) != 0) {
                        iJ = CodedOutputStream.z(iN2, unsafe.getLong(t10, jO));
                        i16 += iJ;
                    }
                    break;
                case 3:
                    if ((i17 & i11) != 0) {
                        iJ = CodedOutputStream.a0(iN2, unsafe.getLong(t10, jO));
                        i16 += iJ;
                    }
                    break;
                case 4:
                    if ((i17 & i11) != 0) {
                        iJ = CodedOutputStream.x(iN2, unsafe.getInt(t10, jO));
                        i16 += iJ;
                    }
                    break;
                case 5:
                    if ((i17 & i11) != 0) {
                        iJ = CodedOutputStream.p(iN2, 0L);
                        i16 += iJ;
                    }
                    break;
                case 6:
                    if ((i17 & i11) != 0) {
                        iJ = CodedOutputStream.n(iN2, 0);
                        i16 += iJ;
                    }
                    break;
                case 7:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.e(iN2, true);
                        i16 += iE;
                    }
                    break;
                case 8:
                    if ((i17 & i11) != 0) {
                        Object object = unsafe.getObject(t10, jO);
                        iE = object instanceof ByteString ? CodedOutputStream.h(iN2, (ByteString) object) : CodedOutputStream.V(iN2, (String) object);
                        i16 += iE;
                    }
                    break;
                case 9:
                    if ((i17 & i11) != 0) {
                        iE = d2.o(iN2, unsafe.getObject(t10, jO), o(i15));
                        i16 += iE;
                    }
                    break;
                case 10:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.h(iN2, (ByteString) unsafe.getObject(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 11:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.Y(iN2, unsafe.getInt(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 12:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.l(iN2, unsafe.getInt(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 13:
                    if ((i17 & i11) != 0) {
                        iN = CodedOutputStream.N(iN2, 0);
                        i16 += iN;
                    }
                    break;
                case 14:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.P(iN2, 0L);
                        i16 += iE;
                    }
                    break;
                case 15:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.R(iN2, unsafe.getInt(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 16:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.T(iN2, unsafe.getLong(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 17:
                    if ((i17 & i11) != 0) {
                        iE = CodedOutputStream.u(iN2, (MessageLite) unsafe.getObject(t10, jO), o(i15));
                        i16 += iE;
                    }
                    break;
                case 18:
                    iE = d2.h(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iE;
                    break;
                case 19:
                    z10 = false;
                    iF = d2.f(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = d2.m(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = d2.x(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 22:
                    z10 = false;
                    iF = d2.k(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = d2.h(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = d2.f(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = d2.a(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 26:
                    iE = d2.u(iN2, (List) unsafe.getObject(t10, jO));
                    i16 += iE;
                    break;
                case 27:
                    iE = d2.p(iN2, (List) unsafe.getObject(t10, jO), o(i15));
                    i16 += iE;
                    break;
                case 28:
                    iE = d2.c(iN2, (List) unsafe.getObject(t10, jO));
                    i16 += iE;
                    break;
                case 29:
                    iE = d2.v(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iE;
                    break;
                case 30:
                    z10 = false;
                    iF = d2.d(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = d2.f(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = d2.h(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = d2.q(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = d2.s(iN2, (List) unsafe.getObject(t10, jO), false);
                    i16 += iF;
                    break;
                case 35:
                    i12 = d2.i((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 36:
                    i12 = d2.g((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 37:
                    i12 = d2.n((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 38:
                    i12 = d2.y((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 39:
                    i12 = d2.l((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 40:
                    i12 = d2.i((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 41:
                    i12 = d2.g((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 42:
                    i12 = d2.b((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 43:
                    i12 = d2.w((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 44:
                    i12 = d2.e((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 45:
                    i12 = d2.g((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 46:
                    i12 = d2.i((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 47:
                    i12 = d2.r((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 48:
                    i12 = d2.t((List) unsafe.getObject(t10, jO));
                    if (i12 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        iX = CodedOutputStream.X(iN2);
                        iZ = CodedOutputStream.Z(i12);
                        iN = iX + iZ + i12;
                        i16 += iN;
                    }
                    break;
                case 49:
                    iE = d2.j(iN2, (List) unsafe.getObject(t10, jO), o(i15));
                    i16 += iE;
                    break;
                case 50:
                    iE = this.f10518q.getSerializedSize(iN2, unsafe.getObject(t10, jO), n(i15));
                    i16 += iE;
                    break;
                case 51:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.j(iN2, 0.0d);
                        i16 += iE;
                    }
                    break;
                case 52:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.r(iN2, 0.0f);
                        i16 += iE;
                    }
                    break;
                case 53:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.z(iN2, T(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 54:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.a0(iN2, T(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 55:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.x(iN2, S(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 56:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.p(iN2, 0L);
                        i16 += iE;
                    }
                    break;
                case 57:
                    if (B(t10, iN2, i15)) {
                        iN = CodedOutputStream.n(iN2, 0);
                        i16 += iN;
                    }
                    break;
                case 58:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.e(iN2, true);
                        i16 += iE;
                    }
                    break;
                case 59:
                    if (B(t10, iN2, i15)) {
                        Object object2 = unsafe.getObject(t10, jO);
                        iE = object2 instanceof ByteString ? CodedOutputStream.h(iN2, (ByteString) object2) : CodedOutputStream.V(iN2, (String) object2);
                        i16 += iE;
                    }
                    break;
                case 60:
                    if (B(t10, iN2, i15)) {
                        iE = d2.o(iN2, unsafe.getObject(t10, jO), o(i15));
                        i16 += iE;
                    }
                    break;
                case 61:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.h(iN2, (ByteString) unsafe.getObject(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 62:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.Y(iN2, S(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 63:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.l(iN2, S(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 64:
                    if (B(t10, iN2, i15)) {
                        iN = CodedOutputStream.N(iN2, 0);
                        i16 += iN;
                    }
                    break;
                case 65:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.P(iN2, 0L);
                        i16 += iE;
                    }
                    break;
                case 66:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.R(iN2, S(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 67:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.T(iN2, T(t10, jO));
                        i16 += iE;
                    }
                    break;
                case 68:
                    if (B(t10, iN2, i15)) {
                        iE = CodedOutputStream.u(iN2, (MessageLite) unsafe.getObject(t10, jO), o(i15));
                        i16 += iE;
                    }
                    break;
                default:
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        int iS = i16 + s(this.f10516o, t10);
        return this.f10507f ? iS + this.f10517p.c(t10).y() : iS;
    }

    private <K, V> void q0(e3 e3Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            e3Var.e(i10, this.f10518q.forMapMetadata(n(i11)), this.f10518q.forMapData(obj));
        }
    }

    private int r(T t10) {
        int iJ;
        int i10;
        int iX;
        int iZ;
        Unsafe unsafe = f10501s;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f10502a.length; i12 += 3) {
            int iM0 = m0(i12);
            int iL0 = l0(iM0);
            int iN = N(i12);
            long jO = O(iM0);
            int i13 = (iL0 < f0.O.c() || iL0 > f0.f10388b0.c()) ? 0 : this.f10502a[i12 + 2] & 1048575;
            switch (iL0) {
                case 0:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.j(iN, 0.0d);
                        i11 += iJ;
                    }
                    break;
                case 1:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.r(iN, 0.0f);
                        i11 += iJ;
                    }
                    break;
                case 2:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.z(iN, z2.E(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 3:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.a0(iN, z2.E(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 4:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.x(iN, z2.C(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 5:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.p(iN, 0L);
                        i11 += iJ;
                    }
                    break;
                case 6:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.n(iN, 0);
                        i11 += iJ;
                    }
                    break;
                case 7:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.e(iN, true);
                        i11 += iJ;
                    }
                    break;
                case 8:
                    if (v(t10, i12)) {
                        Object objG = z2.G(t10, jO);
                        iJ = objG instanceof ByteString ? CodedOutputStream.h(iN, (ByteString) objG) : CodedOutputStream.V(iN, (String) objG);
                        i11 += iJ;
                    }
                    break;
                case 9:
                    if (v(t10, i12)) {
                        iJ = d2.o(iN, z2.G(t10, jO), o(i12));
                        i11 += iJ;
                    }
                    break;
                case 10:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.h(iN, (ByteString) z2.G(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 11:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.Y(iN, z2.C(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 12:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.l(iN, z2.C(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 13:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.N(iN, 0);
                        i11 += iJ;
                    }
                    break;
                case 14:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.P(iN, 0L);
                        i11 += iJ;
                    }
                    break;
                case 15:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.R(iN, z2.C(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 16:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.T(iN, z2.E(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 17:
                    if (v(t10, i12)) {
                        iJ = CodedOutputStream.u(iN, (MessageLite) z2.G(t10, jO), o(i12));
                        i11 += iJ;
                    }
                    break;
                case 18:
                    iJ = d2.h(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 19:
                    iJ = d2.f(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 20:
                    iJ = d2.m(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 21:
                    iJ = d2.x(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 22:
                    iJ = d2.k(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 23:
                    iJ = d2.h(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 24:
                    iJ = d2.f(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 25:
                    iJ = d2.a(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 26:
                    iJ = d2.u(iN, D(t10, jO));
                    i11 += iJ;
                    break;
                case 27:
                    iJ = d2.p(iN, D(t10, jO), o(i12));
                    i11 += iJ;
                    break;
                case 28:
                    iJ = d2.c(iN, D(t10, jO));
                    i11 += iJ;
                    break;
                case 29:
                    iJ = d2.v(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 30:
                    iJ = d2.d(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 31:
                    iJ = d2.f(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 32:
                    iJ = d2.h(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 33:
                    iJ = d2.q(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 34:
                    iJ = d2.s(iN, D(t10, jO), false);
                    i11 += iJ;
                    break;
                case 35:
                    i10 = d2.i((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 36:
                    i10 = d2.g((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 37:
                    i10 = d2.n((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 38:
                    i10 = d2.y((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 39:
                    i10 = d2.l((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 40:
                    i10 = d2.i((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 41:
                    i10 = d2.g((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 42:
                    i10 = d2.b((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 43:
                    i10 = d2.w((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 44:
                    i10 = d2.e((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 45:
                    i10 = d2.g((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 46:
                    i10 = d2.i((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 47:
                    i10 = d2.r((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 48:
                    i10 = d2.t((List) unsafe.getObject(t10, jO));
                    if (i10 > 0) {
                        if (this.f10510i) {
                            unsafe.putInt(t10, i13, i10);
                        }
                        iX = CodedOutputStream.X(iN);
                        iZ = CodedOutputStream.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 49:
                    iJ = d2.j(iN, D(t10, jO), o(i12));
                    i11 += iJ;
                    break;
                case 50:
                    iJ = this.f10518q.getSerializedSize(iN, z2.G(t10, jO), n(i12));
                    i11 += iJ;
                    break;
                case 51:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.j(iN, 0.0d);
                        i11 += iJ;
                    }
                    break;
                case 52:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.r(iN, 0.0f);
                        i11 += iJ;
                    }
                    break;
                case 53:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.z(iN, T(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 54:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.a0(iN, T(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 55:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.x(iN, S(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 56:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.p(iN, 0L);
                        i11 += iJ;
                    }
                    break;
                case 57:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.n(iN, 0);
                        i11 += iJ;
                    }
                    break;
                case 58:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.e(iN, true);
                        i11 += iJ;
                    }
                    break;
                case 59:
                    if (B(t10, iN, i12)) {
                        Object objG2 = z2.G(t10, jO);
                        iJ = objG2 instanceof ByteString ? CodedOutputStream.h(iN, (ByteString) objG2) : CodedOutputStream.V(iN, (String) objG2);
                        i11 += iJ;
                    }
                    break;
                case 60:
                    if (B(t10, iN, i12)) {
                        iJ = d2.o(iN, z2.G(t10, jO), o(i12));
                        i11 += iJ;
                    }
                    break;
                case 61:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.h(iN, (ByteString) z2.G(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 62:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.Y(iN, S(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 63:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.l(iN, S(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 64:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.N(iN, 0);
                        i11 += iJ;
                    }
                    break;
                case 65:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.P(iN, 0L);
                        i11 += iJ;
                    }
                    break;
                case 66:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.R(iN, S(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 67:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.T(iN, T(t10, jO));
                        i11 += iJ;
                    }
                    break;
                case 68:
                    if (B(t10, iN, i12)) {
                        iJ = CodedOutputStream.u(iN, (MessageLite) z2.G(t10, jO), o(i12));
                        i11 += iJ;
                    }
                    break;
            }
        }
        return i11 + s(this.f10516o, t10);
    }

    private void r0(int i10, Object obj, e3 e3Var) throws IOException {
        if (obj instanceof String) {
            e3Var.writeString(i10, (String) obj);
        } else {
            e3Var.c(i10, (ByteString) obj);
        }
    }

    private <UT, UB> int s(t2<UT, UB> t2Var, T t10) {
        return t2Var.h(t2Var.g(t10));
    }

    private <UT, UB> void s0(t2<UT, UB> t2Var, T t10, e3 e3Var) throws IOException {
        t2Var.t(t2Var.g(t10), e3Var);
    }

    private static <T> int t(T t10, long j10) {
        return z2.C(t10, j10);
    }

    private static boolean u(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean v(T t10, int i10) {
        int iB0 = b0(i10);
        long j10 = 1048575 & iB0;
        if (j10 != 1048575) {
            return (z2.C(t10, j10) & (1 << (iB0 >>> 20))) != 0;
        }
        int iM0 = m0(i10);
        long jO = O(iM0);
        switch (l0(iM0)) {
            case 0:
                return z2.A(t10, jO) != 0.0d;
            case 1:
                return z2.B(t10, jO) != 0.0f;
            case 2:
                return z2.E(t10, jO) != 0;
            case 3:
                return z2.E(t10, jO) != 0;
            case 4:
                return z2.C(t10, jO) != 0;
            case 5:
                return z2.E(t10, jO) != 0;
            case 6:
                return z2.C(t10, jO) != 0;
            case 7:
                return z2.t(t10, jO);
            case 8:
                Object objG = z2.G(t10, jO);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return z2.G(t10, jO) != null;
            case 10:
                return !ByteString.EMPTY.equals(z2.G(t10, jO));
            case 11:
                return z2.C(t10, jO) != 0;
            case 12:
                return z2.C(t10, jO) != 0;
            case 13:
                return z2.C(t10, jO) != 0;
            case 14:
                return z2.E(t10, jO) != 0;
            case 15:
                return z2.C(t10, jO) != 0;
            case 16:
                return z2.E(t10, jO) != 0;
            case 17:
                return z2.G(t10, jO) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean w(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return v(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean x(Object obj, int i10, b2 b2Var) {
        return b2Var.isInitialized(z2.G(obj, O(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean y(Object obj, int i10, int i11) {
        List list = (List) z2.G(obj, O(i10));
        if (list.isEmpty()) {
            return true;
        }
        b2 b2VarO = o(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!b2VarO.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.explorestack.protobuf.b2] */
    private boolean z(T t10, int i10, int i11) {
        Map<?, ?> mapForMapData = this.f10518q.forMapData(z2.G(t10, O(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f10518q.forMapMetadata(n(i11)).f10866c.b() != c3.c.MESSAGE) {
            return true;
        }
        ?? D = 0;
        for (Object obj : mapForMapData.values()) {
            if (D == 0) {
                D = D;
                D = v1.a().d(obj.getClass());
            }
            D = D;
            if (!D.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008d. Please report as an issue. */
    int W(T t10, byte[] bArr, int i10, int i11, int i12, g.b bVar) throws IOException {
        Unsafe unsafe;
        i1<T> i1Var;
        int i13;
        T t11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        T t12;
        T t13;
        int i23;
        T t14;
        int i24;
        int i25;
        i1<T> i1Var2 = this;
        T t15 = t10;
        byte[] bArr2 = bArr;
        i11 = i11;
        int i26 = i12;
        g.b bVar2 = bVar;
        Unsafe unsafe2 = f10501s;
        int iG = i10;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 1048575;
        while (true) {
            if (iG < i11) {
                int i32 = iG + 1;
                byte b10 = bArr2[iG];
                if (b10 < 0) {
                    int iH = g.H(b10, bArr2, i32, bVar2);
                    i14 = bVar2.f10450a;
                    i32 = iH;
                } else {
                    i14 = b10;
                }
                int i33 = i14 >>> 3;
                int i34 = i14 & 7;
                int iA0 = i33 > i30 ? i1Var2.a0(i33, i27 / 3) : i1Var2.Z(i33);
                if (iA0 == -1) {
                    i15 = i33;
                    i16 = i32;
                    i17 = i14;
                    i18 = i29;
                    i19 = i31;
                    unsafe = unsafe2;
                    i12 = i26;
                    i20 = 0;
                } else {
                    int i35 = i1Var2.f10502a[iA0 + 1];
                    int iL0 = l0(i35);
                    long jO = O(i35);
                    int i36 = i14;
                    if (iL0 <= 17) {
                        int i37 = i1Var2.f10502a[iA0 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i31) {
                            if (i31 != 1048575) {
                                unsafe2.putInt(t15, i31, i29);
                            }
                            i29 = unsafe2.getInt(t15, i39);
                            i19 = i39;
                        } else {
                            i19 = i31;
                        }
                        int i40 = i29;
                        switch (iL0) {
                            case 0:
                                t12 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 1) {
                                    z2.T(t12, jO, g.d(bArr2, i32));
                                    iG = i32 + 8;
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 1:
                                t12 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 5) {
                                    z2.U(t12, jO, g.l(bArr2, i32));
                                    iG = i32 + 4;
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 2:
                            case 3:
                                T t16 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 0) {
                                    int iL = g.L(bArr2, i32, bVar2);
                                    t13 = t16;
                                    unsafe2.putLong(t10, jO, bVar2.f10451b);
                                    i29 = i40 | i38;
                                    i27 = i21;
                                    iG = iL;
                                    i28 = i22;
                                    t15 = t13;
                                    i30 = i15;
                                    i31 = i19;
                                    i11 = i11;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 4:
                            case 11:
                                t12 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 0) {
                                    iG = g.I(bArr2, i32, bVar2);
                                    unsafe2.putInt(t12, jO, bVar2.f10450a);
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 5:
                            case 14:
                                T t17 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 1) {
                                    t13 = t17;
                                    unsafe2.putLong(t10, jO, g.j(bArr2, i32));
                                    iG = i32 + 8;
                                    i29 = i40 | i38;
                                    i27 = i21;
                                    i28 = i22;
                                    t15 = t13;
                                    i30 = i15;
                                    i31 = i19;
                                    i11 = i11;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 6:
                            case 13:
                                i23 = i11;
                                t14 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 5) {
                                    unsafe2.putInt(t14, jO, g.h(bArr2, i32));
                                    iG = i32 + 4;
                                    int i41 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i41;
                                    i30 = i15;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 7:
                                i23 = i11;
                                t14 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 0) {
                                    iG = g.L(bArr2, i32, bVar2);
                                    z2.N(t14, jO, bVar2.f10451b != 0);
                                    int i42 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i42;
                                    i30 = i15;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 8:
                                i23 = i11;
                                t14 = t15;
                                i21 = iA0;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 2) {
                                    iG = (i35 & 536870912) == 0 ? g.C(bArr2, i32, bVar2) : g.F(bArr2, i32, bVar2);
                                    unsafe2.putObject(t14, jO, bVar2.f10452c);
                                    int i43 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i43;
                                    i30 = i15;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 9:
                                t14 = t15;
                                i21 = iA0;
                                i15 = i33;
                                i22 = i36;
                                bArr2 = bArr;
                                if (i34 == 2) {
                                    i23 = i11;
                                    iG = g.p(i1Var2.o(i21), bArr2, i32, i23, bVar2);
                                    if ((i40 & i38) == 0) {
                                        unsafe2.putObject(t14, jO, bVar2.f10452c);
                                    } else {
                                        unsafe2.putObject(t14, jO, l0.k(unsafe2.getObject(t14, jO), bVar2.f10452c));
                                    }
                                    int i44 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i44;
                                    i30 = i15;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 10:
                                t12 = t15;
                                i21 = iA0;
                                i15 = i33;
                                i22 = i36;
                                bArr2 = bArr;
                                if (i34 == 2) {
                                    iG = g.b(bArr2, i32, bVar2);
                                    unsafe2.putObject(t12, jO, bVar2.f10452c);
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 12:
                                t12 = t15;
                                i21 = iA0;
                                i15 = i33;
                                i22 = i36;
                                bArr2 = bArr;
                                if (i34 == 0) {
                                    iG = g.I(bArr2, i32, bVar2);
                                    int i45 = bVar2.f10450a;
                                    l0.e eVarM = i1Var2.m(i21);
                                    if (eVarM == null || eVarM.isInRange(i45)) {
                                        unsafe2.putInt(t12, jO, i45);
                                        i29 = i40 | i38;
                                        t15 = t12;
                                    } else {
                                        p(t10).m(i22, Long.valueOf(i45));
                                        t15 = t12;
                                        i29 = i40;
                                    }
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 15:
                                i21 = iA0;
                                i22 = i36;
                                bArr2 = bArr;
                                i15 = i33;
                                if (i34 == 0) {
                                    iG = g.I(bArr2, i32, bVar2);
                                    t12 = t10;
                                    unsafe2.putInt(t12, jO, n.b(bVar2.f10450a));
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 16:
                                i21 = iA0;
                                i15 = i33;
                                if (i34 == 0) {
                                    bArr2 = bArr;
                                    int iL2 = g.L(bArr2, i32, bVar2);
                                    i22 = i36;
                                    unsafe2.putLong(t10, jO, n.c(bVar2.f10451b));
                                    i29 = i40 | i38;
                                    t15 = t10;
                                    i11 = i11;
                                    i27 = i21;
                                    iG = iL2;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i22 = i36;
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            case 17:
                                if (i34 == 3) {
                                    iG = g.n(i1Var2.o(iA0), bArr, i32, i11, (i33 << 3) | 4, bVar);
                                    if ((i40 & i38) == 0) {
                                        unsafe2.putObject(t15, jO, bVar2.f10452c);
                                    } else {
                                        unsafe2.putObject(t15, jO, l0.k(unsafe2.getObject(t15, jO), bVar2.f10452c));
                                    }
                                    i29 = i40 | i38;
                                    bArr2 = bArr;
                                    i11 = i11;
                                    i26 = i12;
                                    i27 = iA0;
                                    i28 = i36;
                                    i30 = i33;
                                    i31 = i19;
                                } else {
                                    i21 = iA0;
                                    i15 = i33;
                                    i22 = i36;
                                    i12 = i12;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                }
                                break;
                            default:
                                i21 = iA0;
                                i22 = i36;
                                i15 = i33;
                                i12 = i12;
                                i16 = i32;
                                i18 = i40;
                                i20 = i21;
                                unsafe = unsafe2;
                                i17 = i22;
                                break;
                        }
                    } else {
                        i15 = i33;
                        T t18 = t15;
                        bArr2 = bArr;
                        if (iL0 != 27) {
                            i20 = iA0;
                            i18 = i29;
                            i19 = i31;
                            if (iL0 <= 49) {
                                int i46 = i32;
                                unsafe = unsafe2;
                                iG = Y(t10, bArr, i32, i11, i36, i15, i34, i20, i35, iL0, jO, bVar);
                                if (iG != i46) {
                                    i25 = i36;
                                    i1Var2 = this;
                                    t15 = t10;
                                    bArr2 = bArr;
                                    i11 = i11;
                                    i26 = i12;
                                    bVar2 = bVar;
                                    i30 = i15;
                                    i28 = i25;
                                    i27 = i20;
                                    i29 = i18;
                                    i31 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i25 = i36;
                                    i16 = iG;
                                    i17 = i25;
                                }
                            } else {
                                i24 = i32;
                                unsafe = unsafe2;
                                if (iL0 != 50) {
                                    iG = V(t10, bArr, i24, i11, i25, i15, i34, i35, iL0, jO, i20, bVar);
                                    if (iG != i24) {
                                        i25 = i36;
                                        i1Var2 = this;
                                        t15 = t10;
                                        bArr2 = bArr;
                                        i11 = i11;
                                        i26 = i12;
                                        bVar2 = bVar;
                                        i30 = i15;
                                        i28 = i25;
                                        i27 = i20;
                                        i29 = i18;
                                        i31 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i25 = i36;
                                        i16 = iG;
                                        i17 = i25;
                                    }
                                } else if (i34 == 2) {
                                    iG = U(t10, bArr, i24, i11, i20, jO, bVar);
                                    if (iG != i24) {
                                        i25 = i36;
                                        i1Var2 = this;
                                        t15 = t10;
                                        bArr2 = bArr;
                                        i11 = i11;
                                        i26 = i12;
                                        bVar2 = bVar;
                                        i30 = i15;
                                        i28 = i25;
                                        i27 = i20;
                                        i29 = i18;
                                        i31 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i25 = i36;
                                        i16 = iG;
                                        i17 = i25;
                                    }
                                } else {
                                    i25 = i36;
                                }
                            }
                        } else if (i34 == 2) {
                            l0.j jVarMutableCopyWithCapacity2 = (l0.j) unsafe2.getObject(t18, jO);
                            if (!jVarMutableCopyWithCapacity2.isModifiable()) {
                                int size = jVarMutableCopyWithCapacity2.size();
                                jVarMutableCopyWithCapacity2 = jVarMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t18, jO, jVarMutableCopyWithCapacity2);
                            }
                            i19 = i31;
                            iG = g.q(i1Var2.o(iA0), i36, bArr, i32, i11, jVarMutableCopyWithCapacity2, bVar);
                            t15 = t10;
                            i11 = i11;
                            i28 = i36;
                            i30 = i15;
                            i27 = iA0;
                            i29 = i29;
                            i31 = i19;
                            i26 = i12;
                        } else {
                            i20 = iA0;
                            i18 = i29;
                            i19 = i31;
                            i24 = i32;
                            unsafe = unsafe2;
                            i25 = i36;
                        }
                        i16 = i24;
                        i17 = i25;
                    }
                }
                if (i17 != i12 || i12 == 0) {
                    iG = (!this.f10507f || bVar.f10453d == y.b()) ? g.G(i17, bArr, i16, i11, p(t10), bVar) : g.g(i17, bArr, i16, i11, t10, this.f10506e, this.f10516o, bVar);
                    t15 = t10;
                    bArr2 = bArr;
                    i11 = i11;
                    i28 = i17;
                    i1Var2 = this;
                    bVar2 = bVar;
                    i30 = i15;
                    i27 = i20;
                    i29 = i18;
                    i31 = i19;
                    unsafe2 = unsafe;
                    i26 = i12;
                } else {
                    i13 = 1048575;
                    i1Var = this;
                    iG = i16;
                    i28 = i17;
                    i29 = i18;
                    i31 = i19;
                }
            } else {
                unsafe = unsafe2;
                i12 = i26;
                i1Var = i1Var2;
                i13 = 1048575;
            }
        }
        if (i31 != i13) {
            t11 = t10;
            unsafe.putInt(t11, i31, i29);
        } else {
            t11 = t10;
        }
        v2 v2Var = null;
        for (int i47 = i1Var.f10512k; i47 < i1Var.f10513l; i47++) {
            v2Var = (v2) i1Var.j(t11, i1Var.f10511j[i47], v2Var, i1Var.f10516o);
        }
        if (v2Var != null) {
            i1Var.f10516o.o(t11, v2Var);
        }
        if (i12 == 0) {
            if (iG != i11) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (iG > i11 || i28 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return iG;
    }

    @Override // com.explorestack.protobuf.b2
    public void a(T t10, y1 y1Var, y yVar) throws IOException {
        yVar.getClass();
        F(this.f10516o, this.f10517p, t10, y1Var, yVar);
    }

    @Override // com.explorestack.protobuf.b2
    public void b(T t10, byte[] bArr, int i10, int i11, g.b bVar) throws IOException {
        if (this.f10509h) {
            X(t10, bArr, i10, i11, bVar);
        } else {
            W(t10, bArr, i10, i11, 0, bVar);
        }
    }

    @Override // com.explorestack.protobuf.b2
    public void c(T t10, e3 e3Var) throws IOException {
        if (e3Var.fieldOrder() == e3.a.DESCENDING) {
            p0(t10, e3Var);
        } else if (this.f10509h) {
            o0(t10, e3Var);
        } else {
            n0(t10, e3Var);
        }
    }

    @Override // com.explorestack.protobuf.b2
    public boolean equals(T t10, T t11) {
        int length = this.f10502a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!i(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f10516o.g(t10).equals(this.f10516o.g(t11))) {
            return false;
        }
        if (this.f10507f) {
            return this.f10517p.c(t10).equals(this.f10517p.c(t11));
        }
        return true;
    }

    @Override // com.explorestack.protobuf.b2
    public int getSerializedSize(T t10) {
        return this.f10509h ? r(t10) : q(t10);
    }

    @Override // com.explorestack.protobuf.b2
    public int hashCode(T t10) {
        int i10;
        int i11;
        int length = this.f10502a.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iM0 = m0(i13);
            int iN = N(i13);
            long jO = O(iM0);
            int iHashCode = 37;
            switch (l0(iM0)) {
                case 0:
                    i10 = i12 * 53;
                    i11 = l0.i(Double.doubleToLongBits(z2.A(t10, jO)));
                    i12 = i10 + i11;
                    break;
                case 1:
                    i10 = i12 * 53;
                    i11 = Float.floatToIntBits(z2.B(t10, jO));
                    i12 = i10 + i11;
                    break;
                case 2:
                    i10 = i12 * 53;
                    i11 = l0.i(z2.E(t10, jO));
                    i12 = i10 + i11;
                    break;
                case 3:
                    i10 = i12 * 53;
                    i11 = l0.i(z2.E(t10, jO));
                    i12 = i10 + i11;
                    break;
                case 4:
                    i10 = i12 * 53;
                    i11 = z2.C(t10, jO);
                    i12 = i10 + i11;
                    break;
                case 5:
                    i10 = i12 * 53;
                    i11 = l0.i(z2.E(t10, jO));
                    i12 = i10 + i11;
                    break;
                case 6:
                    i10 = i12 * 53;
                    i11 = z2.C(t10, jO);
                    i12 = i10 + i11;
                    break;
                case 7:
                    i10 = i12 * 53;
                    i11 = l0.d(z2.t(t10, jO));
                    i12 = i10 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    i11 = ((String) z2.G(t10, jO)).hashCode();
                    i12 = i10 + i11;
                    break;
                case 9:
                    Object objG = z2.G(t10, jO);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    i11 = z2.G(t10, jO).hashCode();
                    i12 = i10 + i11;
                    break;
                case 11:
                    i10 = i12 * 53;
                    i11 = z2.C(t10, jO);
                    i12 = i10 + i11;
                    break;
                case 12:
                    i10 = i12 * 53;
                    i11 = z2.C(t10, jO);
                    i12 = i10 + i11;
                    break;
                case 13:
                    i10 = i12 * 53;
                    i11 = z2.C(t10, jO);
                    i12 = i10 + i11;
                    break;
                case 14:
                    i10 = i12 * 53;
                    i11 = l0.i(z2.E(t10, jO));
                    i12 = i10 + i11;
                    break;
                case 15:
                    i10 = i12 * 53;
                    i11 = z2.C(t10, jO);
                    i12 = i10 + i11;
                    break;
                case 16:
                    i10 = i12 * 53;
                    i11 = l0.i(z2.E(t10, jO));
                    i12 = i10 + i11;
                    break;
                case 17:
                    Object objG2 = z2.G(t10, jO);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    i11 = z2.G(t10, jO).hashCode();
                    i12 = i10 + i11;
                    break;
                case 50:
                    i10 = i12 * 53;
                    i11 = z2.G(t10, jO).hashCode();
                    i12 = i10 + i11;
                    break;
                case 51:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = l0.i(Double.doubleToLongBits(Q(t10, jO)));
                        i12 = i10 + i11;
                    }
                    break;
                case 52:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = Float.floatToIntBits(R(t10, jO));
                        i12 = i10 + i11;
                    }
                    break;
                case 53:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = l0.i(T(t10, jO));
                        i12 = i10 + i11;
                    }
                    break;
                case 54:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = l0.i(T(t10, jO));
                        i12 = i10 + i11;
                    }
                    break;
                case 55:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = S(t10, jO);
                        i12 = i10 + i11;
                    }
                    break;
                case 56:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = l0.i(T(t10, jO));
                        i12 = i10 + i11;
                    }
                    break;
                case 57:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = S(t10, jO);
                        i12 = i10 + i11;
                    }
                    break;
                case 58:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = l0.d(P(t10, jO));
                        i12 = i10 + i11;
                    }
                    break;
                case 59:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = ((String) z2.G(t10, jO)).hashCode();
                        i12 = i10 + i11;
                    }
                    break;
                case 60:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = z2.G(t10, jO).hashCode();
                        i12 = i10 + i11;
                    }
                    break;
                case 61:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = z2.G(t10, jO).hashCode();
                        i12 = i10 + i11;
                    }
                    break;
                case 62:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = S(t10, jO);
                        i12 = i10 + i11;
                    }
                    break;
                case 63:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = S(t10, jO);
                        i12 = i10 + i11;
                    }
                    break;
                case 64:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = S(t10, jO);
                        i12 = i10 + i11;
                    }
                    break;
                case 65:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = l0.i(T(t10, jO));
                        i12 = i10 + i11;
                    }
                    break;
                case 66:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = S(t10, jO);
                        i12 = i10 + i11;
                    }
                    break;
                case 67:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = l0.i(T(t10, jO));
                        i12 = i10 + i11;
                    }
                    break;
                case 68:
                    if (B(t10, iN, i13)) {
                        i10 = i12 * 53;
                        i11 = z2.G(t10, jO).hashCode();
                        i12 = i10 + i11;
                    }
                    break;
            }
        }
        int iHashCode2 = (i12 * 53) + this.f10516o.g(t10).hashCode();
        return this.f10507f ? (iHashCode2 * 53) + this.f10517p.c(t10).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // com.explorestack.protobuf.b2
    public final boolean isInitialized(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f10512k) {
            int i15 = this.f10511j[i14];
            int iN = N(i15);
            int iM0 = m0(i15);
            int i16 = this.f10502a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f10501s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (C(iM0) && !w(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iL0 = l0(iM0);
            if (iL0 == 9 || iL0 == 17) {
                if (w(t10, i15, i10, i11, i18) && !x(t10, iM0, o(i15))) {
                    return false;
                }
            } else if (iL0 == 27) {
                if (!y(t10, iM0, i15)) {
                    return false;
                }
            } else if (iL0 == 60 || iL0 == 68) {
                if (B(t10, iN, i15) && !x(t10, iM0, o(i15))) {
                    return false;
                }
            } else if (iL0 != 49) {
                if (iL0 == 50 && !z(t10, iM0, i15)) {
                    return false;
                }
            } else if (!y(t10, iM0, i15)) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f10507f || this.f10517p.c(t10).D();
    }

    @Override // com.explorestack.protobuf.b2
    public void makeImmutable(T t10) {
        int i10;
        int i11 = this.f10512k;
        while (true) {
            i10 = this.f10513l;
            if (i11 >= i10) {
                break;
            }
            long jO = O(m0(this.f10511j[i11]));
            Object objG = z2.G(t10, jO);
            if (objG != null) {
                z2.X(t10, jO, this.f10518q.toImmutable(objG));
            }
            i11++;
        }
        int length = this.f10511j.length;
        while (i10 < length) {
            this.f10515n.c(t10, this.f10511j[i10]);
            i10++;
        }
        this.f10516o.j(t10);
        if (this.f10507f) {
            this.f10517p.f(t10);
        }
    }

    @Override // com.explorestack.protobuf.b2
    public void mergeFrom(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f10502a.length; i10 += 3) {
            J(t10, t11, i10);
        }
        d2.H(this.f10516o, t10, t11);
        if (this.f10507f) {
            d2.F(this.f10517p, t10, t11);
        }
    }

    @Override // com.explorestack.protobuf.b2
    public T newInstance() {
        return (T) this.f10514m.newInstance(this.f10506e);
    }
}
