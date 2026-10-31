package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes4.dex */
final class r extends q<y.f> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[x1.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[x1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    r() {
    }

    @Override // com.google.protobuf.q
    int extensionNumber(Map.Entry<?, ?> entry) {
        return ((y.f) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.q
    Object findExtensionByNumber(p pVar, s0 s0Var, int i10) {
        return pVar.findLiteExtensionByNumber(s0Var, i10);
    }

    @Override // com.google.protobuf.q
    u<y.f> getExtensions(Object obj) {
        return ((y.d) obj).extensions;
    }

    @Override // com.google.protobuf.q
    u<y.f> getMutableExtensions(Object obj) {
        return ((y.d) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.q
    boolean hasExtensions(s0 s0Var) {
        return s0Var instanceof y.d;
    }

    @Override // com.google.protobuf.q
    void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.q
    <UT, UB> UB parseExtension(Object obj, j1 j1Var, Object obj2, p pVar, u<y.f> uVar, UB ub2, r1<UT, UB> r1Var) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        y.g gVar = (y.g) obj2;
        int number = gVar.getNumber();
        if (gVar.descriptor.isRepeated() && gVar.descriptor.isPacked()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    j1Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    j1Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    j1Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    j1Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    j1Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    j1Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    j1Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    j1Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    j1Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    j1Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    j1Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    j1Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    j1Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    j1Var.readEnumList(arrayList);
                    ub2 = (UB) n1.filterUnknownEnumList(obj, number, arrayList, gVar.descriptor.getEnumType(), ub2, r1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + gVar.descriptor.getLiteType());
            }
            uVar.setField(gVar.descriptor, arrayList);
        } else {
            if (gVar.getLiteType() != x1.b.ENUM) {
                switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(j1Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(j1Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(j1Var.readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(j1Var.readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(j1Var.readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(j1Var.readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(j1Var.readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(j1Var.readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(j1Var.readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(j1Var.readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(j1Var.readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(j1Var.readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(j1Var.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = j1Var.readBytes();
                        break;
                    case 16:
                        objValueOf = j1Var.readString();
                        break;
                    case 17:
                        if (!gVar.isRepeated()) {
                            Object field2 = uVar.getField(gVar.descriptor);
                            if (field2 instanceof y) {
                                l1 l1VarSchemaFor = f1.getInstance().schemaFor(field2);
                                if (!((y) field2).isMutable()) {
                                    Object objNewInstance = l1VarSchemaFor.newInstance();
                                    l1VarSchemaFor.mergeFrom(objNewInstance, field2);
                                    uVar.setField(gVar.descriptor, objNewInstance);
                                    field2 = objNewInstance;
                                }
                                j1Var.mergeGroupField(field2, l1VarSchemaFor, pVar);
                                return ub2;
                            }
                        }
                        objValueOf = j1Var.readGroup(gVar.getMessageDefaultInstance().getClass(), pVar);
                        break;
                    case 18:
                        if (!gVar.isRepeated()) {
                            Object field3 = uVar.getField(gVar.descriptor);
                            if (field3 instanceof y) {
                                l1 l1VarSchemaFor2 = f1.getInstance().schemaFor(field3);
                                if (!((y) field3).isMutable()) {
                                    Object objNewInstance2 = l1VarSchemaFor2.newInstance();
                                    l1VarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                    uVar.setField(gVar.descriptor, objNewInstance2);
                                    field3 = objNewInstance2;
                                }
                                j1Var.mergeMessageField(field3, l1VarSchemaFor2, pVar);
                                return ub2;
                            }
                        }
                        objValueOf = j1Var.readMessage(gVar.getMessageDefaultInstance().getClass(), pVar);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = j1Var.readInt32();
                if (gVar.descriptor.getEnumType().findValueByNumber(int32) == null) {
                    return (UB) n1.storeUnknownEnum(obj, number, int32, ub2, r1Var);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (gVar.isRepeated()) {
                uVar.addRepeatedField(gVar.descriptor, objValueOf);
            } else {
                int i10 = a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()];
                if ((i10 == 17 || i10 == 18) && (field = uVar.getField(gVar.descriptor)) != null) {
                    objValueOf = a0.mergeMessage(field, objValueOf);
                }
                uVar.setField(gVar.descriptor, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.google.protobuf.q
    void parseLengthPrefixedMessageSetItem(j1 j1Var, Object obj, p pVar, u<y.f> uVar) throws IOException {
        y.g gVar = (y.g) obj;
        uVar.setField(gVar.descriptor, j1Var.readMessage(gVar.getMessageDefaultInstance().getClass(), pVar));
    }

    @Override // com.google.protobuf.q
    void parseMessageSetItem(i iVar, Object obj, p pVar, u<y.f> uVar) throws IOException {
        y.g gVar = (y.g) obj;
        s0.a aVarNewBuilderForType = gVar.getMessageDefaultInstance().newBuilderForType();
        j jVarNewCodedInput = iVar.newCodedInput();
        aVarNewBuilderForType.mergeFrom(jVarNewCodedInput, pVar);
        uVar.setField(gVar.descriptor, aVarNewBuilderForType.buildPartial());
        jVarNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.q
    void serializeExtension(y1 y1Var, Map.Entry<?, ?> entry) throws IOException {
        y.f fVar = (y.f) entry.getKey();
        if (!fVar.isRepeated()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fVar.getLiteType().ordinal()]) {
                case 1:
                    y1Var.writeDouble(fVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    y1Var.writeFloat(fVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    y1Var.writeInt64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    y1Var.writeUInt64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    y1Var.writeInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    y1Var.writeFixed64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    y1Var.writeFixed32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    y1Var.writeBool(fVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    y1Var.writeUInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    y1Var.writeSFixed32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    y1Var.writeSFixed64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    y1Var.writeSInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    y1Var.writeSInt64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    y1Var.writeInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    y1Var.writeBytes(fVar.getNumber(), (i) entry.getValue());
                    break;
                case 16:
                    y1Var.writeString(fVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    y1Var.writeGroup(fVar.getNumber(), entry.getValue(), f1.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 18:
                    y1Var.writeMessage(fVar.getNumber(), entry.getValue(), f1.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fVar.getLiteType().ordinal()]) {
            case 1:
                n1.writeDoubleList(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 2:
                n1.writeFloatList(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 3:
                n1.writeInt64List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 4:
                n1.writeUInt64List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 5:
                n1.writeInt32List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 6:
                n1.writeFixed64List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 7:
                n1.writeFixed32List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 8:
                n1.writeBoolList(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 9:
                n1.writeUInt32List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 10:
                n1.writeSFixed32List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 11:
                n1.writeSFixed64List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 12:
                n1.writeSInt32List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 13:
                n1.writeSInt64List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 14:
                n1.writeInt32List(fVar.getNumber(), (List) entry.getValue(), y1Var, fVar.isPacked());
                break;
            case 15:
                n1.writeBytesList(fVar.getNumber(), (List) entry.getValue(), y1Var);
                break;
            case 16:
                n1.writeStringList(fVar.getNumber(), (List) entry.getValue(), y1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    n1.writeGroupList(fVar.getNumber(), (List) entry.getValue(), y1Var, f1.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    n1.writeMessageList(fVar.getNumber(), (List) entry.getValue(), y1Var, f1.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // com.google.protobuf.q
    void setExtensions(Object obj, u<y.f> uVar) {
        ((y.d) obj).extensions = uVar;
    }
}
