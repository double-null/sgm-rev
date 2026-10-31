package androidx.datastore.preferences.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes.dex */
final class s0<T> implements e1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f2303r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f2304s = n1.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f2305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f2306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p0 f2309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z0 f2312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f2313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f2314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f2315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f2316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u0 f2317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f2318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k1<?, ?> f2319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o<?> f2320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k0 f2321q;

    private s0(int[] iArr, Object[] objArr, int i10, int i11, p0 p0Var, z0 z0Var, boolean z10, int[] iArr2, int i12, int i13, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        this.f2305a = iArr;
        this.f2306b = objArr;
        this.f2307c = i10;
        this.f2308d = i11;
        this.f2311g = p0Var instanceof w;
        this.f2312h = z0Var;
        this.f2310f = oVar != null && oVar.e(p0Var);
        this.f2313i = z10;
        this.f2314j = iArr2;
        this.f2315k = i12;
        this.f2316l = i13;
        this.f2317m = u0Var;
        this.f2318n = d0Var;
        this.f2319o = k1Var;
        this.f2320p = oVar;
        this.f2309e = p0Var;
        this.f2321q = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0646 A[Catch: all -> 0x069e, TRY_LEAVE, TryCatch #11 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:208:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0653 A[LOOP:2: B:172:0x064f->B:174:0x0653, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0668  */
    /* JADX WARN: Code duplicated, block: B:178:0x066c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x066e A[Catch: all -> 0x069e, TRY_ENTER, TryCatch #11 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:208:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0680 A[LOOP:3: B:183:0x067c->B:185:0x0680, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0695  */
    /* JADX WARN: Code duplicated, block: B:201:0x06af A[LOOP:4: B:199:0x06ab->B:201:0x06af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:231:0x064c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0679 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends s.b<ET>> void A(k1<UT, UB> k1Var, o<ET> oVar, T t10, d1 d1Var, n nVar) throws Throwable {
        T t11;
        k1 k1Var2;
        int i10;
        Object objH;
        T t12;
        n nVar2;
        int i11;
        Object objH2;
        int i12;
        Object objH3;
        Object obj;
        k1 k1Var3 = k1Var;
        T t13 = t10;
        n nVar3 = nVar;
        Object objF = null;
        Object obj2 = null;
        while (true) {
            try {
                int fieldNumber = d1Var.getFieldNumber();
                int iR = R(fieldNumber);
                if (iR >= 0) {
                    t11 = t13;
                    try {
                        int iE0 = e0(iR);
                        try {
                            switch (d0(iE0)) {
                                case 0:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.K(t11, L(iE0), d1Var.readDouble());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 1:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.L(t11, L(iE0), d1Var.readFloat());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 2:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.N(t11, L(iE0), d1Var.readInt64());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 3:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.N(t11, L(iE0), d1Var.readUInt64());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 4:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.M(t11, L(iE0), d1Var.readInt32());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 5:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.N(t11, L(iE0), d1Var.readFixed64());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 6:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.M(t11, L(iE0), d1Var.readFixed32());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 7:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.E(t11, L(iE0), d1Var.readBool());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 8:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    V(t11, iE0, d1Var);
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 9:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    p0 p0Var = (p0) F(t11, iR);
                                    d1Var.a(p0Var, m(iR), nVar2);
                                    b0(t11, iR, p0Var);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 10:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.O(t11, L(iE0), d1Var.readBytes());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 11:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.M(t11, L(iE0), d1Var.readUInt32());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 12:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    int i13 = d1Var.readEnum();
                                    y.e eVarK = k(iR);
                                    if (eVarK == null || eVarK.isInRange(i13)) {
                                        n1.M(t11, L(iE0), i13);
                                        Y(t11, iR);
                                        objF = obj;
                                    } else {
                                        objF = g1.J(t11, fieldNumber, i13, obj, k1Var2);
                                    }
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 13:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.M(t11, L(iE0), d1Var.readSFixed32());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 14:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.N(t11, L(iE0), d1Var.readSFixed64());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 15:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.M(t11, L(iE0), d1Var.readSInt32());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 16:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    n1.N(t11, L(iE0), d1Var.readSInt64());
                                    Y(t11, iR);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 17:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    p0 p0Var2 = (p0) F(t11, iR);
                                    d1Var.f(p0Var2, m(iR), nVar2);
                                    b0(t11, iR, p0Var2);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 18:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readDoubleList(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 19:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readFloatList(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 20:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readInt64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 21:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readUInt64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 22:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readInt32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 23:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readFixed64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 24:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readFixed32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 25:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readBoolList(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 26:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    W(t11, iE0, d1Var);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 27:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    U(t10, iE0, d1Var, m(iR), nVar);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 28:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readBytesList(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 29:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readUInt32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 30:
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    List<Integer> listC = this.f2318n.c(t11, L(iE0));
                                    d1Var.readEnumList(listC);
                                    objF = g1.A(t10, fieldNumber, listC, k(iR), objF, k1Var);
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 31:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSFixed32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 32:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSFixed64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 33:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSInt32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 34:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSInt64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 35:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readDoubleList(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 36:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readFloatList(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 37:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readInt64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 38:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readUInt64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 39:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readInt32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 40:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readFixed64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 41:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readFixed32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 42:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readBoolList(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 43:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readUInt32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 44:
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    List<Integer> listC2 = this.f2318n.c(t11, L(iE0));
                                    d1Var.readEnumList(listC2);
                                    objF = g1.A(t10, fieldNumber, listC2, k(iR), objF, k1Var);
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 45:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSFixed32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 46:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSFixed64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 47:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSInt32List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 48:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    d1Var.readSInt64List(this.f2318n.c(t11, L(iE0)));
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 49:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    T(t10, L(iE0), d1Var, m(iR), nVar);
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 50:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    try {
                                        B(t10, iR, l(iR), nVar, d1Var);
                                        k1Var2 = k1Var3;
                                        objF = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        k1Var2 = k1Var3;
                                        objF = obj;
                                        if (k1Var2.q(d1Var)) {
                                            if (objF == null) {
                                                objF = k1Var2.f(t11);
                                            }
                                            if (!k1Var2.m(objF, d1Var, 0)) {
                                                objH2 = objF;
                                                for (i11 = this.f2315k; i11 < this.f2316l; i11++) {
                                                    objH2 = h(t10, this.f2314j[i11], objH2, k1Var, t10);
                                                }
                                                if (objH2 != null) {
                                                    k1Var2.o(t11, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!d1Var.skipField()) {
                                            objH3 = objF;
                                            for (i12 = this.f2315k; i12 < this.f2316l; i12++) {
                                                objH3 = h(t10, this.f2314j[i12], objH3, k1Var, t10);
                                            }
                                            if (objH3 != null) {
                                                k1Var2.o(t11, objH3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        k1Var2 = k1Var3;
                                        objF = obj;
                                        objH = objF;
                                        for (i10 = this.f2315k; i10 < this.f2316l; i10++) {
                                            objH = h(t10, this.f2314j[i10], objH, k1Var, t10);
                                        }
                                        if (objH != null) {
                                            k1Var2.o(t11, objH);
                                        }
                                        throw th;
                                    }
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 51:
                                    n1.O(t11, L(iE0), Double.valueOf(d1Var.readDouble()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 52:
                                    n1.O(t11, L(iE0), Float.valueOf(d1Var.readFloat()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 53:
                                    n1.O(t11, L(iE0), Long.valueOf(d1Var.readInt64()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 54:
                                    n1.O(t11, L(iE0), Long.valueOf(d1Var.readUInt64()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 55:
                                    n1.O(t11, L(iE0), Integer.valueOf(d1Var.readInt32()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 56:
                                    n1.O(t11, L(iE0), Long.valueOf(d1Var.readFixed64()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 57:
                                    n1.O(t11, L(iE0), Integer.valueOf(d1Var.readFixed32()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 58:
                                    n1.O(t11, L(iE0), Boolean.valueOf(d1Var.readBool()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 59:
                                    V(t11, iE0, d1Var);
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 60:
                                    p0 p0Var3 = (p0) G(t11, fieldNumber, iR);
                                    d1Var.a(p0Var3, m(iR), nVar3);
                                    c0(t11, fieldNumber, iR, p0Var3);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 61:
                                    n1.O(t11, L(iE0), d1Var.readBytes());
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 62:
                                    n1.O(t11, L(iE0), Integer.valueOf(d1Var.readUInt32()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 63:
                                    int i14 = d1Var.readEnum();
                                    y.e eVarK2 = k(iR);
                                    if (eVarK2 == null || eVarK2.isInRange(i14)) {
                                        n1.O(t11, L(iE0), Integer.valueOf(i14));
                                        Z(t11, fieldNumber, iR);
                                        obj = objF;
                                        nVar2 = nVar3;
                                        k1Var2 = k1Var3;
                                        objF = obj;
                                    } else {
                                        objF = g1.J(t11, fieldNumber, i14, objF, k1Var3);
                                        nVar2 = nVar3;
                                        k1Var2 = k1Var3;
                                    }
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 64:
                                    n1.O(t11, L(iE0), Integer.valueOf(d1Var.readSFixed32()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 65:
                                    n1.O(t11, L(iE0), Long.valueOf(d1Var.readSFixed64()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 66:
                                    n1.O(t11, L(iE0), Integer.valueOf(d1Var.readSInt32()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 67:
                                    n1.O(t11, L(iE0), Long.valueOf(d1Var.readSInt64()));
                                    Z(t11, fieldNumber, iR);
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    objF = obj;
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                case 68:
                                    try {
                                        p0 p0Var4 = (p0) G(t11, fieldNumber, iR);
                                        d1Var.f(p0Var4, m(iR), nVar3);
                                        c0(t11, fieldNumber, iR, p0Var4);
                                        obj = objF;
                                        nVar2 = nVar3;
                                        k1Var2 = k1Var3;
                                        objF = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        nVar2 = nVar3;
                                        k1Var2 = k1Var3;
                                        if (k1Var2.q(d1Var)) {
                                            if (objF == null) {
                                                objF = k1Var2.f(t11);
                                            }
                                            if (!k1Var2.m(objF, d1Var, 0)) {
                                                objH2 = objF;
                                                while (i11 < this.f2316l) {
                                                    objH2 = h(t10, this.f2314j[i11], objH2, k1Var, t10);
                                                }
                                                if (objH2 != null) {
                                                    k1Var2.o(t11, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!d1Var.skipField()) {
                                            objH3 = objF;
                                            while (i12 < this.f2316l) {
                                                objH3 = h(t10, this.f2314j[i12], objH3, k1Var, t10);
                                            }
                                            if (objH3 != null) {
                                                k1Var2.o(t11, objH3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        k1Var2 = k1Var3;
                                        objH = objF;
                                        while (i10 < this.f2316l) {
                                            objH = h(t10, this.f2314j[i10], objH, k1Var, t10);
                                        }
                                        if (objH != null) {
                                            k1Var2.o(t11, objH);
                                        }
                                        throw th;
                                    }
                                    nVar3 = nVar2;
                                    k1Var3 = k1Var2;
                                    t13 = t11;
                                    break;
                                default:
                                    obj = objF;
                                    nVar2 = nVar3;
                                    k1Var2 = k1Var3;
                                    if (obj == null) {
                                        try {
                                            objF = k1Var2.f(t11);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            objF = obj;
                                            if (k1Var2.q(d1Var)) {
                                                if (objF == null) {
                                                    objF = k1Var2.f(t11);
                                                }
                                                if (!k1Var2.m(objF, d1Var, 0)) {
                                                    objH2 = objF;
                                                    while (i11 < this.f2316l) {
                                                        objH2 = h(t10, this.f2314j[i11], objH2, k1Var, t10);
                                                    }
                                                    if (objH2 != null) {
                                                        k1Var2.o(t11, objH2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!d1Var.skipField()) {
                                                objH3 = objF;
                                                while (i12 < this.f2316l) {
                                                    objH3 = h(t10, this.f2314j[i12], objH3, k1Var, t10);
                                                }
                                                if (objH3 != null) {
                                                    k1Var2.o(t11, objH3);
                                                    return;
                                                }
                                                return;
                                            }
                                            nVar3 = nVar2;
                                            k1Var3 = k1Var2;
                                            t13 = t11;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            objF = obj;
                                        }
                                    } else {
                                        objF = obj;
                                    }
                                    try {
                                        try {
                                            if (!k1Var2.m(objF, d1Var, 0)) {
                                                Object objH4 = objF;
                                                for (int i15 = this.f2315k; i15 < this.f2316l; i15++) {
                                                    objH4 = h(t10, this.f2314j[i15], objH4, k1Var, t10);
                                                }
                                                if (objH4 != null) {
                                                    k1Var2.o(t11, objH4);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            if (k1Var2.q(d1Var)) {
                                                if (objF == null) {
                                                    objF = k1Var2.f(t11);
                                                }
                                                if (!k1Var2.m(objF, d1Var, 0)) {
                                                    objH2 = objF;
                                                    while (i11 < this.f2316l) {
                                                        objH2 = h(t10, this.f2314j[i11], objH2, k1Var, t10);
                                                    }
                                                    if (objH2 != null) {
                                                        k1Var2.o(t11, objH2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!d1Var.skipField()) {
                                                objH3 = objF;
                                                while (i12 < this.f2316l) {
                                                    objH3 = h(t10, this.f2314j[i12], objH3, k1Var, t10);
                                                }
                                                if (objH3 != null) {
                                                    k1Var2.o(t11, objH3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        nVar3 = nVar2;
                                        k1Var3 = k1Var2;
                                        t13 = t11;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object objH5 = objF;
                        for (int i16 = this.f2315k; i16 < this.f2316l; i16++) {
                            objH5 = h(t10, this.f2314j[i16], objH5, k1Var, t10);
                        }
                        if (objH5 != null) {
                            k1Var3.o(t13, objH5);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objB = !this.f2310f ? null : oVar.b(nVar3, this.f2309e, fieldNumber);
                        if (objB != null) {
                            Object objD = obj2 == null ? oVar.d(t10) : obj2;
                            t12 = t13;
                            try {
                                objF = oVar.g(t10, d1Var, objB, nVar, objD, objF, k1Var);
                                obj2 = objD;
                            } catch (Throwable th6) {
                                th = th6;
                                t11 = t12;
                                k1Var2 = k1Var3;
                                objH = objF;
                                while (i10 < this.f2316l) {
                                    objH = h(t10, this.f2314j[i10], objH, k1Var, t10);
                                }
                                if (objH != null) {
                                    k1Var2.o(t11, objH);
                                }
                                throw th;
                            }
                        } else {
                            t12 = t13;
                            if (!k1Var3.q(d1Var)) {
                                if (objF == null) {
                                    objF = k1Var3.f(t12);
                                }
                                if (!k1Var3.m(objF, d1Var, 0)) {
                                }
                            } else if (!d1Var.skipField()) {
                            }
                        }
                        t13 = t12;
                    } catch (Throwable th7) {
                        th = th7;
                        t11 = t13;
                        k1Var2 = k1Var3;
                        objH = objF;
                        while (i10 < this.f2316l) {
                            objH = h(t10, this.f2314j[i10], objH, k1Var, t10);
                        }
                        if (objH != null) {
                            k1Var2.o(t11, objH);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
            objH = objF;
            while (i10 < this.f2316l) {
                objH = h(t10, this.f2314j[i10], objH, k1Var, t10);
            }
            if (objH != null) {
                k1Var2.o(t11, objH);
            }
            throw th;
        }
        int i17 = this.f2315k;
        Object objH6 = objF;
        while (i17 < this.f2316l) {
            objH6 = h(t10, this.f2314j[i17], objH6, k1Var, t10);
            i17++;
            t12 = t12;
        }
        T t14 = t12;
        if (objH6 != null) {
            k1Var3.o(t14, objH6);
        }
    }

    private final <K, V> void B(Object obj, int i10, Object obj2, n nVar, d1 d1Var) throws IOException {
        long jL = L(e0(i10));
        Object objZ = n1.z(obj, jL);
        if (objZ == null) {
            objZ = this.f2321q.newMapField(obj2);
            n1.O(obj, jL, objZ);
        } else if (this.f2321q.isImmutable(objZ)) {
            Object objNewMapField = this.f2321q.newMapField(obj2);
            this.f2321q.mergeFrom(objNewMapField, objZ);
            n1.O(obj, jL, objNewMapField);
            objZ = objNewMapField;
        }
        d1Var.e(this.f2321q.forMutableMapData(objZ), this.f2321q.forMapMetadata(obj2), nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C(T t10, T t11, int i10) {
        if (q(t11, i10)) {
            long jL = L(e0(i10));
            Unsafe unsafe = f2304s;
            Object object = unsafe.getObject(t11, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + K(i10) + " is present but null: " + t11);
            }
            e1 e1VarM = m(i10);
            if (!q(t10, i10)) {
                if (v(object)) {
                    Object objNewInstance = e1VarM.newInstance();
                    e1VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jL, objNewInstance);
                } else {
                    unsafe.putObject(t10, jL, object);
                }
                Y(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jL);
            if (!v(object2)) {
                Object objNewInstance2 = e1VarM.newInstance();
                e1VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jL, objNewInstance2);
                object2 = objNewInstance2;
            }
            e1VarM.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void D(T t10, T t11, int i10) {
        int iK = K(i10);
        if (x(t11, iK, i10)) {
            long jL = L(e0(i10));
            Unsafe unsafe = f2304s;
            Object object = unsafe.getObject(t11, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + K(i10) + " is present but null: " + t11);
            }
            e1 e1VarM = m(i10);
            if (!x(t10, iK, i10)) {
                if (v(object)) {
                    Object objNewInstance = e1VarM.newInstance();
                    e1VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jL, objNewInstance);
                } else {
                    unsafe.putObject(t10, jL, object);
                }
                Z(t10, iK, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jL);
            if (!v(object2)) {
                Object objNewInstance2 = e1VarM.newInstance();
                e1VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jL, objNewInstance2);
                object2 = objNewInstance2;
            }
            e1VarM.mergeFrom(object2, object);
        }
    }

    private void E(T t10, T t11, int i10) {
        int iE0 = e0(i10);
        long jL = L(iE0);
        int iK = K(i10);
        switch (d0(iE0)) {
            case 0:
                if (q(t11, i10)) {
                    n1.K(t10, jL, n1.u(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 1:
                if (q(t11, i10)) {
                    n1.L(t10, jL, n1.v(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 2:
                if (q(t11, i10)) {
                    n1.N(t10, jL, n1.x(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 3:
                if (q(t11, i10)) {
                    n1.N(t10, jL, n1.x(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 4:
                if (q(t11, i10)) {
                    n1.M(t10, jL, n1.w(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 5:
                if (q(t11, i10)) {
                    n1.N(t10, jL, n1.x(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 6:
                if (q(t11, i10)) {
                    n1.M(t10, jL, n1.w(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 7:
                if (q(t11, i10)) {
                    n1.E(t10, jL, n1.p(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 8:
                if (q(t11, i10)) {
                    n1.O(t10, jL, n1.z(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 9:
                C(t10, t11, i10);
                break;
            case 10:
                if (q(t11, i10)) {
                    n1.O(t10, jL, n1.z(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 11:
                if (q(t11, i10)) {
                    n1.M(t10, jL, n1.w(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 12:
                if (q(t11, i10)) {
                    n1.M(t10, jL, n1.w(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 13:
                if (q(t11, i10)) {
                    n1.M(t10, jL, n1.w(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 14:
                if (q(t11, i10)) {
                    n1.N(t10, jL, n1.x(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 15:
                if (q(t11, i10)) {
                    n1.M(t10, jL, n1.w(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 16:
                if (q(t11, i10)) {
                    n1.N(t10, jL, n1.x(t11, jL));
                    Y(t10, i10);
                }
                break;
            case 17:
                C(t10, t11, i10);
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
                this.f2318n.b(t10, t11, jL);
                break;
            case 50:
                g1.F(this.f2321q, t10, t11, jL);
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
                if (x(t11, iK, i10)) {
                    n1.O(t10, jL, n1.z(t11, jL));
                    Z(t10, iK, i10);
                }
                break;
            case 60:
                D(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (x(t11, iK, i10)) {
                    n1.O(t10, jL, n1.z(t11, jL));
                    Z(t10, iK, i10);
                }
                break;
            case 68:
                D(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object F(T t10, int i10) {
        e1 e1VarM = m(i10);
        long jL = L(e0(i10));
        if (!q(t10, i10)) {
            return e1VarM.newInstance();
        }
        Object object = f2304s.getObject(t10, jL);
        if (v(object)) {
            return object;
        }
        Object objNewInstance = e1VarM.newInstance();
        if (object != null) {
            e1VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object G(T t10, int i10, int i11) {
        e1 e1VarM = m(i11);
        if (!x(t10, i10, i11)) {
            return e1VarM.newInstance();
        }
        Object object = f2304s.getObject(t10, L(e0(i11)));
        if (v(object)) {
            return object;
        }
        Object objNewInstance = e1VarM.newInstance();
        if (object != null) {
            e1VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static <T> s0<T> H(Class<T> cls, n0 n0Var, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        return n0Var instanceof c1 ? J((c1) n0Var, u0Var, d0Var, k1Var, oVar, k0Var) : I((i1) n0Var, u0Var, d0Var, k1Var, oVar, k0Var);
    }

    static <T> s0<T> I(i1 i1Var, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        r[] rVarArrB = i1Var.b();
        if (rVarArrB.length != 0) {
            r rVar = rVarArrB[0];
            throw null;
        }
        int length = rVarArrB.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (rVarArrB.length > 0) {
            r rVar2 = rVarArrB[0];
            throw null;
        }
        int[] iArrA = i1Var.a();
        if (iArrA == null) {
            iArrA = f2303r;
        }
        if (rVarArrB.length > 0) {
            r rVar3 = rVarArrB[0];
            throw null;
        }
        int[] iArr2 = f2303r;
        int[] iArr3 = f2303r;
        int[] iArr4 = new int[iArrA.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrA, 0, iArr4, 0, iArrA.length);
        System.arraycopy(iArr2, 0, iArr4, iArrA.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrA.length + iArr2.length, iArr3.length);
        return new s0<>(iArr, objArr, 0, 0, i1Var.getDefaultInstance(), i1Var.getSyntax(), true, iArr4, iArrA.length, iArrA.length + iArr2.length, u0Var, d0Var, k1Var, oVar, k0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0248  */
    /* JADX WARN: Code duplicated, block: B:122:0x024b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265  */
    static <T> s0<T> J(c1 c1Var, u0 u0Var, d0 d0Var, k1<?, ?> k1Var, o<?> oVar, k0 k0Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        boolean z10;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        Field fieldX;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldX2;
        int i32;
        Object obj2;
        Field fieldX3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String strB = c1Var.b();
        int length = strB.length();
        char c10 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i10 = i37 + 1;
                if (strB.charAt(i37) < 55296) {
                    break;
                }
                i37 = i10;
            }
        } else {
            i10 = 1;
        }
        int i38 = i10 + 1;
        int iCharAt3 = strB.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i39 = iCharAt3 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = strB.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt3 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i14 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f2303r;
            i12 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt4 = strB.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i23 = i41 + 1;
                    cCharAt8 = strB.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i23;
                }
                iCharAt4 = i42 | (cCharAt8 << i43);
                i41 = i23;
            }
            int i44 = i41 + 1;
            int iCharAt5 = strB.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    cCharAt7 = strB.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                iCharAt5 = i45 | (cCharAt7 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int iCharAt6 = strB.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    cCharAt6 = strB.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                iCharAt6 = i48 | (cCharAt6 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strB.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    cCharAt5 = strB.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                iCharAt7 = i51 | (cCharAt5 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            iCharAt = strB.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    cCharAt4 = strB.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            iCharAt2 = strB.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    cCharAt3 = strB.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                iCharAt2 = i57 | (cCharAt3 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strB.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    cCharAt2 = strB.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int iCharAt9 = strB.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    cCharAt = strB.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i16;
            }
            i11 = (iCharAt4 * 2) + iCharAt5;
            i12 = iCharAt4;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i13 = iCharAt9;
            i38 = i62;
            i14 = iCharAt6;
            i15 = iCharAt7;
        }
        Unsafe unsafe = f2304s;
        Object[] objArrA = c1Var.a();
        Class<?> cls = c1Var.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i65 = i13 + iCharAt2;
        int i66 = i13;
        int i67 = i65;
        int i68 = 0;
        int i69 = 0;
        while (i38 < length) {
            int i70 = i38 + 1;
            int iCharAt10 = strB.charAt(i38);
            if (iCharAt10 >= c10) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i35 = i72 + 1;
                    cCharAt12 = strB.charAt(i72);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i35;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i24 = i35;
            } else {
                i24 = i70;
            }
            int i74 = i24 + 1;
            int iCharAt11 = strB.charAt(i24);
            if (iCharAt11 >= c10) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i34 = i76 + 1;
                    cCharAt11 = strB.charAt(i76);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i34;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i25 = i34;
            } else {
                i25 = i74;
            }
            int i78 = iCharAt11 & 255;
            int i79 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = i68;
            if (i78 >= 51) {
                int i81 = i25 + 1;
                int iCharAt12 = strB.charAt(i25);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        cCharAt10 = strB.charAt(i81);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i81 = i33;
                        c11 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i83);
                    i81 = i33;
                }
                int i84 = i78 - 51;
                int i85 = i81;
                if (i84 == 9 || i84 == 17) {
                    i30 = i11 + 1;
                    objArr[((i69 / 3) * 2) + 1] = objArrA[i11];
                } else {
                    if (i84 == 12 && (c1Var.getSyntax().equals(z0.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i30 = i11 + 1;
                        objArr[((i69 / 3) * 2) + 1] = objArrA[i11];
                    }
                    i31 = iCharAt12 * 2;
                    obj = objArrA[i31];
                    if (obj instanceof Field) {
                        fieldX2 = (Field) obj;
                    } else {
                        fieldX2 = X(cls, (String) obj);
                        objArrA[i31] = fieldX2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldX2);
                    i32 = i31 + 1;
                    obj2 = objArrA[i32];
                    if (obj2 instanceof Field) {
                        fieldX3 = (Field) obj2;
                    } else {
                        fieldX3 = X(cls, (String) obj2);
                        objArrA[i32] = fieldX3;
                    }
                    strB = strB;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX3);
                    i26 = i85;
                    i27 = 0;
                }
                i11 = i30;
                i31 = iCharAt12 * 2;
                obj = objArrA[i31];
                if (obj instanceof Field) {
                    fieldX2 = (Field) obj;
                } else {
                    fieldX2 = X(cls, (String) obj);
                    objArrA[i31] = fieldX2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldX2);
                i32 = i31 + 1;
                obj2 = objArrA[i32];
                if (obj2 instanceof Field) {
                    fieldX3 = (Field) obj2;
                } else {
                    fieldX3 = X(cls, (String) obj2);
                    objArrA[i32] = fieldX3;
                }
                strB = strB;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX3);
                i26 = i85;
                i27 = 0;
            } else {
                int i86 = i11 + 1;
                Field fieldX4 = X(cls, (String) objArrA[i11]);
                if (i78 == 9 || i78 == 17) {
                    z10 = true;
                    objArr[((i69 / 3) * 2) + 1] = fieldX4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        z10 = true;
                        i29 = i86 + 1;
                        objArr[((i69 / 3) * 2) + 1] = objArrA[i86];
                    } else {
                        if (i78 == 12 || i78 == 30 || i78 == 44) {
                            if (c1Var.getSyntax() == z0.PROTO2 || (iCharAt11 & 2048) != 0) {
                                z10 = true;
                                i29 = i86 + 1;
                                objArr[((i69 / 3) * 2) + 1] = objArrA[i86];
                            }
                        } else if (i78 == 50) {
                            int i87 = i66 + 1;
                            iArr[i66] = i69;
                            int i88 = (i69 / 3) * 2;
                            int i89 = i86 + 1;
                            objArr[i88] = objArrA[i86];
                            if ((iCharAt11 & 2048) != 0) {
                                i86 = i89 + 1;
                                objArr[i88 + 1] = objArrA[i89];
                                i66 = i87;
                            } else {
                                i66 = i87;
                                i86 = i89;
                            }
                        }
                        z10 = true;
                    }
                    i86 = i29;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldX4);
                if (!((iCharAt11 & 4096) != 0 ? z10 : false) || i78 > 17) {
                    iObjectFieldOffset = 1048575;
                    i26 = i25;
                    i27 = 0;
                } else {
                    i26 = i25 + 1;
                    int iCharAt13 = strB.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i90 = iCharAt13 & 8191;
                        int i91 = 13;
                        while (true) {
                            i28 = i26 + 1;
                            cCharAt9 = strB.charAt(i26);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i90 |= (cCharAt9 & 8191) << i91;
                            i91 += 13;
                            i26 = i28;
                        }
                        iCharAt13 = i90 | (cCharAt9 << i91);
                        i26 = i28;
                    }
                    int i92 = (i12 * 2) + (iCharAt13 / 32);
                    Object obj3 = objArrA[i92];
                    if (obj3 instanceof Field) {
                        fieldX = (Field) obj3;
                    } else {
                        fieldX = X(cls, (String) obj3);
                        objArrA[i92] = fieldX;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldX);
                    i27 = iCharAt13 % 32;
                }
                if (i78 >= 18 && i78 <= 49) {
                    iArr[i67] = iObjectFieldOffset3;
                    i67++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i11 = i86;
            }
            int i93 = i69 + 1;
            iArr2[i69] = iCharAt10;
            int i94 = i93 + 1;
            int i95 = i12;
            Unsafe unsafe2 = unsafe;
            iArr2[i93] = iObjectFieldOffset2 | (i78 << 20) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0);
            int i96 = i94 + 1;
            iArr2[i94] = iObjectFieldOffset | (i27 << 20);
            i38 = i26;
            i12 = i95;
            unsafe = unsafe2;
            i68 = i80;
            strB = strB;
            i14 = i14;
            c10 = 55296;
            i69 = i96;
            length = i79;
        }
        return new s0<>(iArr2, objArr, i14, i15, c1Var.getDefaultInstance(), c1Var.getSyntax(), false, iArr, i13, i65, u0Var, d0Var, k1Var, oVar, k0Var);
    }

    private int K(int i10) {
        return this.f2305a[i10];
    }

    private static long L(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean M(T t10, long j10) {
        return ((Boolean) n1.z(t10, j10)).booleanValue();
    }

    private static <T> double N(T t10, long j10) {
        return ((Double) n1.z(t10, j10)).doubleValue();
    }

    private static <T> float O(T t10, long j10) {
        return ((Float) n1.z(t10, j10)).floatValue();
    }

    private static <T> int P(T t10, long j10) {
        return ((Integer) n1.z(t10, j10)).intValue();
    }

    private static <T> long Q(T t10, long j10) {
        return ((Long) n1.z(t10, j10)).longValue();
    }

    private int R(int i10) {
        if (i10 < this.f2307c || i10 > this.f2308d) {
            return -1;
        }
        return a0(i10, 0);
    }

    private int S(int i10) {
        return this.f2305a[i10 + 2];
    }

    private <E> void T(Object obj, long j10, d1 d1Var, e1<E> e1Var, n nVar) throws IOException {
        d1Var.g(this.f2318n.c(obj, j10), e1Var, nVar);
    }

    private <E> void U(Object obj, int i10, d1 d1Var, e1<E> e1Var, n nVar) throws IOException {
        d1Var.b(this.f2318n.c(obj, L(i10)), e1Var, nVar);
    }

    private void V(Object obj, int i10, d1 d1Var) throws IOException {
        if (p(i10)) {
            n1.O(obj, L(i10), d1Var.readStringRequireUtf8());
        } else if (this.f2311g) {
            n1.O(obj, L(i10), d1Var.readString());
        } else {
            n1.O(obj, L(i10), d1Var.readBytes());
        }
    }

    private void W(Object obj, int i10, d1 d1Var) throws IOException {
        if (p(i10)) {
            d1Var.readStringListRequireUtf8(this.f2318n.c(obj, L(i10)));
        } else {
            d1Var.readStringList(this.f2318n.c(obj, L(i10)));
        }
    }

    private static Field X(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void Y(T t10, int i10) {
        int iS = S(i10);
        long j10 = 1048575 & iS;
        if (j10 == 1048575) {
            return;
        }
        n1.M(t10, j10, (1 << (iS >>> 20)) | n1.w(t10, j10));
    }

    private void Z(T t10, int i10, int i11) {
        n1.M(t10, S(i11) & 1048575, i10);
    }

    private int a0(int i10, int i11) {
        int length = (this.f2305a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iK = K(i13);
            if (i10 == iK) {
                return i13;
            }
            if (i10 < iK) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void b0(T t10, int i10, Object obj) {
        f2304s.putObject(t10, L(e0(i10)), obj);
        Y(t10, i10);
    }

    private boolean c(T t10, T t11, int i10) {
        return q(t10, i10) == q(t11, i10);
    }

    private void c0(T t10, int i10, int i11, Object obj) {
        f2304s.putObject(t10, L(e0(i11)), obj);
        Z(t10, i10, i11);
    }

    private static <T> boolean d(T t10, long j10) {
        return n1.p(t10, j10);
    }

    private static int d0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static void e(Object obj) {
        if (v(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private int e0(int i10) {
        return this.f2305a[i10 + 1];
    }

    private static <T> double f(T t10, long j10) {
        return n1.u(t10, j10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void f0(T t10, q1 q1Var) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i10;
        Map.Entry<?, ?> entry2;
        int i11;
        int i12;
        Map.Entry<?, ?> entry3;
        boolean z10;
        if (this.f2310f) {
            s<T> sVarC = this.f2320p.c(t10);
            if (sVarC.n()) {
                entry = null;
                it = null;
            } else {
                Iterator itT = sVarC.t();
                entry = (Map.Entry) itT.next();
                it = itT;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = this.f2305a.length;
        Unsafe unsafe = f2304s;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            int iE0 = e0(i16);
            int iK = K(i16);
            int iD0 = d0(iE0);
            if (iD0 <= 17) {
                int i17 = this.f2305a[i16 + 2];
                int i18 = i17 & i13;
                if (i18 != i14) {
                    i15 = i18 == i13 ? 0 : unsafe.getInt(t10, i18);
                    i14 = i18;
                } else {
                    entry = entry;
                }
                int i19 = 1 << (i17 >>> 20);
                i10 = i14;
                i11 = i19;
                entry2 = entry;
            } else {
                i10 = i14;
                entry2 = entry;
                i11 = 0;
            }
            int i20 = i15;
            while (entry2 != null && this.f2320p.a(entry2) <= iK) {
                this.f2320p.j(q1Var, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jL = L(iE0);
            switch (iD0) {
                case 0:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeDouble(iK, f(t10, jL));
                    }
                    break;
                case 1:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeFloat(iK, j(t10, jL));
                    }
                    break;
                case 2:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeInt64(iK, unsafe.getLong(t10, jL));
                    }
                    break;
                case 3:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeUInt64(iK, unsafe.getLong(t10, jL));
                    }
                    break;
                case 4:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeInt32(iK, unsafe.getInt(t10, jL));
                    }
                    break;
                case 5:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeFixed64(iK, unsafe.getLong(t10, jL));
                    }
                    break;
                case 6:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeFixed32(iK, unsafe.getInt(t10, jL));
                    }
                    break;
                case 7:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeBool(iK, d(t10, jL));
                    }
                    break;
                case 8:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        i0(iK, unsafe.getObject(t10, jL), q1Var);
                    }
                    break;
                case 9:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.c(iK, unsafe.getObject(t10, jL), m(i16));
                    }
                    break;
                case 10:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.b(iK, (g) unsafe.getObject(t10, jL));
                    }
                    break;
                case 11:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeUInt32(iK, unsafe.getInt(t10, jL));
                    }
                    break;
                case 12:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeEnum(iK, unsafe.getInt(t10, jL));
                    }
                    break;
                case 13:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeSFixed32(iK, unsafe.getInt(t10, jL));
                    }
                    break;
                case 14:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeSFixed64(iK, unsafe.getLong(t10, jL));
                    }
                    break;
                case 15:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeSInt32(iK, unsafe.getInt(t10, jL));
                    }
                    break;
                case 16:
                    i12 = length;
                    entry3 = entry2;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.writeSInt64(iK, unsafe.getLong(t10, jL));
                    }
                    break;
                case 17:
                    entry3 = entry2;
                    i12 = length;
                    if (r(t10, i16, i10, i20, i11)) {
                        q1Var.e(iK, unsafe.getObject(t10, jL), m(i16));
                    }
                    break;
                case 18:
                    z10 = false;
                    g1.O(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 19:
                    z10 = false;
                    g1.S(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 20:
                    z10 = false;
                    g1.V(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 21:
                    z10 = false;
                    g1.d0(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 22:
                    z10 = false;
                    g1.U(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 23:
                    z10 = false;
                    g1.R(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 24:
                    z10 = false;
                    g1.Q(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 25:
                    z10 = false;
                    g1.M(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 26:
                    g1.b0(K(i16), (List) unsafe.getObject(t10, jL), q1Var);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 27:
                    g1.W(K(i16), (List) unsafe.getObject(t10, jL), q1Var, m(i16));
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 28:
                    g1.N(K(i16), (List) unsafe.getObject(t10, jL), q1Var);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 29:
                    z10 = false;
                    g1.c0(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 30:
                    z10 = false;
                    g1.P(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 31:
                    z10 = false;
                    g1.X(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 32:
                    z10 = false;
                    g1.Y(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 33:
                    z10 = false;
                    g1.Z(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 34:
                    z10 = false;
                    g1.a0(K(i16), (List) unsafe.getObject(t10, jL), q1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 35:
                    g1.O(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 36:
                    g1.S(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 37:
                    g1.V(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 38:
                    g1.d0(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 39:
                    g1.U(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 40:
                    g1.R(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 41:
                    g1.Q(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 42:
                    g1.M(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 43:
                    g1.c0(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 44:
                    g1.P(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 45:
                    g1.X(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 46:
                    g1.Y(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 47:
                    g1.Z(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 48:
                    g1.a0(K(i16), (List) unsafe.getObject(t10, jL), q1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 49:
                    g1.T(K(i16), (List) unsafe.getObject(t10, jL), q1Var, m(i16));
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 50:
                    h0(q1Var, iK, unsafe.getObject(t10, jL), i16);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 51:
                    if (x(t10, iK, i16)) {
                        q1Var.writeDouble(iK, N(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 52:
                    if (x(t10, iK, i16)) {
                        q1Var.writeFloat(iK, O(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 53:
                    if (x(t10, iK, i16)) {
                        q1Var.writeInt64(iK, Q(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 54:
                    if (x(t10, iK, i16)) {
                        q1Var.writeUInt64(iK, Q(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 55:
                    if (x(t10, iK, i16)) {
                        q1Var.writeInt32(iK, P(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 56:
                    if (x(t10, iK, i16)) {
                        q1Var.writeFixed64(iK, Q(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 57:
                    if (x(t10, iK, i16)) {
                        q1Var.writeFixed32(iK, P(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 58:
                    if (x(t10, iK, i16)) {
                        q1Var.writeBool(iK, M(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 59:
                    if (x(t10, iK, i16)) {
                        i0(iK, unsafe.getObject(t10, jL), q1Var);
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 60:
                    if (x(t10, iK, i16)) {
                        q1Var.c(iK, unsafe.getObject(t10, jL), m(i16));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 61:
                    if (x(t10, iK, i16)) {
                        q1Var.b(iK, (g) unsafe.getObject(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 62:
                    if (x(t10, iK, i16)) {
                        q1Var.writeUInt32(iK, P(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 63:
                    if (x(t10, iK, i16)) {
                        q1Var.writeEnum(iK, P(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 64:
                    if (x(t10, iK, i16)) {
                        q1Var.writeSFixed32(iK, P(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 65:
                    if (x(t10, iK, i16)) {
                        q1Var.writeSFixed64(iK, Q(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 66:
                    if (x(t10, iK, i16)) {
                        q1Var.writeSInt32(iK, P(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 67:
                    if (x(t10, iK, i16)) {
                        q1Var.writeSInt64(iK, Q(t10, jL));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 68:
                    if (x(t10, iK, i16)) {
                        q1Var.e(iK, unsafe.getObject(t10, jL), m(i16));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                default:
                    i12 = length;
                    entry3 = entry2;
                    break;
            }
            i16 += 3;
            i14 = i10;
            entry = entry3;
            i15 = i20;
            length = i12;
            i13 = 1048575;
        }
        while (entry != null) {
            this.f2320p.j(q1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        j0(this.f2319o, t10, q1Var);
    }

    private boolean g(T t10, T t11, int i10) {
        int iE0 = e0(i10);
        long jL = L(iE0);
        switch (d0(iE0)) {
            case 0:
                return c(t10, t11, i10) && Double.doubleToLongBits(n1.u(t10, jL)) == Double.doubleToLongBits(n1.u(t11, jL));
            case 1:
                return c(t10, t11, i10) && Float.floatToIntBits(n1.v(t10, jL)) == Float.floatToIntBits(n1.v(t11, jL));
            case 2:
                return c(t10, t11, i10) && n1.x(t10, jL) == n1.x(t11, jL);
            case 3:
                return c(t10, t11, i10) && n1.x(t10, jL) == n1.x(t11, jL);
            case 4:
                return c(t10, t11, i10) && n1.w(t10, jL) == n1.w(t11, jL);
            case 5:
                return c(t10, t11, i10) && n1.x(t10, jL) == n1.x(t11, jL);
            case 6:
                return c(t10, t11, i10) && n1.w(t10, jL) == n1.w(t11, jL);
            case 7:
                return c(t10, t11, i10) && n1.p(t10, jL) == n1.p(t11, jL);
            case 8:
                return c(t10, t11, i10) && g1.I(n1.z(t10, jL), n1.z(t11, jL));
            case 9:
                return c(t10, t11, i10) && g1.I(n1.z(t10, jL), n1.z(t11, jL));
            case 10:
                return c(t10, t11, i10) && g1.I(n1.z(t10, jL), n1.z(t11, jL));
            case 11:
                return c(t10, t11, i10) && n1.w(t10, jL) == n1.w(t11, jL);
            case 12:
                return c(t10, t11, i10) && n1.w(t10, jL) == n1.w(t11, jL);
            case 13:
                return c(t10, t11, i10) && n1.w(t10, jL) == n1.w(t11, jL);
            case 14:
                return c(t10, t11, i10) && n1.x(t10, jL) == n1.x(t11, jL);
            case 15:
                return c(t10, t11, i10) && n1.w(t10, jL) == n1.w(t11, jL);
            case 16:
                return c(t10, t11, i10) && n1.x(t10, jL) == n1.x(t11, jL);
            case 17:
                return c(t10, t11, i10) && g1.I(n1.z(t10, jL), n1.z(t11, jL));
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
                return g1.I(n1.z(t10, jL), n1.z(t11, jL));
            case 50:
                return g1.I(n1.z(t10, jL), n1.z(t11, jL));
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
                return w(t10, t11, i10) && g1.I(n1.z(t10, jL), n1.z(t11, jL));
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void g0(T t10, q1 q1Var) throws IOException {
        Iterator itG;
        Map.Entry<?, ?> entry;
        j0(this.f2319o, t10, q1Var);
        if (this.f2310f) {
            s<T> sVarC = this.f2320p.c(t10);
            if (sVarC.n()) {
                itG = null;
                entry = null;
            } else {
                itG = sVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f2305a.length - 3; length >= 0; length -= 3) {
            int iE0 = e0(length);
            int iK = K(length);
            while (entry != null && this.f2320p.a(entry) > iK) {
                this.f2320p.j(q1Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (d0(iE0)) {
                case 0:
                    if (q(t10, length)) {
                        q1Var.writeDouble(iK, f(t10, L(iE0)));
                    }
                    break;
                case 1:
                    if (q(t10, length)) {
                        q1Var.writeFloat(iK, j(t10, L(iE0)));
                    }
                    break;
                case 2:
                    if (q(t10, length)) {
                        q1Var.writeInt64(iK, z(t10, L(iE0)));
                    }
                    break;
                case 3:
                    if (q(t10, length)) {
                        q1Var.writeUInt64(iK, z(t10, L(iE0)));
                    }
                    break;
                case 4:
                    if (q(t10, length)) {
                        q1Var.writeInt32(iK, o(t10, L(iE0)));
                    }
                    break;
                case 5:
                    if (q(t10, length)) {
                        q1Var.writeFixed64(iK, z(t10, L(iE0)));
                    }
                    break;
                case 6:
                    if (q(t10, length)) {
                        q1Var.writeFixed32(iK, o(t10, L(iE0)));
                    }
                    break;
                case 7:
                    if (q(t10, length)) {
                        q1Var.writeBool(iK, d(t10, L(iE0)));
                    }
                    break;
                case 8:
                    if (q(t10, length)) {
                        i0(iK, n1.z(t10, L(iE0)), q1Var);
                    }
                    break;
                case 9:
                    if (q(t10, length)) {
                        q1Var.c(iK, n1.z(t10, L(iE0)), m(length));
                    }
                    break;
                case 10:
                    if (q(t10, length)) {
                        q1Var.b(iK, (g) n1.z(t10, L(iE0)));
                    }
                    break;
                case 11:
                    if (q(t10, length)) {
                        q1Var.writeUInt32(iK, o(t10, L(iE0)));
                    }
                    break;
                case 12:
                    if (q(t10, length)) {
                        q1Var.writeEnum(iK, o(t10, L(iE0)));
                    }
                    break;
                case 13:
                    if (q(t10, length)) {
                        q1Var.writeSFixed32(iK, o(t10, L(iE0)));
                    }
                    break;
                case 14:
                    if (q(t10, length)) {
                        q1Var.writeSFixed64(iK, z(t10, L(iE0)));
                    }
                    break;
                case 15:
                    if (q(t10, length)) {
                        q1Var.writeSInt32(iK, o(t10, L(iE0)));
                    }
                    break;
                case 16:
                    if (q(t10, length)) {
                        q1Var.writeSInt64(iK, z(t10, L(iE0)));
                    }
                    break;
                case 17:
                    if (q(t10, length)) {
                        q1Var.e(iK, n1.z(t10, L(iE0)), m(length));
                    }
                    break;
                case 18:
                    g1.O(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 19:
                    g1.S(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 20:
                    g1.V(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 21:
                    g1.d0(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 22:
                    g1.U(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 23:
                    g1.R(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 24:
                    g1.Q(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 25:
                    g1.M(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 26:
                    g1.b0(K(length), (List) n1.z(t10, L(iE0)), q1Var);
                    break;
                case 27:
                    g1.W(K(length), (List) n1.z(t10, L(iE0)), q1Var, m(length));
                    break;
                case 28:
                    g1.N(K(length), (List) n1.z(t10, L(iE0)), q1Var);
                    break;
                case 29:
                    g1.c0(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 30:
                    g1.P(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 31:
                    g1.X(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 32:
                    g1.Y(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 33:
                    g1.Z(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 34:
                    g1.a0(K(length), (List) n1.z(t10, L(iE0)), q1Var, false);
                    break;
                case 35:
                    g1.O(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 36:
                    g1.S(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 37:
                    g1.V(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 38:
                    g1.d0(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 39:
                    g1.U(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 40:
                    g1.R(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 41:
                    g1.Q(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 42:
                    g1.M(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 43:
                    g1.c0(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 44:
                    g1.P(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 45:
                    g1.X(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 46:
                    g1.Y(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 47:
                    g1.Z(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 48:
                    g1.a0(K(length), (List) n1.z(t10, L(iE0)), q1Var, true);
                    break;
                case 49:
                    g1.T(K(length), (List) n1.z(t10, L(iE0)), q1Var, m(length));
                    break;
                case 50:
                    h0(q1Var, iK, n1.z(t10, L(iE0)), length);
                    break;
                case 51:
                    if (x(t10, iK, length)) {
                        q1Var.writeDouble(iK, N(t10, L(iE0)));
                    }
                    break;
                case 52:
                    if (x(t10, iK, length)) {
                        q1Var.writeFloat(iK, O(t10, L(iE0)));
                    }
                    break;
                case 53:
                    if (x(t10, iK, length)) {
                        q1Var.writeInt64(iK, Q(t10, L(iE0)));
                    }
                    break;
                case 54:
                    if (x(t10, iK, length)) {
                        q1Var.writeUInt64(iK, Q(t10, L(iE0)));
                    }
                    break;
                case 55:
                    if (x(t10, iK, length)) {
                        q1Var.writeInt32(iK, P(t10, L(iE0)));
                    }
                    break;
                case 56:
                    if (x(t10, iK, length)) {
                        q1Var.writeFixed64(iK, Q(t10, L(iE0)));
                    }
                    break;
                case 57:
                    if (x(t10, iK, length)) {
                        q1Var.writeFixed32(iK, P(t10, L(iE0)));
                    }
                    break;
                case 58:
                    if (x(t10, iK, length)) {
                        q1Var.writeBool(iK, M(t10, L(iE0)));
                    }
                    break;
                case 59:
                    if (x(t10, iK, length)) {
                        i0(iK, n1.z(t10, L(iE0)), q1Var);
                    }
                    break;
                case 60:
                    if (x(t10, iK, length)) {
                        q1Var.c(iK, n1.z(t10, L(iE0)), m(length));
                    }
                    break;
                case 61:
                    if (x(t10, iK, length)) {
                        q1Var.b(iK, (g) n1.z(t10, L(iE0)));
                    }
                    break;
                case 62:
                    if (x(t10, iK, length)) {
                        q1Var.writeUInt32(iK, P(t10, L(iE0)));
                    }
                    break;
                case 63:
                    if (x(t10, iK, length)) {
                        q1Var.writeEnum(iK, P(t10, L(iE0)));
                    }
                    break;
                case 64:
                    if (x(t10, iK, length)) {
                        q1Var.writeSFixed32(iK, P(t10, L(iE0)));
                    }
                    break;
                case 65:
                    if (x(t10, iK, length)) {
                        q1Var.writeSFixed64(iK, Q(t10, L(iE0)));
                    }
                    break;
                case 66:
                    if (x(t10, iK, length)) {
                        q1Var.writeSInt32(iK, P(t10, L(iE0)));
                    }
                    break;
                case 67:
                    if (x(t10, iK, length)) {
                        q1Var.writeSInt64(iK, Q(t10, L(iE0)));
                    }
                    break;
                case 68:
                    if (x(t10, iK, length)) {
                        q1Var.e(iK, n1.z(t10, L(iE0)), m(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f2320p.j(q1Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    private <UT, UB> UB h(Object obj, int i10, UB ub2, k1<UT, UB> k1Var, Object obj2) {
        y.e eVarK;
        int iK = K(i10);
        Object objZ = n1.z(obj, L(e0(i10)));
        return (objZ == null || (eVarK = k(i10)) == null) ? ub2 : (UB) i(i10, iK, this.f2321q.forMutableMapData(objZ), eVarK, ub2, k1Var, obj2);
    }

    private <K, V> void h0(q1 q1Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            q1Var.d(i10, this.f2321q.forMapMetadata(l(i11)), this.f2321q.forMapData(obj));
        }
    }

    private <K, V, UT, UB> UB i(int i10, int i11, Map<K, V> map, y.e eVar, UB ub2, k1<UT, UB> k1Var, Object obj) {
        i0.a<?, ?> aVarForMapMetadata = this.f2321q.forMapMetadata(l(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = k1Var.f(obj);
                }
                g.h hVarW = g.w(i0.b(aVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    i0.e(hVarW.b(), aVarForMapMetadata, next.getKey(), next.getValue());
                    k1Var.d(ub2, i11, hVarW.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void i0(int i10, Object obj, q1 q1Var) throws IOException {
        if (obj instanceof String) {
            q1Var.writeString(i10, (String) obj);
        } else {
            q1Var.b(i10, (g) obj);
        }
    }

    private static <T> float j(T t10, long j10) {
        return n1.v(t10, j10);
    }

    private <UT, UB> void j0(k1<UT, UB> k1Var, T t10, q1 q1Var) throws IOException {
        k1Var.t(k1Var.g(t10), q1Var);
    }

    private y.e k(int i10) {
        return (y.e) this.f2306b[((i10 / 3) * 2) + 1];
    }

    private Object l(int i10) {
        return this.f2306b[(i10 / 3) * 2];
    }

    private e1 m(int i10) {
        int i11 = (i10 / 3) * 2;
        e1 e1Var = (e1) this.f2306b[i11];
        if (e1Var != null) {
            return e1Var;
        }
        e1<T> e1VarC = a1.a().c((Class) this.f2306b[i11 + 1]);
        this.f2306b[i11] = e1VarC;
        return e1VarC;
    }

    private <UT, UB> int n(k1<UT, UB> k1Var, T t10) {
        return k1Var.h(k1Var.g(t10));
    }

    private static <T> int o(T t10, long j10) {
        return n1.w(t10, j10);
    }

    private static boolean p(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean q(T t10, int i10) {
        int iS = S(i10);
        long j10 = 1048575 & iS;
        if (j10 != 1048575) {
            return (n1.w(t10, j10) & (1 << (iS >>> 20))) != 0;
        }
        int iE0 = e0(i10);
        long jL = L(iE0);
        switch (d0(iE0)) {
            case 0:
                return Double.doubleToRawLongBits(n1.u(t10, jL)) != 0;
            case 1:
                return Float.floatToRawIntBits(n1.v(t10, jL)) != 0;
            case 2:
                return n1.x(t10, jL) != 0;
            case 3:
                return n1.x(t10, jL) != 0;
            case 4:
                return n1.w(t10, jL) != 0;
            case 5:
                return n1.x(t10, jL) != 0;
            case 6:
                return n1.w(t10, jL) != 0;
            case 7:
                return n1.p(t10, jL);
            case 8:
                Object objZ = n1.z(t10, jL);
                if (objZ instanceof String) {
                    return !((String) objZ).isEmpty();
                }
                if (objZ instanceof g) {
                    return !g.f2126b.equals(objZ);
                }
                throw new IllegalArgumentException();
            case 9:
                return n1.z(t10, jL) != null;
            case 10:
                return !g.f2126b.equals(n1.z(t10, jL));
            case 11:
                return n1.w(t10, jL) != 0;
            case 12:
                return n1.w(t10, jL) != 0;
            case 13:
                return n1.w(t10, jL) != 0;
            case 14:
                return n1.x(t10, jL) != 0;
            case 15:
                return n1.w(t10, jL) != 0;
            case 16:
                return n1.x(t10, jL) != 0;
            case 17:
                return n1.z(t10, jL) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean r(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return q(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean s(Object obj, int i10, e1 e1Var) {
        return e1Var.isInitialized(n1.z(obj, L(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean t(Object obj, int i10, int i11) {
        List list = (List) n1.z(obj, L(i10));
        if (list.isEmpty()) {
            return true;
        }
        e1 e1VarM = m(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!e1VarM.isInitialized(list.get(i12))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.e1] */
    private boolean u(T t10, int i10, int i11) {
        Map<?, ?> mapForMapData = this.f2321q.forMapData(n1.z(t10, L(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f2321q.forMapMetadata(l(i11)).f2199c.b() != p1.c.MESSAGE) {
            return true;
        }
        ?? C = 0;
        for (Object obj : mapForMapData.values()) {
            if (C == 0) {
                C = C;
                C = a1.a().c(obj.getClass());
            }
            C = C;
            if (!C.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).B();
        }
        return true;
    }

    private boolean w(T t10, T t11, int i10) {
        long jS = S(i10) & 1048575;
        return n1.w(t10, jS) == n1.w(t11, jS);
    }

    private boolean x(T t10, int i10, int i11) {
        return n1.w(t10, (long) (S(i11) & 1048575)) == i10;
    }

    private static boolean y(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static <T> long z(T t10, long j10) {
        return n1.x(t10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void a(T t10, d1 d1Var, n nVar) throws Throwable {
        nVar.getClass();
        e(t10);
        A(this.f2319o, this.f2320p, t10, d1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void b(T t10, q1 q1Var) throws IOException {
        if (q1Var.fieldOrder() == q1.a.DESCENDING) {
            g0(t10, q1Var);
        } else {
            f0(t10, q1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public boolean equals(T t10, T t11) {
        int length = this.f2305a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!g(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f2319o.g(t10).equals(this.f2319o.g(t11))) {
            return false;
        }
        if (this.f2310f) {
            return this.f2320p.c(t10).equals(this.f2320p.c(t11));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // androidx.datastore.preferences.protobuf.e1
    public int getSerializedSize(T t10) {
        int i10;
        ?? r16;
        ?? r17;
        ?? r10;
        ?? r15;
        int i11;
        int iD;
        int iH;
        int i12;
        int iU;
        int iW;
        ?? r11;
        int i13;
        Unsafe unsafe = f2304s;
        ?? r12 = 0;
        int i14 = 1048575;
        ?? r13 = 0;
        int i15 = 0;
        int iK = 0;
        int i16 = 1048575;
        while (i15 < this.f2305a.length) {
            int iE0 = e0(i15);
            int iD0 = d0(iE0);
            int iK2 = K(i15);
            int i17 = this.f2305a[i15 + 2];
            int i18 = i17 & i14;
            if (iD0 <= 17) {
                if (i18 != i16) {
                    r11 = i18 == i14 ? r12 : unsafe.getInt(t10, i18 == true ? 1L : 0L);
                    i13 = i18 == true ? 1 : 0;
                }
                i10 = i13;
                r16 = r11;
                r17 = 1 << (i17 >>> 20);
            } else {
                i13 = i16;
                r11 = r13;
                i10 = i16 == true ? 1 : 0;
                r16 = r13 == true ? 1 : 0;
                r17 = r12;
            }
            long jL = L(iE0);
            if (iD0 < t.O.b() || iD0 > t.f2323b0.b()) {
                r10 = i18;
                r10 = r12;
            }
            r10 = i18;
            ?? r14 = r10;
            switch (iD0) {
                case 0:
                    r15 = r12;
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        i11 = CodedOutputStream.i(iK2, 0.0d);
                        r15 = r15;
                        iK += i11;
                    }
                    break;
                case 1:
                    r15 = r12;
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        i11 = CodedOutputStream.q(iK2, 0.0f);
                        r15 = r15;
                        iK += i11;
                    }
                    break;
                case 2:
                    r15 = r12;
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        i11 = CodedOutputStream.x(iK2, unsafe.getLong(t10, jL));
                        r15 = r15;
                        iK += i11;
                    }
                    break;
                case 3:
                    r15 = r12;
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        i11 = CodedOutputStream.X(iK2, unsafe.getLong(t10, jL));
                        r15 = r15;
                        iK += i11;
                    }
                    break;
                case 4:
                    r15 = r12;
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        i11 = CodedOutputStream.v(iK2, unsafe.getInt(t10, jL));
                        r15 = r15;
                        iK += i11;
                    }
                    break;
                case 5:
                    r15 = r12;
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        i11 = CodedOutputStream.o(iK2, 0L);
                        r15 = r15;
                        iK += i11;
                    }
                    break;
                case 6:
                    if (!r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        r15 = 0;
                    } else {
                        r15 = 0;
                        i11 = CodedOutputStream.m(iK2, 0);
                        iK += i11;
                    }
                    break;
                case 7:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.d(iK2, true);
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 8:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        Object object = unsafe.getObject(t10, jL);
                        iD = object instanceof g ? CodedOutputStream.g(iK2, (g) object) : CodedOutputStream.S(iK2, (String) object);
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 9:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = g1.o(iK2, unsafe.getObject(t10, jL), m(i15));
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 10:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.g(iK2, (g) unsafe.getObject(t10, jL));
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 11:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.V(iK2, unsafe.getInt(t10, jL));
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 12:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.k(iK2, unsafe.getInt(t10, jL));
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 13:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iK += CodedOutputStream.K(iK2, 0);
                    }
                    r15 = 0;
                    break;
                case 14:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.M(iK2, 0L);
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 15:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.O(iK2, unsafe.getInt(t10, jL));
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 16:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.Q(iK2, unsafe.getLong(t10, jL));
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 17:
                    if (r(t10, i15, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iD = CodedOutputStream.s(iK2, (p0) unsafe.getObject(t10, jL), m(i15));
                        iK += iD;
                    }
                    r15 = 0;
                    break;
                case 18:
                    iH = g1.h(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 19:
                    iH = g1.f(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 20:
                    iH = g1.m(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 21:
                    iH = g1.x(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 22:
                    iH = g1.k(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 23:
                    iH = g1.h(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 24:
                    iH = g1.f(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 25:
                    iH = g1.a(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 26:
                    iH = g1.u(iK2, (List) unsafe.getObject(t10, jL));
                    iK += iH;
                    r15 = r12;
                    break;
                case 27:
                    iH = g1.p(iK2, (List) unsafe.getObject(t10, jL), m(i15));
                    iK += iH;
                    r15 = r12;
                    break;
                case 28:
                    iH = g1.c(iK2, (List) unsafe.getObject(t10, jL));
                    iK += iH;
                    r15 = r12;
                    break;
                case 29:
                    iH = g1.v(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 30:
                    iH = g1.d(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 31:
                    iH = g1.f(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 32:
                    iH = g1.h(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 33:
                    iH = g1.q(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 34:
                    iH = g1.s(iK2, (List) unsafe.getObject(t10, jL), r12);
                    iK += iH;
                    r15 = r12;
                    break;
                case 35:
                    i12 = g1.i((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 36:
                    i12 = g1.g((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 37:
                    i12 = g1.n((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 38:
                    i12 = g1.y((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 39:
                    i12 = g1.l((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 40:
                    i12 = g1.i((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 41:
                    i12 = g1.g((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 42:
                    i12 = g1.b((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 43:
                    i12 = g1.w((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 44:
                    i12 = g1.e((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 45:
                    i12 = g1.g((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 46:
                    i12 = g1.i((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 47:
                    i12 = g1.r((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 48:
                    i12 = g1.t((List) unsafe.getObject(t10, jL));
                    if (i12 > 0) {
                        if (this.f2313i) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, i12);
                        }
                        iU = CodedOutputStream.U(iK2);
                        iW = CodedOutputStream.W(i12);
                        iH = iU + iW + i12;
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 49:
                    iH = g1.j(iK2, (List) unsafe.getObject(t10, jL), m(i15));
                    iK += iH;
                    r15 = r12;
                    break;
                case 50:
                    iH = this.f2321q.getSerializedSize(iK2, unsafe.getObject(t10, jL), l(i15));
                    iK += iH;
                    r15 = r12;
                    break;
                case 51:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.i(iK2, 0.0d);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 52:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.q(iK2, 0.0f);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 53:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.x(iK2, Q(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 54:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.X(iK2, Q(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 55:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.v(iK2, P(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 56:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.o(iK2, 0L);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 57:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.m(iK2, r12);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 58:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.d(iK2, true);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 59:
                    if (x(t10, iK2, i15)) {
                        Object object2 = unsafe.getObject(t10, jL);
                        iH = object2 instanceof g ? CodedOutputStream.g(iK2, (g) object2) : CodedOutputStream.S(iK2, (String) object2);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 60:
                    if (x(t10, iK2, i15)) {
                        iH = g1.o(iK2, unsafe.getObject(t10, jL), m(i15));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 61:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.g(iK2, (g) unsafe.getObject(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 62:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.V(iK2, P(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 63:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.k(iK2, P(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 64:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.K(iK2, r12);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 65:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.M(iK2, 0L);
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 66:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.O(iK2, P(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 67:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.Q(iK2, Q(t10, jL));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                case 68:
                    if (x(t10, iK2, i15)) {
                        iH = CodedOutputStream.s(iK2, (p0) unsafe.getObject(t10, jL), m(i15));
                        iK += iH;
                    }
                    r15 = r12;
                    break;
                default:
                    r15 = r12;
                    break;
            }
            i15 += 3;
            i16 = i10;
            r12 = r15;
            r13 = r16;
            i14 = 1048575;
        }
        int iN = iK + n(this.f2319o, t10);
        return this.f2310f ? iN + this.f2320p.c(t10).l() : iN;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int hashCode(T t10) {
        int i10;
        int iF;
        int length = this.f2305a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iE0 = e0(i12);
            int iK = K(i12);
            long jL = L(iE0);
            int iHashCode = 37;
            switch (d0(iE0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = y.f(Double.doubleToLongBits(n1.u(t10, jL)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(n1.v(t10, jL));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = y.f(n1.x(t10, jL));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = y.f(n1.x(t10, jL));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = n1.w(t10, jL);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = y.f(n1.x(t10, jL));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = n1.w(t10, jL);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = y.c(n1.p(t10, jL));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) n1.z(t10, jL)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = n1.z(t10, jL);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = n1.z(t10, jL).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = n1.w(t10, jL);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = n1.w(t10, jL);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = n1.w(t10, jL);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = y.f(n1.x(t10, jL));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = n1.w(t10, jL);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = y.f(n1.x(t10, jL));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = n1.z(t10, jL);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i10 = i11 * 53;
                    iF = n1.z(t10, jL).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = n1.z(t10, jL).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = y.f(Double.doubleToLongBits(N(t10, jL)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(O(t10, jL));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = y.f(Q(t10, jL));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = y.f(Q(t10, jL));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = P(t10, jL);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = y.f(Q(t10, jL));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = P(t10, jL);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = y.c(M(t10, jL));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) n1.z(t10, jL)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = n1.z(t10, jL).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = n1.z(t10, jL).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = P(t10, jL);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = P(t10, jL);
                        i11 = i10 + iF;
                    }
                    break;
                case 64:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = P(t10, jL);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = y.f(Q(t10, jL));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = P(t10, jL);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = y.f(Q(t10, jL));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (x(t10, iK, i12)) {
                        i10 = i11 * 53;
                        iF = n1.z(t10, jL).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f2319o.g(t10).hashCode();
        return this.f2310f ? (iHashCode2 * 53) + this.f2320p.c(t10).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.e1
    public final boolean isInitialized(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f2315k) {
            int i15 = this.f2314j[i14];
            int iK = K(i15);
            int iE0 = e0(i15);
            int i16 = this.f2305a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f2304s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (y(iE0) && !r(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iD0 = d0(iE0);
            if (iD0 == 9 || iD0 == 17) {
                if (r(t10, i15, i10, i11, i18) && !s(t10, iE0, m(i15))) {
                    return false;
                }
            } else if (iD0 == 27) {
                if (!t(t10, iE0, i15)) {
                    return false;
                }
            } else if (iD0 == 60 || iD0 == 68) {
                if (x(t10, iK, i15) && !s(t10, iE0, m(i15))) {
                    return false;
                }
            } else if (iD0 != 49) {
                if (iD0 == 50 && !u(t10, iE0, i15)) {
                    return false;
                }
            } else if (!t(t10, iE0, i15)) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f2310f || this.f2320p.c(t10).p();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e1
    public void makeImmutable(T t10) {
        if (v(t10)) {
            if (t10 instanceof w) {
                w wVar = (w) t10;
                wVar.n();
                wVar.m();
                wVar.D();
            }
            int length = this.f2305a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iE0 = e0(i10);
                long jL = L(iE0);
                int iD0 = d0(iE0);
                if (iD0 != 9) {
                    if (iD0 != 60 && iD0 != 68) {
                        switch (iD0) {
                            case 17:
                                if (q(t10, i10)) {
                                    m(i10).makeImmutable(f2304s.getObject(t10, jL));
                                }
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
                                this.f2318n.a(t10, jL);
                                break;
                            case 50:
                                Unsafe unsafe = f2304s;
                                Object object = unsafe.getObject(t10, jL);
                                if (object != null) {
                                    unsafe.putObject(t10, jL, this.f2321q.toImmutable(object));
                                }
                                break;
                        }
                    } else if (x(t10, K(i10), i10)) {
                        m(i10).makeImmutable(f2304s.getObject(t10, jL));
                    }
                } else if (q(t10, i10)) {
                    m(i10).makeImmutable(f2304s.getObject(t10, jL));
                }
            }
            this.f2319o.j(t10);
            if (this.f2310f) {
                this.f2320p.f(t10);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void mergeFrom(T t10, T t11) {
        e(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f2305a.length; i10 += 3) {
            E(t10, t11, i10);
        }
        g1.G(this.f2319o, t10, t11);
        if (this.f2310f) {
            g1.E(this.f2320p, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public T newInstance() {
        return (T) this.f2317m.newInstance(this.f2309e);
    }
}
