package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: UnknownFieldSetLite.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 {
    private static final s1 DEFAULT_INSTANCE = new s1(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private s1() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i10) {
        int[] iArr = this.tags;
        if (i10 > iArr.length) {
            int i11 = this.count;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i10);
            this.objects = Arrays.copyOf(this.objects, i10);
        }
    }

    public static s1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private s1 mergeFrom(j jVar) throws IOException {
        int tag;
        do {
            tag = jVar.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, jVar));
        return this;
    }

    static s1 mutableCopyOf(s1 s1Var, s1 s1Var2) {
        int i10 = s1Var.count + s1Var2.count;
        int[] iArrCopyOf = Arrays.copyOf(s1Var.tags, i10);
        System.arraycopy(s1Var2.tags, 0, iArrCopyOf, s1Var.count, s1Var2.count);
        Object[] objArrCopyOf = Arrays.copyOf(s1Var.objects, i10);
        System.arraycopy(s1Var2.objects, 0, objArrCopyOf, s1Var.count, s1Var2.count);
        return new s1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static s1 newInstance() {
        return new s1();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i10, Object obj, y1 y1Var) throws IOException {
        int tagFieldNumber = x1.getTagFieldNumber(i10);
        int tagWireType = x1.getTagWireType(i10);
        if (tagWireType == 0) {
            y1Var.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            y1Var.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            y1Var.writeBytes(tagFieldNumber, (i) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            y1Var.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else if (y1Var.fieldOrder() == y1.a.ASCENDING) {
            y1Var.writeStartGroup(tagFieldNumber);
            ((s1) obj).writeTo(y1Var);
            y1Var.writeEndGroup(tagFieldNumber);
        } else {
            y1Var.writeEndGroup(tagFieldNumber);
            ((s1) obj).writeTo(y1Var);
            y1Var.writeStartGroup(tagFieldNumber);
        }
    }

    void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        int i10 = this.count;
        return i10 == s1Var.count && tagsEquals(this.tags, s1Var.tags, i10) && objectsEquals(this.objects, s1Var.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i10 = this.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.count; i12++) {
            int i13 = this.tags[i12];
            int tagFieldNumber = x1.getTagFieldNumber(i13);
            int tagWireType = x1.getTagWireType(i13);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i12]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i12]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (i) this.objects[i12]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((s1) this.objects[i12]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i12]).intValue());
            }
            i11 += iComputeUInt64Size;
        }
        this.memoizedSerializedSize = i11;
        return i11;
    }

    public int getSerializedSizeAsMessageSet() {
        int i10 = this.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(x1.getTagFieldNumber(this.tags[i11]), (i) this.objects[i11]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    boolean mergeFieldFrom(int i10, j jVar) throws IOException {
        checkMutable();
        int tagFieldNumber = x1.getTagFieldNumber(i10);
        int tagWireType = x1.getTagWireType(i10);
        if (tagWireType == 0) {
            storeField(i10, Long.valueOf(jVar.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i10, Long.valueOf(jVar.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i10, jVar.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            s1 s1Var = new s1();
            s1Var.mergeFrom(jVar);
            jVar.checkLastTagWas(x1.makeTag(tagFieldNumber, 4));
            storeField(i10, s1Var);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(i10, Integer.valueOf(jVar.readFixed32()));
        return true;
    }

    s1 mergeLengthDelimitedField(int i10, i iVar) {
        checkMutable();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(x1.makeTag(i10, 2), iVar);
        return this;
    }

    s1 mergeVarintField(int i10, int i11) {
        checkMutable();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(x1.makeTag(i10, 0), Long.valueOf(i11));
        return this;
    }

    final void printWithIndent(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.count; i11++) {
            u0.printField(sb2, i10, String.valueOf(x1.getTagFieldNumber(this.tags[i11])), this.objects[i11]);
        }
    }

    void storeField(int i10, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i11 = this.count;
        iArr[i11] = i10;
        this.objects[i11] = obj;
        this.count = i11 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.count; i10++) {
            codedOutputStream.writeRawMessageSetExtension(x1.getTagFieldNumber(this.tags[i10]), (i) this.objects[i10]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.count; i10++) {
            int i11 = this.tags[i10];
            int tagFieldNumber = x1.getTagFieldNumber(i11);
            int tagWireType = x1.getTagWireType(i11);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (i) this.objects[i10]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((s1) this.objects[i10]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i10]).intValue());
            }
        }
    }

    private s1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.memoizedSerializedSize = -1;
        this.count = i10;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z10;
    }

    private static int hashCode(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i10 = this.count;
        return ((((527 + i10) * 31) + hashCode(this.tags, i10)) * 31) + hashCode(this.objects, this.count);
    }

    s1 mergeFrom(s1 s1Var) {
        if (s1Var.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i10 = this.count + s1Var.count;
        ensureCapacity(i10);
        System.arraycopy(s1Var.tags, 0, this.tags, this.count, s1Var.count);
        System.arraycopy(s1Var.objects, 0, this.objects, this.count, s1Var.count);
        this.count = i10;
        return this;
    }

    void writeAsMessageSetTo(y1 y1Var) throws IOException {
        if (y1Var.fieldOrder() == y1.a.DESCENDING) {
            for (int i10 = this.count - 1; i10 >= 0; i10--) {
                y1Var.writeMessageSetItem(x1.getTagFieldNumber(this.tags[i10]), this.objects[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.count; i11++) {
            y1Var.writeMessageSetItem(x1.getTagFieldNumber(this.tags[i11]), this.objects[i11]);
        }
    }

    public void writeTo(y1 y1Var) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (y1Var.fieldOrder() == y1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.count; i10++) {
                writeField(this.tags[i10], this.objects[i10], y1Var);
            }
            return;
        }
        for (int i11 = this.count - 1; i11 >= 0; i11--) {
            writeField(this.tags[i11], this.objects[i11], y1Var);
        }
    }
}
