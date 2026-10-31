package com.explorestack.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaFull.java */
/* JADX INFO: loaded from: classes.dex */
final class a0 extends z<Descriptors.FieldDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f10170a = k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10171b = 0;

    /* JADX INFO: compiled from: ExtensionSchemaFull.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10172a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10172a = iArr;
            try {
                iArr[c3.b.f10254c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10172a[c3.b.f10255d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10172a[c3.b.f10256e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10172a[c3.b.f10257f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10172a[c3.b.f10258g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10172a[c3.b.f10259h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10172a[c3.b.f10260i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10172a[c3.b.f10261j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10172a[c3.b.f10266o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10172a[c3.b.f10268q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10172a[c3.b.f10269r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10172a[c3.b.f10270s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10172a[c3.b.f10271t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10172a[c3.b.f10267p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10172a[c3.b.f10265n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10172a[c3.b.f10262k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10172a[c3.b.f10263l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10172a[c3.b.f10264m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    a0() {
    }

    private static <T> long k() {
        try {
            return z2.M(j0.e.class.getDeclaredField("a"));
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    @Override // com.explorestack.protobuf.z
    int a(Map.Entry<?, ?> entry) {
        return ((Descriptors.FieldDescriptor) entry.getKey()).getNumber();
    }

    @Override // com.explorestack.protobuf.z
    Object b(y yVar, MessageLite messageLite, int i10) {
        return ((w) yVar).d(((Message) messageLite).getDescriptorForType(), i10);
    }

    @Override // com.explorestack.protobuf.z
    public e0<Descriptors.FieldDescriptor> c(Object obj) {
        return (e0) z2.G(obj, f10170a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.z
    e0<Descriptors.FieldDescriptor> d(Object obj) {
        e0<Descriptors.FieldDescriptor> e0VarC = c(obj);
        if (!e0VarC.C()) {
            return e0VarC;
        }
        e0 e0VarClone = e0VarC.clone();
        l(obj, e0VarClone);
        return e0VarClone;
    }

    @Override // com.explorestack.protobuf.z
    boolean e(MessageLite messageLite) {
        return messageLite instanceof j0.e;
    }

    @Override // com.explorestack.protobuf.z
    void f(Object obj) {
        c(obj).H();
    }

    @Override // com.explorestack.protobuf.z
    <UT, UB> UB g(y1 y1Var, Object obj, y yVar, e0<Descriptors.FieldDescriptor> e0Var, UB ub2, t2<UT, UB> t2Var) throws IOException {
        Object objValueOf;
        Object objT;
        ArrayList arrayList;
        ArrayList arrayList2;
        w.b bVar = (w.b) obj;
        int number = bVar.f10847a.getNumber();
        if (bVar.f10847a.isRepeated() && bVar.f10847a.isPacked()) {
            switch (a.f10172a[bVar.f10847a.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    y1Var.readDoubleList(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    y1Var.readFloatList(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    y1Var.readInt64List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    y1Var.readUInt64List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    y1Var.readInt32List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    y1Var.readFixed64List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    y1Var.readFixed32List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    y1Var.readBoolList(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    y1Var.readUInt32List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    y1Var.readSFixed32List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    y1Var.readSFixed64List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    y1Var.readSInt32List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    y1Var.readSInt64List(arrayList);
                    arrayList2 = arrayList;
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                case 14:
                    ArrayList arrayList3 = new ArrayList();
                    y1Var.readEnumList(arrayList3);
                    arrayList2 = new ArrayList();
                    Iterator<Integer> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        Descriptors.EnumValueDescriptor enumValueDescriptorFindValueByNumber = bVar.f10847a.m163getEnumType().findValueByNumber(iIntValue);
                        if (enumValueDescriptorFindValueByNumber != null) {
                            arrayList2.add(enumValueDescriptorFindValueByNumber);
                        } else {
                            ub2 = (UB) d2.M(number, iIntValue, ub2, t2Var);
                        }
                    }
                    e0Var.N(bVar.f10847a, arrayList2);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + bVar.f10847a.getLiteType());
            }
        } else {
            if (bVar.f10847a.getLiteType() != c3.b.f10267p) {
                switch (a.f10172a[bVar.f10847a.getLiteType().ordinal()]) {
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
                        objValueOf = y1Var.g(bVar.f10848b.getClass(), yVar);
                        break;
                    case 18:
                        objValueOf = y1Var.c(bVar.f10848b.getClass(), yVar);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = y1Var.readInt32();
                objValueOf = bVar.f10847a.m163getEnumType().findValueByNumber(int32);
                if (objValueOf == null) {
                    return (UB) d2.M(number, int32, ub2, t2Var);
                }
            }
            if (bVar.f10847a.isRepeated()) {
                e0Var.g(bVar.f10847a, objValueOf);
            } else {
                int i10 = a.f10172a[bVar.f10847a.getLiteType().ordinal()];
                if ((i10 == 17 || i10 == 18) && (objT = e0Var.t(bVar.f10847a)) != null) {
                    objValueOf = l0.k(objT, objValueOf);
                }
                e0Var.N(bVar.f10847a, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.explorestack.protobuf.z
    void h(y1 y1Var, Object obj, y yVar, e0<Descriptors.FieldDescriptor> e0Var) throws IOException {
        w.b bVar = (w.b) obj;
        if (!y.c()) {
            e0Var.N(bVar.f10847a, new o0(bVar.f10848b, yVar, y1Var.readBytes()));
        } else {
            e0Var.N(bVar.f10847a, y1Var.c(bVar.f10848b.getClass(), yVar));
        }
    }

    @Override // com.explorestack.protobuf.z
    void i(ByteString byteString, Object obj, y yVar, e0<Descriptors.FieldDescriptor> e0Var) throws IOException {
        w.b bVar = (w.b) obj;
        Message messageBuildPartial = bVar.f10848b.newBuilderForType().buildPartial();
        if (!y.c()) {
            e0Var.N(bVar.f10847a, new o0(bVar.f10848b, yVar, byteString));
            return;
        }
        h hVarH = h.h(ByteBuffer.wrap(byteString.toByteArray()), true);
        v1.a().b(messageBuildPartial, hVarH, yVar);
        e0Var.N(bVar.f10847a, messageBuildPartial);
        if (hVarH.getFieldNumber() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.explorestack.protobuf.z
    void j(e3 e3Var, Map.Entry<?, ?> entry) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
        if (!fieldDescriptor.isRepeated()) {
            switch (a.f10172a[fieldDescriptor.getLiteType().ordinal()]) {
                case 1:
                    e3Var.writeDouble(fieldDescriptor.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    e3Var.writeFloat(fieldDescriptor.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    e3Var.writeInt64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    e3Var.writeUInt64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    e3Var.writeInt32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    e3Var.writeFixed64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    e3Var.writeFixed32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    e3Var.writeBool(fieldDescriptor.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    e3Var.writeUInt32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    e3Var.writeSFixed32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    e3Var.writeSFixed64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    e3Var.writeSInt32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    e3Var.writeSInt64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    e3Var.writeInt32(fieldDescriptor.getNumber(), ((Descriptors.EnumValueDescriptor) entry.getValue()).getNumber());
                    break;
                case 15:
                    e3Var.c(fieldDescriptor.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    e3Var.writeString(fieldDescriptor.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    e3Var.writeGroup(fieldDescriptor.getNumber(), entry.getValue());
                    break;
                case 18:
                    e3Var.writeMessage(fieldDescriptor.getNumber(), entry.getValue());
                    break;
            }
        }
        switch (a.f10172a[fieldDescriptor.getLiteType().ordinal()]) {
            case 1:
                d2.R(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 2:
                d2.V(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 3:
                d2.Z(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 4:
                d2.i0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 5:
                d2.Y(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 6:
                d2.U(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 7:
                d2.T(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 8:
                d2.P(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 9:
                d2.h0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 10:
                d2.c0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 11:
                d2.d0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 12:
                d2.e0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 13:
                d2.f0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var, fieldDescriptor.isPacked());
                break;
            case 14:
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Descriptors.EnumValueDescriptor) it.next()).getNumber()));
                }
                d2.Y(fieldDescriptor.getNumber(), arrayList, e3Var, fieldDescriptor.isPacked());
                break;
            case 15:
                d2.Q(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var);
                break;
            case 16:
                d2.g0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var);
                break;
            case 17:
                d2.W(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var);
                break;
            case 18:
                d2.a0(fieldDescriptor.getNumber(), (List) entry.getValue(), e3Var);
                break;
        }
    }

    void l(Object obj, e0<Descriptors.FieldDescriptor> e0Var) {
        z2.X(obj, f10170a, e0Var);
    }
}
