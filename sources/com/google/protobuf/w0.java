package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes4.dex */
final class w0<T> implements l1<T> {
    private final s0 defaultInstance;
    private final q<?> extensionSchema;
    private final boolean hasExtensions;
    private final r1<?, ?> unknownFieldSchema;

    private w0(r1<?, ?> r1Var, q<?> qVar, s0 s0Var) {
        this.unknownFieldSchema = r1Var;
        this.hasExtensions = qVar.hasExtensions(s0Var);
        this.extensionSchema = qVar;
        this.defaultInstance = s0Var;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(r1<UT, UB> r1Var, T t10) {
        return r1Var.getSerializedSizeAsMessageSet(r1Var.getFromMessage(t10));
    }

    private <UT, UB, ET extends u.c<ET>> void mergeFromHelper(r1<UT, UB> r1Var, q<ET> qVar, T t10, j1 j1Var, p pVar) throws IOException {
        UB builderFromMessage = r1Var.getBuilderFromMessage(t10);
        u<ET> mutableExtensions = qVar.getMutableExtensions(t10);
        while (j1Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(j1Var, pVar, qVar, mutableExtensions, r1Var, builderFromMessage)) {
                    return;
                }
            } finally {
                r1Var.setBuilderToMessage(t10, builderFromMessage);
            }
        }
    }

    static <T> w0<T> newSchema(r1<?, ?> r1Var, q<?> qVar, s0 s0Var) {
        return new w0<>(r1Var, qVar, s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends u.c<ET>> boolean parseMessageSetItemOrUnknownField(j1 j1Var, p pVar, q<ET> qVar, u<ET> uVar, r1<UT, UB> r1Var, UB ub2) throws IOException {
        int tag = j1Var.getTag();
        int uInt32 = 0;
        if (tag != x1.MESSAGE_SET_ITEM_TAG) {
            if (x1.getTagWireType(tag) != 2) {
                return j1Var.skipField();
            }
            Object objFindExtensionByNumber = qVar.findExtensionByNumber(pVar, this.defaultInstance, x1.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return r1Var.mergeOneFieldFrom(ub2, j1Var, 0);
            }
            qVar.parseLengthPrefixedMessageSetItem(j1Var, objFindExtensionByNumber, pVar, uVar);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        i bytes = null;
        while (j1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = j1Var.getTag();
            if (tag2 == x1.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = j1Var.readUInt32();
                objFindExtensionByNumber2 = qVar.findExtensionByNumber(pVar, this.defaultInstance, uInt32);
            } else if (tag2 == x1.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    qVar.parseLengthPrefixedMessageSetItem(j1Var, objFindExtensionByNumber2, pVar, uVar);
                } else {
                    bytes = j1Var.readBytes();
                }
            } else if (!j1Var.skipField()) {
                break;
            }
        }
        if (j1Var.getTag() != x1.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                qVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, pVar, uVar);
            } else {
                r1Var.addLengthDelimited(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(r1<UT, UB> r1Var, T t10, y1 y1Var) throws IOException {
        r1Var.writeAsMessageSetTo(r1Var.getFromMessage(t10), y1Var);
    }

    @Override // com.google.protobuf.l1
    public boolean equals(T t10, T t11) {
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize(T t10) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10) + 0;
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.l1
    public int hashCode(T t10) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.l1
    public final boolean isInitialized(T t10) {
        return this.extensionSchema.getExtensions(t10).isInitialized();
    }

    @Override // com.google.protobuf.l1
    public void makeImmutable(T t10) {
        this.unknownFieldSchema.makeImmutable(t10);
        this.extensionSchema.makeImmutable(t10);
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(T t10, T t11) {
        n1.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            n1.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // com.google.protobuf.l1
    public T newInstance() {
        s0 s0Var = this.defaultInstance;
        return s0Var instanceof y ? (T) ((y) s0Var).newMutableInstance() : (T) s0Var.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.l1
    public void writeTo(T t10, y1 y1Var) throws IOException {
        for (T t11 : this.extensionSchema.getExtensions(t10)) {
            u.c cVar = (u.c) t11.getKey();
            if (cVar.getLiteJavaType() != x1.c.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t11 instanceof e0.b) {
                y1Var.writeMessageSetItem(cVar.getNumber(), ((e0.b) t11).getField().toByteString());
            } else {
                y1Var.writeMessageSetItem(cVar.getNumber(), t11.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t10, y1Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, e.b bVar) throws IOException {
        y yVar = (y) t10;
        s1 s1VarNewInstance = yVar.unknownFields;
        if (s1VarNewInstance == s1.getDefaultInstance()) {
            s1VarNewInstance = s1.newInstance();
            yVar.unknownFields = s1VarNewInstance;
        }
        u<y.f> uVarEnsureExtensionsAreMutable = ((y.d) t10).ensureExtensionsAreMutable();
        y.g gVar = null;
        while (i10 < i11) {
            int iDecodeVarint32 = e.decodeVarint32(bArr, i10, bVar);
            int i12 = bVar.int1;
            if (i12 == x1.MESSAGE_SET_ITEM_TAG) {
                int i13 = 0;
                i iVar = null;
                while (iDecodeVarint32 < i11) {
                    iDecodeVarint32 = e.decodeVarint32(bArr, iDecodeVarint32, bVar);
                    int i14 = bVar.int1;
                    int tagFieldNumber = x1.getTagFieldNumber(i14);
                    int tagWireType = x1.getTagWireType(i14);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (gVar != null) {
                                iDecodeVarint32 = e.decodeMessageField(f1.getInstance().schemaFor((Class) gVar.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i11, bVar);
                                uVarEnsureExtensionsAreMutable.setField(gVar.descriptor, bVar.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint32 = e.decodeBytes(bArr, iDecodeVarint32, bVar);
                                iVar = (i) bVar.object1;
                            }
                        }
                        if (i14 == x1.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint32 = e.skipField(i14, bArr, iDecodeVarint32, i11, bVar);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint32 = e.decodeVarint32(bArr, iDecodeVarint32, bVar);
                        i13 = bVar.int1;
                        gVar = (y.g) this.extensionSchema.findExtensionByNumber(bVar.extensionRegistry, this.defaultInstance, i13);
                    } else {
                        if (i14 == x1.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint32 = e.skipField(i14, bArr, iDecodeVarint32, i11, bVar);
                    }
                }
                if (iVar != null) {
                    s1VarNewInstance.storeField(x1.makeTag(i13, 2), iVar);
                }
                i10 = iDecodeVarint32;
            } else if (x1.getTagWireType(i12) == 2) {
                y.g gVar2 = (y.g) this.extensionSchema.findExtensionByNumber(bVar.extensionRegistry, this.defaultInstance, x1.getTagFieldNumber(i12));
                if (gVar2 != null) {
                    i10 = e.decodeMessageField(f1.getInstance().schemaFor((Class) gVar2.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i11, bVar);
                    uVarEnsureExtensionsAreMutable.setField(gVar2.descriptor, bVar.object1);
                } else {
                    i10 = e.decodeUnknownField(i12, bArr, iDecodeVarint32, i11, s1VarNewInstance, bVar);
                }
                gVar = gVar2;
            } else {
                i10 = e.skipField(i12, bArr, iDecodeVarint32, i11, bVar);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(T t10, j1 j1Var, p pVar) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, j1Var, pVar);
    }
}
