package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
final class p extends o<w.d> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2254a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f2254a = iArr;
            try {
                iArr[p1.b.f2259c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2254a[p1.b.f2260d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2254a[p1.b.f2261e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2254a[p1.b.f2262f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2254a[p1.b.f2263g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2254a[p1.b.f2264h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2254a[p1.b.f2265i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2254a[p1.b.f2266j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2254a[p1.b.f2271o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2254a[p1.b.f2273q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2254a[p1.b.f2274r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2254a[p1.b.f2275s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2254a[p1.b.f2276t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2254a[p1.b.f2272p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2254a[p1.b.f2270n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2254a[p1.b.f2267k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2254a[p1.b.f2268l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2254a[p1.b.f2269m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    p() {
    }

    @Override // androidx.datastore.preferences.protobuf.o
    int a(Map.Entry<?, ?> entry) {
        return ((w.d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.o
    Object b(n nVar, p0 p0Var, int i10) {
        return nVar.a(p0Var, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.o
    s<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.o
    s<w.d> d(Object obj) {
        return ((w.c) obj).N();
    }

    @Override // androidx.datastore.preferences.protobuf.o
    boolean e(p0 p0Var) {
        return p0Var instanceof w.c;
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void f(Object obj) {
        c(obj).u();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0205  */
    /* JADX WARN: Code duplicated, block: B:72:0x0213  */
    /* JADX WARN: Code duplicated, block: B:75:0x0218  */
    @Override // androidx.datastore.preferences.protobuf.o
    <UT, UB> UB g(Object obj, d1 d1Var, Object obj2, n nVar, s<w.d> sVar, UB ub2, k1<UT, UB> k1Var) throws IOException {
        int i10;
        Object objI;
        ArrayList arrayList;
        w.e eVar = (w.e) obj2;
        int iC = eVar.c();
        if (!eVar.f2379b.isRepeated() || !eVar.f2379b.isPacked()) {
            Object objG = null;
            if (eVar.a() == p1.b.f2272p) {
                d1Var.readInt32();
                eVar.f2379b.b();
                throw null;
            }
            int[] iArr = a.f2254a;
            switch (iArr[eVar.a().ordinal()]) {
                case 1:
                    objG = Double.valueOf(d1Var.readDouble());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if ((i10 != 17 || i10 == 18) && (objI = sVar.i(eVar.f2379b)) != null) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 2:
                    objG = Float.valueOf(d1Var.readFloat());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        objG = i10 != 17 ? y.g(objI, objG) : y.g(objI, objG);
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 3:
                    objG = Long.valueOf(d1Var.readInt64());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 4:
                    objG = Long.valueOf(d1Var.readUInt64());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 5:
                    objG = Integer.valueOf(d1Var.readInt32());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 6:
                    objG = Long.valueOf(d1Var.readFixed64());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 7:
                    objG = Integer.valueOf(d1Var.readFixed32());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 8:
                    objG = Boolean.valueOf(d1Var.readBool());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 9:
                    objG = Integer.valueOf(d1Var.readUInt32());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 10:
                    objG = Integer.valueOf(d1Var.readSFixed32());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 11:
                    objG = Long.valueOf(d1Var.readSFixed64());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 12:
                    objG = Integer.valueOf(d1Var.readSInt32());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 13:
                    objG = Long.valueOf(d1Var.readSInt64());
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objG = d1Var.readBytes();
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 16:
                    objG = d1Var.readString();
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 17:
                    if (!eVar.d()) {
                        Object objI2 = sVar.i(eVar.f2379b);
                        if (objI2 instanceof w) {
                            e1 e1VarD = a1.a().d(objI2);
                            if (!((w) objI2).B()) {
                                Object objNewInstance = e1VarD.newInstance();
                                e1VarD.mergeFrom(objNewInstance, objI2);
                                sVar.y(eVar.f2379b, objNewInstance);
                                objI2 = objNewInstance;
                            }
                            d1Var.f(objI2, e1VarD, nVar);
                            return ub2;
                        }
                    }
                    objG = d1Var.d(eVar.b().getClass(), nVar);
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                case 18:
                    if (!eVar.d()) {
                        Object objI3 = sVar.i(eVar.f2379b);
                        if (objI3 instanceof w) {
                            e1 e1VarD2 = a1.a().d(objI3);
                            if (!((w) objI3).B()) {
                                Object objNewInstance2 = e1VarD2.newInstance();
                                e1VarD2.mergeFrom(objNewInstance2, objI3);
                                sVar.y(eVar.f2379b, objNewInstance2);
                                objI3 = objNewInstance2;
                            }
                            d1Var.a(objI3, e1VarD2, nVar);
                            return ub2;
                        }
                    }
                    objG = d1Var.c(eVar.b().getClass(), nVar);
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
                default:
                    if (eVar.d()) {
                        i10 = iArr[eVar.a().ordinal()];
                        if (i10 != 17) {
                        }
                        sVar.y(eVar.f2379b, objG);
                    } else {
                        sVar.a(eVar.f2379b, objG);
                    }
                    break;
            }
        } else {
            switch (a.f2254a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    d1Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    d1Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    d1Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    d1Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    d1Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    d1Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    d1Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    d1Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    d1Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    d1Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    d1Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    d1Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    d1Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    d1Var.readEnumList(arrayList);
                    eVar.f2379b.b();
                    ub2 = (UB) g1.z(obj, iC, arrayList, null, ub2, k1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f2379b.getLiteType());
            }
            sVar.y(eVar.f2379b, arrayList);
        }
        return ub2;
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void h(d1 d1Var, Object obj, n nVar, s<w.d> sVar) throws IOException {
        w.e eVar = (w.e) obj;
        sVar.y(eVar.f2379b, d1Var.c(eVar.b().getClass(), nVar));
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void i(g gVar, Object obj, n nVar, s<w.d> sVar) throws IOException {
        w.e eVar = (w.e) obj;
        p0.a aVarNewBuilderForType = eVar.b().newBuilderForType();
        h hVarX = gVar.x();
        aVarNewBuilderForType.e(hVarX, nVar);
        sVar.y(eVar.f2379b, aVarNewBuilderForType.buildPartial());
        hVarX.a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.o
    void j(q1 q1Var, Map.Entry<?, ?> entry) throws IOException {
        w.d dVar = (w.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f2254a[dVar.getLiteType().ordinal()]) {
                case 1:
                    q1Var.writeDouble(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    q1Var.writeFloat(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    q1Var.writeInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    q1Var.writeUInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    q1Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    q1Var.writeFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    q1Var.writeFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    q1Var.writeBool(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    q1Var.writeUInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    q1Var.writeSFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    q1Var.writeSFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    q1Var.writeSInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    q1Var.writeSInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    q1Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    q1Var.b(dVar.getNumber(), (g) entry.getValue());
                    break;
                case 16:
                    q1Var.writeString(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    q1Var.e(dVar.getNumber(), entry.getValue(), a1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    q1Var.c(dVar.getNumber(), entry.getValue(), a1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f2254a[dVar.getLiteType().ordinal()]) {
            case 1:
                g1.O(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 2:
                g1.S(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 3:
                g1.V(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 4:
                g1.d0(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 5:
                g1.U(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 6:
                g1.R(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 7:
                g1.Q(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 8:
                g1.M(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 9:
                g1.c0(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 10:
                g1.X(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 11:
                g1.Y(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 12:
                g1.Z(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 13:
                g1.a0(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 14:
                g1.U(dVar.getNumber(), (List) entry.getValue(), q1Var, dVar.isPacked());
                break;
            case 15:
                g1.N(dVar.getNumber(), (List) entry.getValue(), q1Var);
                break;
            case 16:
                g1.b0(dVar.getNumber(), (List) entry.getValue(), q1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    g1.T(dVar.getNumber(), (List) entry.getValue(), q1Var, a1.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    g1.W(dVar.getNumber(), (List) entry.getValue(), q1Var, a1.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
