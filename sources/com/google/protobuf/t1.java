package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes4.dex */
class t1 extends r1<s1, s1> {
    t1() {
    }

    @Override // com.google.protobuf.r1
    void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    @Override // com.google.protobuf.r1
    boolean shouldDiscardUnknownFields(j1 j1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void addFixed32(s1 s1Var, int i10, int i11) {
        s1Var.storeField(x1.makeTag(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void addFixed64(s1 s1Var, int i10, long j10) {
        s1Var.storeField(x1.makeTag(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void addGroup(s1 s1Var, int i10, s1 s1Var2) {
        s1Var.storeField(x1.makeTag(i10, 3), s1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void addLengthDelimited(s1 s1Var, int i10, i iVar) {
        s1Var.storeField(x1.makeTag(i10, 2), iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void addVarint(s1 s1Var, int i10, long j10) {
        s1Var.storeField(x1.makeTag(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.r1
    public s1 getBuilderFromMessage(Object obj) {
        s1 fromMessage = getFromMessage(obj);
        if (fromMessage != s1.getDefaultInstance()) {
            return fromMessage;
        }
        s1 s1VarNewInstance = s1.newInstance();
        setToMessage(obj, s1VarNewInstance);
        return s1VarNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.r1
    public s1 getFromMessage(Object obj) {
        return ((y) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public int getSerializedSize(s1 s1Var) {
        return s1Var.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public int getSerializedSizeAsMessageSet(s1 s1Var) {
        return s1Var.getSerializedSizeAsMessageSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public s1 merge(s1 s1Var, s1 s1Var2) {
        if (s1.getDefaultInstance().equals(s1Var2)) {
            return s1Var;
        }
        return s1.getDefaultInstance().equals(s1Var) ? s1.mutableCopyOf(s1Var, s1Var2) : s1Var.mergeFrom(s1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.r1
    public s1 newBuilder() {
        return s1.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void setBuilderToMessage(Object obj, s1 s1Var) {
        setToMessage(obj, s1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void setToMessage(Object obj, s1 s1Var) {
        ((y) obj).unknownFields = s1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public s1 toImmutable(s1 s1Var) {
        s1Var.makeImmutable();
        return s1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void writeAsMessageSetTo(s1 s1Var, y1 y1Var) throws IOException {
        s1Var.writeAsMessageSetTo(y1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r1
    public void writeTo(s1 s1Var, y1 y1Var) throws IOException {
        s1Var.writeTo(y1Var);
    }
}
