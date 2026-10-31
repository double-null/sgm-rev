package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Schema.java */
/* JADX INFO: loaded from: classes4.dex */
interface l1<T> {
    boolean equals(T t10, T t11);

    int getSerializedSize(T t10);

    int hashCode(T t10);

    boolean isInitialized(T t10);

    void makeImmutable(T t10);

    void mergeFrom(T t10, j1 j1Var, p pVar) throws IOException;

    void mergeFrom(T t10, T t11);

    void mergeFrom(T t10, byte[] bArr, int i10, int i11, e.b bVar) throws IOException;

    T newInstance();

    void writeTo(T t10, y1 y1Var) throws IOException;
}
