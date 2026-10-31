package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class r1<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    r1() {
    }

    private final void mergeFrom(B b10, j1 j1Var, int i10) throws IOException {
        while (j1Var.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b10, j1Var, i10)) {
        }
    }

    abstract void addFixed32(B b10, int i10, int i11);

    abstract void addFixed64(B b10, int i10, long j10);

    abstract void addGroup(B b10, int i10, T t10);

    abstract void addLengthDelimited(B b10, int i10, i iVar);

    abstract void addVarint(B b10, int i10, long j10);

    abstract B getBuilderFromMessage(Object obj);

    abstract T getFromMessage(Object obj);

    abstract int getSerializedSize(T t10);

    abstract int getSerializedSizeAsMessageSet(T t10);

    abstract void makeImmutable(Object obj);

    abstract T merge(T t10, T t11);

    final boolean mergeOneFieldFrom(B b10, j1 j1Var, int i10) throws IOException {
        int tag = j1Var.getTag();
        int tagFieldNumber = x1.getTagFieldNumber(tag);
        int tagWireType = x1.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b10, tagFieldNumber, j1Var.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b10, tagFieldNumber, j1Var.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b10, tagFieldNumber, j1Var.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b10, tagFieldNumber, j1Var.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = x1.makeTag(tagFieldNumber, 4);
        int i11 = i10 + 1;
        if (i11 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, j1Var, i11);
        if (iMakeTag != j1Var.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b10, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(Object obj, B b10);

    public void setRecursionLimit(int i10) {
        recursionLimit = i10;
    }

    abstract void setToMessage(Object obj, T t10);

    abstract boolean shouldDiscardUnknownFields(j1 j1Var);

    abstract T toImmutable(B b10);

    abstract void writeAsMessageSetTo(T t10, y1 y1Var) throws IOException;

    abstract void writeTo(T t10, y1 y1Var) throws IOException;
}
