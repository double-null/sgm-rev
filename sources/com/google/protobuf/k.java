package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class k implements j1 {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final j input;
    private int nextTag = 0;
    private int tag;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[x1.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[x1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private k(j jVar) {
        j jVar2 = (j) a0.checkNotNull(jVar, "input");
        this.input = jVar2;
        jVar2.wrapper = this;
    }

    public static k forCodedInput(j jVar) {
        k kVar = jVar.wrapper;
        return kVar != null ? kVar : new k(jVar);
    }

    private <T> void mergeGroupFieldInternal(T t10, l1<T> l1Var, p pVar) throws IOException {
        int i10 = this.endGroupTag;
        this.endGroupTag = x1.makeTag(x1.getTagFieldNumber(this.tag), 4);
        try {
            l1Var.mergeFrom(t10, this, pVar);
            if (this.tag != this.endGroupTag) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i10;
        } catch (Throwable th) {
            this.endGroupTag = i10;
            throw th;
        }
    }

    private <T> void mergeMessageFieldInternal(T t10, l1<T> l1Var, p pVar) throws IOException {
        int uInt32 = this.input.readUInt32();
        j jVar = this.input;
        if (jVar.recursionDepth >= jVar.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = jVar.pushLimit(uInt32);
        this.input.recursionDepth++;
        l1Var.mergeFrom(t10, this, pVar);
        this.input.checkLastTagWas(0);
        j jVar2 = this.input;
        jVar2.recursionDepth--;
        jVar2.popLimit(iPushLimit);
    }

    private Object readField(x1.b bVar, Class<?> cls, p pVar) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return readMessage(cls, pVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void requirePosition(int i10) throws IOException {
        if (this.input.getTotalBytesRead() != i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void requireWireType(int i10) throws IOException {
        if (x1.getTagWireType(this.tag) != i10) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void verifyPackedFixed32Length(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.j1
    public int getFieldNumber() throws IOException {
        int i10 = this.nextTag;
        if (i10 != 0) {
            this.tag = i10;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i11 = this.tag;
        if (i11 == 0 || i11 == this.endGroupTag) {
            return Integer.MAX_VALUE;
        }
        return x1.getTagFieldNumber(i11);
    }

    @Override // com.google.protobuf.j1
    public int getTag() {
        return this.tag;
    }

    @Override // com.google.protobuf.j1
    public <T> void mergeGroupField(T t10, l1<T> l1Var, p pVar) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t10, l1Var, pVar);
    }

    @Override // com.google.protobuf.j1
    public <T> void mergeMessageField(T t10, l1<T> l1Var, p pVar) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t10, l1Var, pVar);
    }

    @Override // com.google.protobuf.j1
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // com.google.protobuf.j1
    public void readBoolList(List<Boolean> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof f)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(this.input.readBool()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Boolean.valueOf(this.input.readBool()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        f fVar = (f) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                fVar.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            fVar.addBoolean(this.input.readBool());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public i readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // com.google.protobuf.j1
    public void readBytesList(List<i> list) throws IOException {
        int tag;
        if (x1.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == this.tag);
        this.nextTag = tag;
    }

    @Override // com.google.protobuf.j1
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // com.google.protobuf.j1
    public void readDoubleList(List<Double> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof m)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(this.input.readDouble()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(this.input.readDouble()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        m mVar = (m) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                mVar.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt33);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
        do {
            mVar.addDouble(this.input.readDouble());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // com.google.protobuf.j1
    public void readEnumList(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof z)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readEnum()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readEnum()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        z zVar = (z) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                zVar.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            zVar.addInt(this.input.readEnum());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // com.google.protobuf.j1
    public void readFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof z)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.input.readFixed32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        z zVar = (z) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                zVar.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            zVar.addInt(this.input.readFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.j1
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // com.google.protobuf.j1
    public void readFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof j0)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.input.readFixed64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.input.readFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        j0 j0Var = (j0) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                j0Var.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt33);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
        do {
            j0Var.addLong(this.input.readFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // com.google.protobuf.j1
    public void readFloatList(List<Float> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof w)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(this.input.readFloat()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        w wVar = (w) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                wVar.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            wVar.addFloat(this.input.readFloat());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.j1
    @Deprecated
    public <T> T readGroup(Class<T> cls, p pVar) throws IOException {
        requireWireType(3);
        return (T) readGroup(f1.getInstance().schemaFor((Class) cls), pVar);
    }

    @Override // com.google.protobuf.j1
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(l1<T> l1Var, p pVar) throws IOException {
        requireWireType(3);
        return (T) readGroup(l1Var, pVar);
    }

    @Override // com.google.protobuf.j1
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, p pVar) throws IOException {
        readGroupList(list, f1.getInstance().schemaFor((Class) cls), pVar);
    }

    @Override // com.google.protobuf.j1
    public int readInt32() throws IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // com.google.protobuf.j1
    public void readInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof z)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        z zVar = (z) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                zVar.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            zVar.addInt(this.input.readInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // com.google.protobuf.j1
    public void readInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof j0)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        j0 j0Var = (j0) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                j0Var.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            j0Var.addLong(this.input.readInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.j1
    public <K, V> void readMap(Map<K, V> map, l0.b<K, V> bVar, p pVar) throws IOException {
        requireWireType(2);
        int iPushLimit = this.input.pushLimit(this.input.readUInt32());
        Object field = bVar.defaultKey;
        Object field2 = bVar.defaultValue;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.input.isAtEnd()) {
                    break;
                }
                if (fieldNumber == 1) {
                    field = readField(bVar.keyType, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    field2 = readField(bVar.valueType, bVar.defaultValue.getClass(), pVar);
                }
            } catch (Throwable th) {
                this.input.popLimit(iPushLimit);
                throw th;
            }
        }
        map.put(field, field2);
        this.input.popLimit(iPushLimit);
    }

    @Override // com.google.protobuf.j1
    public <T> T readMessage(Class<T> cls, p pVar) throws IOException {
        requireWireType(2);
        return (T) readMessage(f1.getInstance().schemaFor((Class) cls), pVar);
    }

    @Override // com.google.protobuf.j1
    public <T> T readMessageBySchemaWithCheck(l1<T> l1Var, p pVar) throws IOException {
        requireWireType(2);
        return (T) readMessage(l1Var, pVar);
    }

    @Override // com.google.protobuf.j1
    public <T> void readMessageList(List<T> list, Class<T> cls, p pVar) throws IOException {
        readMessageList(list, f1.getInstance().schemaFor((Class) cls), pVar);
    }

    @Override // com.google.protobuf.j1
    public int readSFixed32() throws IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // com.google.protobuf.j1
    public void readSFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof z)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.input.readSFixed32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        z zVar = (z) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                zVar.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            zVar.addInt(this.input.readSFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.j1
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // com.google.protobuf.j1
    public void readSFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof j0)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.input.readSFixed64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.input.readSFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        j0 j0Var = (j0) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                j0Var.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt33);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
        do {
            j0Var.addLong(this.input.readSFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // com.google.protobuf.j1
    public void readSInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof z)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readSInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readSInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        z zVar = (z) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                zVar.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            zVar.addInt(this.input.readSInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // com.google.protobuf.j1
    public void readSInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof j0)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readSInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readSInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        j0 j0Var = (j0) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                j0Var.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            j0Var.addLong(this.input.readSInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // com.google.protobuf.j1
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z10) throws IOException {
        int tag;
        int tag2;
        if (x1.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof h0) || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        h0 h0Var = (h0) list;
        do {
            h0Var.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.j1
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // com.google.protobuf.j1
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // com.google.protobuf.j1
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // com.google.protobuf.j1
    public void readUInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof z)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readUInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readUInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        z zVar = (z) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                zVar.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            zVar.addInt(this.input.readUInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // com.google.protobuf.j1
    public void readUInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof j0)) {
            int tagWireType = x1.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readUInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readUInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        j0 j0Var = (j0) list;
        int tagWireType2 = x1.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                j0Var.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            j0Var.addLong(this.input.readUInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.j1
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // com.google.protobuf.j1
    public boolean skipField() throws IOException {
        int i10;
        if (this.input.isAtEnd() || (i10 = this.tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i10);
    }

    private <T> T readGroup(l1<T> l1Var, p pVar) throws IOException {
        T tNewInstance = l1Var.newInstance();
        mergeGroupFieldInternal(tNewInstance, l1Var, pVar);
        l1Var.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private <T> T readMessage(l1<T> l1Var, p pVar) throws IOException {
        T tNewInstance = l1Var.newInstance();
        mergeMessageFieldInternal(tNewInstance, l1Var, pVar);
        l1Var.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.j1
    @Deprecated
    public <T> void readGroupList(List<T> list, l1<T> l1Var, p pVar) throws IOException {
        int tag;
        if (x1.getTagWireType(this.tag) == 3) {
            int i10 = this.tag;
            do {
                list.add(readGroup(l1Var, pVar));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == i10);
            this.nextTag = tag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.j1
    public <T> void readMessageList(List<T> list, l1<T> l1Var, p pVar) throws IOException {
        int tag;
        if (x1.getTagWireType(this.tag) == 2) {
            int i10 = this.tag;
            do {
                list.add(readMessage(l1Var, pVar));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == i10);
            this.nextTag = tag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
