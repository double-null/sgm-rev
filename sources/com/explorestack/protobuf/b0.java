package com.explorestack.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
final class b0 extends z<i0.c> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10245a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10245a = iArr;
            try {
                iArr[c3.b.f10254c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10245a[c3.b.f10255d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10245a[c3.b.f10256e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10245a[c3.b.f10257f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10245a[c3.b.f10258g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10245a[c3.b.f10259h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10245a[c3.b.f10260i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10245a[c3.b.f10261j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10245a[c3.b.f10266o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10245a[c3.b.f10268q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10245a[c3.b.f10269r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10245a[c3.b.f10270s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10245a[c3.b.f10271t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10245a[c3.b.f10267p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10245a[c3.b.f10265n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10245a[c3.b.f10262k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10245a[c3.b.f10263l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10245a[c3.b.f10264m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    b0() {
    }

    @Override // com.explorestack.protobuf.z
    int a(Map.Entry<?, ?> entry) {
        return ((i0.c) entry.getKey()).getNumber();
    }

    @Override // com.explorestack.protobuf.z
    Object b(y yVar, MessageLite messageLite, int i10) {
        return yVar.a(messageLite, i10);
    }

    @Override // com.explorestack.protobuf.z
    e0<i0.c> c(Object obj) {
        return ((i0.b) obj).f10481d;
    }

    @Override // com.explorestack.protobuf.z
    e0<i0.c> d(Object obj) {
        return ((i0.b) obj).s();
    }

    @Override // com.explorestack.protobuf.z
    boolean e(MessageLite messageLite) {
        return messageLite instanceof i0.b;
    }

    @Override // com.explorestack.protobuf.z
    void f(Object obj) {
        c(obj).H();
    }

    @Override // com.explorestack.protobuf.z
    <UT, UB> UB g(y1 y1Var, Object obj, y yVar, e0<i0.c> e0Var, UB ub2, t2<UT, UB> t2Var) throws IOException {
        Object objValueOf;
        Object objT;
        ArrayList arrayList;
        i0.d dVar = (i0.d) obj;
        int iD = dVar.d();
        if (dVar.f10488b.isRepeated() && dVar.f10488b.isPacked()) {
            switch (a.f10245a[dVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    y1Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    y1Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    y1Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    y1Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    y1Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    y1Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    y1Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    y1Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    y1Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    y1Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    y1Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    y1Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    y1Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    y1Var.readEnumList(arrayList);
                    ub2 = (UB) d2.z(iD, arrayList, dVar.f10488b.b(), ub2, t2Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + dVar.f10488b.getLiteType());
            }
            e0Var.N(dVar.f10488b, arrayList);
        } else {
            if (dVar.b() != c3.b.f10267p) {
                switch (a.f10245a[dVar.b().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(y1Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(y1Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(y1Var.readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(y1Var.readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(y1Var.readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(y1Var.readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(y1Var.readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(y1Var.readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(y1Var.readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(y1Var.readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(y1Var.readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(y1Var.readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(y1Var.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = y1Var.readBytes();
                        break;
                    case 16:
                        objValueOf = y1Var.readString();
                        break;
                    case 17:
                        objValueOf = y1Var.g(dVar.c().getClass(), yVar);
                        break;
                    case 18:
                        objValueOf = y1Var.c(dVar.c().getClass(), yVar);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = y1Var.readInt32();
                if (dVar.f10488b.b().findValueByNumber(int32) == null) {
                    return (UB) d2.M(iD, int32, ub2, t2Var);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (dVar.e()) {
                e0Var.g(dVar.f10488b, objValueOf);
            } else {
                int i10 = a.f10245a[dVar.b().ordinal()];
                if ((i10 == 17 || i10 == 18) && (objT = e0Var.t(dVar.f10488b)) != null) {
                    objValueOf = l0.k(objT, objValueOf);
                }
                e0Var.N(dVar.f10488b, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.explorestack.protobuf.z
    void h(y1 y1Var, Object obj, y yVar, e0<i0.c> e0Var) throws IOException {
        i0.d dVar = (i0.d) obj;
        e0Var.N(dVar.f10488b, y1Var.c(dVar.c().getClass(), yVar));
    }

    @Override // com.explorestack.protobuf.z
    void i(ByteString byteString, Object obj, y yVar, e0<i0.c> e0Var) throws IOException {
        i0.d dVar = (i0.d) obj;
        MessageLite messageLiteBuildPartial = dVar.c().newBuilderForType().buildPartial();
        h hVarH = h.h(ByteBuffer.wrap(byteString.toByteArray()), true);
        v1.a().b(messageLiteBuildPartial, hVarH, yVar);
        e0Var.N(dVar.f10488b, messageLiteBuildPartial);
        if (hVarH.getFieldNumber() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.explorestack.protobuf.z
    void j(e3 e3Var, Map.Entry<?, ?> entry) throws IOException {
        i0.c cVar = (i0.c) entry.getKey();
        if (!cVar.isRepeated()) {
            switch (a.f10245a[cVar.getLiteType().ordinal()]) {
                case 1:
                    e3Var.writeDouble(cVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    e3Var.writeFloat(cVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    e3Var.writeInt64(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    e3Var.writeUInt64(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    e3Var.writeInt32(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    e3Var.writeFixed64(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    e3Var.writeFixed32(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    e3Var.writeBool(cVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    e3Var.writeUInt32(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    e3Var.writeSFixed32(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    e3Var.writeSFixed64(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    e3Var.writeSInt32(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    e3Var.writeSInt64(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    e3Var.writeInt32(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    e3Var.c(cVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    e3Var.writeString(cVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    e3Var.a(cVar.getNumber(), entry.getValue(), v1.a().d(entry.getValue().getClass()));
                    break;
                case 18:
                    e3Var.f(cVar.getNumber(), entry.getValue(), v1.a().d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f10245a[cVar.getLiteType().ordinal()]) {
            case 1:
                d2.R(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 2:
                d2.V(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 3:
                d2.Z(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 4:
                d2.i0(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 5:
                d2.Y(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 6:
                d2.U(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 7:
                d2.T(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 8:
                d2.P(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 9:
                d2.h0(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 10:
                d2.c0(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 11:
                d2.d0(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 12:
                d2.e0(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 13:
                d2.f0(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 14:
                d2.Y(cVar.getNumber(), (List) entry.getValue(), e3Var, cVar.isPacked());
                break;
            case 15:
                d2.Q(cVar.getNumber(), (List) entry.getValue(), e3Var);
                break;
            case 16:
                d2.g0(cVar.getNumber(), (List) entry.getValue(), e3Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    d2.X(cVar.getNumber(), (List) entry.getValue(), e3Var, v1.a().d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    d2.b0(cVar.getNumber(), (List) entry.getValue(), e3Var, v1.a().d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
